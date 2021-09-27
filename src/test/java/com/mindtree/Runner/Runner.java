package com.mindtree.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Users\\sridh\\eclipse-workspace\\UrbanLadderbdderBDD\\src\\test\\java\\features\\SignUp.feature",
		glue = "CucumberOptions",
		dryRun= false,
		monochrome=true
		)

public class Runner {
	
}