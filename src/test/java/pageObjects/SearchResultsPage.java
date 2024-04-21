package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

import java.time.Duration;
import java.util.ArrayList;

public class SearchResultsPage extends PageObject {

    @FindBy(id = "onetrust-accept-btn-handler")
    @CacheLookup
    private WebElement btnAccept;

    @FindBy(tagName = "h4")
    @CacheLookup
    WebElement btnAboutus;

    @FindBy(css = "body > div.page-wrapper.sub-nav-visible > div.score-stripe.fixed-subnav > div > div > div > a")
    @CacheLookup
    WebElement btnCareers;

    @FindBy(partialLinkText = "Search all jobs")
    @CacheLookup
    WebElement btnSearchAllJobs;


    @FindBy(id = "search-box-d3ba3a32752d48908f4061d0129326bf")
    @CacheLookup
    WebElement txtSearchJob;

    @FindBy(id = "search-box-button")
    @CacheLookup
    WebElement btnSearch;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public void clickAboutus() {
        btnAboutus.click();
    }

    public void clickAccept() {
        btnAccept.click();
    }

    public void clickCareers() {
        btnCareers.click();
    }

    public void clickSearchAllJobs() {
        btnSearchAllJobs.click();
    }

    public void setBtnSearchJob(String Text) {
        txtSearchJob.clear();
        txtSearchJob.sendKeys(Text);
    }

    public void clickbtnSearch() {
        btnSearch.click();
    }
}
