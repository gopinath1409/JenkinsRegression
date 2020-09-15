package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {"com.stepdefinition"}, dryRun = false, monochrome = true, plugin = {"pretty"},
snippets = SnippetType.CAMELCASE, strict = true, tags = {" @Smoke and @retest "})
public class TestRunnerClass {

}
