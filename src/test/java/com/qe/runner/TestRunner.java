package com.qe.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/resources/featurefiles",
	    glue= {"com.qe.stepDef", "com.qe.utils", "com.qe.pages"},
	    tags= {"@ui"},
	    strict=true,
	    monochrome=true,
	    plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRunner {

}
