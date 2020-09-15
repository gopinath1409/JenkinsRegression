package com.base;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonfile) {
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\report");
		
		Configuration configuration = new Configuration(loc, "Adactin Hotel Automation");
		configuration.addClassifications("sprint","20");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("Env","UAT");
		configuration.addClassifications("OS","win-8");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);
		
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		
		
		
	}

}
