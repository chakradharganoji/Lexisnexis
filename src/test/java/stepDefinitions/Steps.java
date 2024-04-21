package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Text;
import pageObjects.SearchResultsPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Steps {

    public WebDriver driver = new ChromeDriver();
    public SearchResultsPage srp;

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user") + "//Drivers/chromedriver.exe");
        srp = new SearchResultsPage(driver);

    }

    @When("user opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        element.click();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) {
        if (driver.getTitle().contains("LexisNexis Risk Solutions | Transform Your Risk Decision Making")) {
            driver.close();
            Assert.assertTrue(true);
        } else {
            Assert.assertEquals(string, driver.getTitle());

        }


    }


    @When("User click on About Us link")
    public void user_click_on_about_us_link() {
        driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[4]/ul/li/div/div/div/div[2]/div[4]/div[2]/div[2]/a[2]")));
        a.click();

    }

    public void title_of_should_match_lexis_nexis_risk_solutions_transform_your_risk_decession_making() {
        if (driver.getTitle().contains("LexisNexis Risk Solutions | Transform Your Risk Decision Making")) {
            driver.close();
            Assert.assertTrue(true);
        }

    }


    public void user_click_on_careers_link() {
        srp.clickCareers();

    }


    @When("User click on Search All Jobs link")
    public void user_click_on_search_all_jobs_link() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        srp.clickSearchAllJobs();

    }

    @When("User enter Text as {string} in the search box and click")
    public void user_enter_text_as_in_the_search_box_and_click(String string) {
        srp.setBtnSearchJob(string);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        srp.clickbtnSearch();

    }

    @Then("one or more search results should be returned")
    public void one_or_more_search_results_should_be_returned() {
        int resultsCount = driver.findElements(By.cssSelector(".search-results-item")).size();
        Assert.assertTrue(resultsCount >= 1);


    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }
}

