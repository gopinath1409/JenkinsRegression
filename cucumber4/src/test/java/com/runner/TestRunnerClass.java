package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.LibGlobal;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources", glue = {"com.stepdefinition"}, dryRun = false)
public class TestRunnerClass extends LibGlobal   {
	
	@AfterClass
	public static void afterclass() {
	driver.quit();
	}

}

