package com.OpenCart.stepDefinitions;

import com.OpenCart.Base.BaseClass;
import com.OpenCart.Pages.RegisterAccountPage;
import com.OpenCart.Pages.ReturningCustomerPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 5/28/2021.
 */
public class ReturningCustomerSteps extends BaseClass {
    public static RegisterAccountPage registerAccountPage;
    public static ReturningCustomerPage returningCustomerPage;

    public ReturningCustomerSteps() throws FileNotFoundException {
        super();
    }

    @When("^User launches the browser and navigate to url$")
    public void user_launches_the_browser_and_navigate_to_url() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initialization();
        registerAccountPage=new RegisterAccountPage(driver);
        returningCustomerPage=new ReturningCustomerPage(driver);


    }

    @When("^User Register Account$")
    public void user_Register_Account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setMyAccount();
        registerAccountPage.setRegister();
        registerAccountPage.setFirstName(properties.getProperty("firstname"));
        registerAccountPage.setLastname(properties.getProperty("lastname"));
        registerAccountPage.setEmail(properties.getProperty("email"));
        registerAccountPage.setTelephone(properties.getProperty("telephone"));
        registerAccountPage.setPassword(properties.getProperty("password"));
        registerAccountPage.setConfirmPassword(properties.getProperty("confirmpassword"));
        registerAccountPage.setNewsletterSubscribe();
        registerAccountPage.setPrivacyPolicy();
        registerAccountPage.setContinue();
        registerAccountPage.setLmyAccount();
        registerAccountPage.setLogout();
    }

    @When("^User clicks My Account$")
    public void user_clicks_My_Account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        returningCustomerPage.setmAccount();
    }

    @When("^User clicks on login$")
    public void user_clicks_on_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        returningCustomerPage.setMainLogin();
    }

    @Then("^User provides email$")
    public void user_provides_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        returningCustomerPage.setEmailField(properties.getProperty("email"));
    }

    @Then("^User provides password$")
    public void user_provides_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        returningCustomerPage.setPasswordField(properties.getProperty("password"));
    }

    @Then("^User clicks on loginbutton$")
    public void user_clicks_on_loginbutton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        returningCustomerPage.setLoginbutton();
    }

}
