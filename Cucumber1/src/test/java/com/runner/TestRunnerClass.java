package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;
import com.base.LibGlobal;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {"com.stepdefinition"}, dryRun = false, monochrome = true, 
plugin = {"pretty", "junit:src\\test\\resources\\report\\testreport1.xml",
		"json:src\\test\\resources\\report\\testreport1.json",
		"html:src\\test\\resources\\report"},
snippets=SnippetType.CAMELCASE,
strict=true)


public class TestRunnerClass extends LibGlobal {
	
//	@AfterClass
	public static void afetrclass() {
	//	JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\report\\testreport1.json");
	driver.quit();

//	}
	
	

}
}
