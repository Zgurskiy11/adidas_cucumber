package com.demoblaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// Cukes runner java class. Finding Paths to features and StepDef
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",  // allows us to generate reports
        features = "src/test/resources/features",//not same directory. So we coming from source level
        glue = "com/demoblaze/step_definitions", //step definitions path. Runner and StepDef are on the same level
        dryRun =false
        //just run to see snippets. dryRun Allows us not to run actual implementation
      //  tags = "@wip"        // uses features path. line 10
)
public class CukesRunner {//

}
