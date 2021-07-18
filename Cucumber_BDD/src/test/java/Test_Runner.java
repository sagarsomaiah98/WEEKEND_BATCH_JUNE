

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
features={"src\\main\\java\\Features\\Multi_Login.feature"},
glue={"StepDefinition"})

public class Test_Runner {

}
