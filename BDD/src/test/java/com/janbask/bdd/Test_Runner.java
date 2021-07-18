package com.janbask.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
features={"resources\\Features\\Login.feature"},
glue={"StepDefiniton","Util"})
//tags= {"@All"})
public class Test_Runner {

}
