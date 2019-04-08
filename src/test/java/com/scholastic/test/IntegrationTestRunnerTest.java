package com.scholastic.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		features ={"src/test/resources"},
		format={"json:output/result.json"},
		tags={"~@ignore"}

)

public class IntegrationTestRunnerTest 
{

}
