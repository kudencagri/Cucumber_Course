package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature"},    // birden fazla test için
        glue={"StepDefinitions"}

)
public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {
}
