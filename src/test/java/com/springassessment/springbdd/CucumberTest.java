package com.springassessment.springbdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.springassessment.springbdd",
        plugin = {"pretty"} // Keep this as "pretty" to force the console output
)
public class CucumberTest {
}