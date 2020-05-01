package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)    // Junit supports custom test execution, which is runwith annotion
                            // it comes from jUnit
                            // we neeed to speficy cucumber.class as a parameter


@CucumberOptions(           //  defining cucumber test parameters
                             // we can specify here location of step definitions and feature file
                             // we can also specify tags as to be able run specific scenarios

        glue = "src/test/java/com/zerobank/stepdefinitions",// PATH FOR STEP DEFINITIONS
        features = "src/test/resources/feature",            // PATH FOR FEATURE DIRECTORY
        dryRun = true,                                      // ALLOWS CUCUMBER TO GENEREATE STEP_DEFINITIONS IN OUTPUT
                                                            // TO MAKE SURE EVERY STEP HAS CODE IMPLEMNATATION
        strict = false,
        tags = "@Login_Feature",
        plugin = {

        }



)
// this CukesRunner class allows us to kick off cucumber test
// by providing  paths through cucumber options.
// what features you wwant to test
public class CukesRunner {
}
