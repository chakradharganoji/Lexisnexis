package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions
        (
               // features ="/Users/poonamgautam/Desktop/Lexisnexis/src/test/java/Features/ElementsClickable.feature",
                features ="/Users/poonamgautam/Desktop/Lexisnexis/src/test/java/Features/Searchalljobs.feature",

                glue ="stepDefinitions",
                plugin = {"pretty","html:target/cucumber-reports",
                        },
                monochrome = true
        )
public class TestRun {
}
