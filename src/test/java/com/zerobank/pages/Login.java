package com.zerobank.pages;

import com.zerobank.utilities.BrowserMethods;
import com.zerobank.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class Login extends BasePage {
// This is my Login Page object to be able to interact with the the page as part of my test cases
//  I store locators elements and functions here


    @FindBy (id = "user_login")
    private WebElement login ;

    @FindBy(id="user_password")
    private WebElement password ;

    @FindBy (name = "submit")
    private WebElement signin_button ;

    @FindBy (xpath = "//div[@class='alert alert-error']")
    private WebElement warningMessage;


     public void login(){
         BrowserMethods.wait(3);
         BrowserMethods.waitForPageToLoad(15);
        login.sendKeys(ConfigurationReader.getProperty("authorized-user"));
        password.sendKeys(ConfigurationReader.getProperty("authorized-user-password"), Keys.ENTER);
        BrowserMethods.wait(3);
    }
    public void login(String username,String passwordValue){
         BrowserMethods.wait(3);
         BrowserMethods.waitForPageToLoad(15);
        login.sendKeys(username);
        password.sendKeys(passwordValue,Keys.ENTER);
    }

    public Boolean getWarningMessage(){
         BrowserMethods.wait(3);
        return warningMessage.isDisplayed();
    }

}
