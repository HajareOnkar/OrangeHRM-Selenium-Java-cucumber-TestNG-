package runner;

import genericLib.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "FeatureFile",
		glue = "stepDefination",
		tags="@passwordReset"
		
		
		)

public class RunnerFile extends BaseClass{

	
	
}
