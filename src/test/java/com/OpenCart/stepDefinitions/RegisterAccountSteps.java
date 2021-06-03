package com.OpenCart.stepDefinitions;

import com.OpenCart.Base.BaseClass;
import com.OpenCart.Pages.RegisterAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 5/26/2021.
 */
public class RegisterAccountSteps extends BaseClass {
    public static RegisterAccountPage registerAccountPage;
    public RegisterAccountSteps() throws FileNotFoundException {
        super();
    }

    @When("^User launches browser and navigate to url$")
    public void user_launches_browser_and_navigate_to_url() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initialization();
        registerAccountPage=new RegisterAccountPage(driver);
    }

    @When("^User clicks on My Account$")
    public void user_clicks_on_My_Account() throws Throwable{
        registerAccountPage.setMyAccount();
    }

    @Then("^User clicks on Register button$")
    public void user_clicks_on_Register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setRegister();
    }

    @Then("^User provide firstname$")
    public void user_provide_firstname() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setFirstName(properties.getProperty("firstname"));
    }

    @Then("^User provide lastname$")
    public void user_provide_lastname() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setLastname(properties.getProperty("lastname"));
    }

    @Then("^User provide email$")
    public void user_provide_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setEmail(properties.getProperty("email"));
    }

    @When("^User provide telephone$")
    public void user_provide_telephone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setTelephone(properties.getProperty("telephone"));
    }

    @Given("^User provide password$")
    public void user_provide_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setPassword(properties.getProperty("password"));
    }

    @Given("^User confirm password$")
    public void user_confirm_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setConfirmPassword(properties.getProperty("confirmpassword"));
    }

    @Given("^User unsubsribe to newsletter$")
    public void user_unsubsribe_to_newsletter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setNewsletterSubscribe();
    }

    @When("^User accept Privacy Policy$")
    public void user_accept_Privacy_Policy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setPrivacyPolicy();
    }

    @Then("^User continues to Register Account$")
    public void user_continues_to_Register_Account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerAccountPage.setContinue();
    }

    @When("^User navigates to My Account$")
    public void user_navigates_to_MyAccount() throws Throwable {
        registerAccountPage.setLmyAccount();
    }

    @Then("^User clicks on logout$")
    public void user_clicks_on_logout() throws Throwable {
        registerAccountPage.setLogout();
    }

}
