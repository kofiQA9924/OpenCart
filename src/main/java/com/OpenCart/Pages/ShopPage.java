package com.OpenCart.Pages;

import com.OpenCart.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 5/29/2021.
 */
public class ShopPage extends BaseClass {
    public ShopPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(BaseClass.driver,this);
    }

    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[6]/a")
    @CacheLookup
    WebElement phones_PDSs;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/h4/a")
    @CacheLookup
    WebElement iphone;

    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    @CacheLookup
    WebElement iphoneToCart;

    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[7]/a")
    @CacheLookup
    WebElement cameras;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div[1]/h4/a")
    @CacheLookup
    WebElement nikonD300;

    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    @CacheLookup
    WebElement nikonD300ToCart;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/button")
    @CacheLookup
    WebElement Cart;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[2]/strong")
    @CacheLookup
    WebElement checkout;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/h2")
    @CacheLookup
    WebElement PrdtsMsg;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")
    @CacheLookup
    WebElement usrAccount;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")
    @CacheLookup
    WebElement usrlogout;

    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    @CacheLookup
    WebElement lgoutmsg;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/a")
    @CacheLookup
    WebElement lgoutContinue;

    public void setPhones_PDSs(){
        phones_PDSs.click();
    }
    public void setIphone(){
        iphone.click();
        iphoneToCart.click();
    }
    public void setCameras(){
        cameras.click();
    }
    public void setNikonD300(){
        nikonD300.click();
        nikonD300ToCart.click();
    }
    public void setCart(){
        Cart.click();
    }
    public void setCheckout(){
        checkout.click();
        boolean unavailable=PrdtsMsg.isDisplayed();
        if (unavailable==true){
            System.out.println("Products marked with *** are not available in the desired quantity or not in stock!");
        }
        else {
            System.out.println("Products are available");
        }
    }
    public void setUsrLogout(){
        usrAccount.click();
        usrlogout.click();
        String accountoutMsg=lgoutmsg.getText();
        if (accountoutMsg.equals("Account Logout")){
            System.out.println("You have been logged off your account. It is now safe to leave the computer.Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account.");
        }
        else {
            System.out.println("Account Logout failed.");
        }
        lgoutContinue.click();
    }
}
