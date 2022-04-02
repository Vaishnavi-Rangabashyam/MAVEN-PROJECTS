package com.cts.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources",glue="com.cts.automation.stepdef1",monochrome=true)
public class TestRunner1 {

}
