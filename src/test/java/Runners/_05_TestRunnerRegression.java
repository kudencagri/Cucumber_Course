package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //birden fazla taglı grup adı verilebilir              // or yazınca her iki ibareden biri olanı çalıştırır
        tags = "@SmokeTest or @Regression",                    // and yazınca her ikisi birden olanı çalıştırır.
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"}
)// Jenkins için JSON report

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
