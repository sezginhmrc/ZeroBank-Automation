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
                             // atributes as a parameter defined here to execute test scenarios

        glue = "com/zerobank/stepdefinitions",                    // PATH FOR STEP DEFINITIONS
        features = "src/test/resources",            // PATH FOR FEATURE DIRECTORY
        dryRun = false,                                      // ALLOWS CUCUMBER TO GENEREATE STEP_DEFINITIONS IN OUTPUT
                                                            // TO MAKE SURE EVERY STEP HAS CODE IMPLEMNATATION
        strict = false,
        tags = "@AA",                                    // to be able to run speficif test scenarios as a tag ignore others
                                                           // or not @tag execute all of them not only speficifed tag
        plugin = {"html:target/default-report",
                "json:target/cucumber-report.json"
        }



)
// this CukesRunner class allows us to kick off cucumber test
// by providing  paths through cucumber options.
// what features you wwant to test
public class CucumberRunner {
}
