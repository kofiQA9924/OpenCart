package com.OpenCart.stepDefinitions;

import com.OpenCart.Base.BaseClass;
import com.OpenCart.Pages.RegisterAccountPage;
import com.OpenCart.Pages.ReturningCustomerPage;
import com.OpenCart.Pages.ShopPage;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 5/29/2021.
 */
public class ShopPageSteps extends BaseClass {
    public static RegisterAccountPage registerAccountPage;
    public static ReturningCustomerPage returningCustomerPage;
    public static ShopPage shopPage;

    public ShopPageSteps() throws FileNotFoundException {
        super();
    }

    @When("^A Registered user logs in$")
    public void a_Registered_user_logs_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initialization();
        registerAccountPage=new RegisterAccountPage(driver);
        returningCustomerPage=new ReturningCustomerPage(driver);
        shopPage=new ShopPage(driver);
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
        returningCustomerPage.setmAccount();
        returningCustomerPage.setMainLogin();
        returningCustomerPage.setEmailField(properties.getProperty("email"));
        returningCustomerPage.setPasswordField(properties.getProperty("password"));
        returningCustomerPage.setLoginbutton();
    }

    @When("^User clicks on phones & PDSs$")
    public void user_clicks_on_phones_PDSs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopPage.setPhones_PDSs();
    }

    @When("^User adds iphone to Cart$")
    public void user_adds_iphone_to_Cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopPage.setIphone();
    }

    @Then("^User selects Cameras$")
    public void user_selects_Cameras() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopPage.setCameras();
    }

    @Then("^User Adds Nikon D(\\d+) to cart$")
    public void user_Adds_Nikon_D_to_cart(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopPage.setNikonD300();
    }

    @When("^User clicks cart$")
    public void user_clicks_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopPage.setCart();
    }

    @Then("^User checkout$")
    public void user_checkout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopPage.setCheckout();
        Assert.assertTrue(true);
    }
    @But("^User logs out$")
    public void  user_logs_out() throws InterruptedException {
        shopPage.setUsrLogout();
    }

}
