package com.OpenCart.Pages;

import com.OpenCart.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 5/25/2021.
 */
public class RegisterAccountPage extends BaseClass {
    public RegisterAccountPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(BaseClass.driver,this);
    }

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/i")
    @CacheLookup
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    @CacheLookup
    WebElement Register;

    @FindBy(xpath = "//*[@id='input-firstname']")
    @CacheLookup
    WebElement firstName;

    @FindBy(xpath = "//*[@id='input-lastname']")
    @CacheLookup
    WebElement lastname;

    @FindBy(xpath = "//*[@id='input-email']")
    @CacheLookup
    WebElement email;

    @FindBy(xpath = "//*[@id='input-telephone']")
    @CacheLookup
    WebElement telephone;

    @FindBy(xpath = "//*[@id='input-password']")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "//*[@id='input-confirm']")
    @CacheLookup
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
    @CacheLookup
    WebElement newsletterSubscribe;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    @CacheLookup
    WebElement PrivacyPolicy;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    @CacheLookup
    WebElement Continue;

    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    @CacheLookup
    WebElement message;

    @FindBy(xpath = "/html/body/div[2]/div/div/p[1]")
    @CacheLookup
    WebElement congratulations;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")
    @CacheLookup
    WebElement lmyAccount;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")
    @CacheLookup
    WebElement logout;

    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    @CacheLookup
    WebElement logoutMsg;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/a")
    @CacheLookup
    WebElement logoutContinue;

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")
    @CacheLookup
    WebElement yourStoreLogo;

    public void setMyAccount(){
        myAccount.click();
    }
    public void setRegister(){
        Register.click();
    }
    public void setFirstName(String fname){
        firstName.sendKeys(fname);
    }
    public void setLastname(String lname){
        lastname.sendKeys(lname);
    }
    public void setEmail(String uemail){
        email.sendKeys(uemail);
    }
    public void setTelephone(String utelephone){
        telephone.sendKeys(utelephone);
    }
    public void setPassword(String upassword){
        password.sendKeys(upassword);
    }
    public void setConfirmPassword(String ucpassword){
        confirmPassword.sendKeys(ucpassword);
    }
    public void setNewsletterSubscribe(){
        newsletterSubscribe.click();
    }
    public void setPrivacyPolicy(){
        PrivacyPolicy.click();
    }
    public void setContinue(){
        Continue.click();
        String accountCreated=message.getText();
        if (accountCreated.equals("Your Account Has Been Created!")){
            System.out.println(congratulations.getText());
        }
        else {
            System.out.println("Your account could not be created.");
        }
    }
    public void setLmyAccount(){
        lmyAccount.click();
    }
    public void setLogout() throws InterruptedException {
        logout.click();
        Thread.sleep(3000);
        String logoutmsg=logoutMsg.getText();
        if (logoutmsg.equals("Account Logout")){
            System.out.println("You have been logged off your account. It is now safe to leave the computer.");
        }
        else {
            System.out.println("Account Logout failed.");
        }
        logoutContinue.click();
        Thread.sleep(3000);
        String imgdspld=yourStoreLogo.getText();
        if (imgdspld.equals("Your Store")){
            System.out.println(imgdspld);
        }
        else {
            System.out.println("Log out message not successful");
        }
    }
}
