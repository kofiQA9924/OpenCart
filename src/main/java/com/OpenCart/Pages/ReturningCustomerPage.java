package com.OpenCart.Pages;

import com.OpenCart.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 5/28/2021.
 */
public class ReturningCustomerPage extends BaseClass {
    public ReturningCustomerPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(BaseClass.driver,this);
    }

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")
    @CacheLookup
    WebElement mAccount;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
    @CacheLookup
    WebElement MainLogin;

    @FindBy(xpath = "//*[@id='input-email']")
    @CacheLookup
    WebElement emailField;

    @FindBy(xpath = "//*[@id='input-password']")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
    @CacheLookup
    WebElement loginbutton;

    public void setmAccount(){
        mAccount.click();
    }

    public void setMainLogin(){
        MainLogin.click();
    }

    public void setEmailField(String rname){
        emailField.sendKeys(rname);
    }
    public void setPasswordField(String rpswd){
        passwordField.sendKeys(rpswd);
    }
    public void setLoginbutton(){
        loginbutton.click();
    }
}
