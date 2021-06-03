package com.OpenCart.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by RUTHERFORD on 5/26/2021.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/ShopPage.feature",glue = "com.OpenCart.stepDefinitions",plugin = {"pretty","html:test-output","json:target/cucumber.json"})
public class TestRunner {
}
