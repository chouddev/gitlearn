package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Virgohealthcare.feature", glue = { "UniformAppStepDef" },tags ="@SmokeTest")
public class testng extends AbstractTestNGCucumberTests {

}
