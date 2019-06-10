package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/exercise1.feature", glue="cucumberProject" , plugin="json:target/cucumber.json"
                                                )
public class Runner {

	
	
}
