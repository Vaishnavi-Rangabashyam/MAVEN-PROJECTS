package com.cts.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources", dryRun=false,glue="com.cts.automation.stepdef",monochrome=true,
tags="@FlyusBooking"
)
public class TestRunner2 {

}
