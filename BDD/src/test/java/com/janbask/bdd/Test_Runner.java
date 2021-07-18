package com.janbask.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
features={"resources\\Features\\compose.feature"},
glue={"StepDefiniton","Util"},
plugin={ "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
tags= {"@All"})
public class Test_Runner {

}
