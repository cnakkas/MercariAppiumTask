package com.mercari.automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/mercari/automation/step_definitions",
        dryRun = false,
        tags = "@comment_actions or @comment",
        plugin = {"json:target/cucumber.json"}
)
public class CukesRunner {
}
