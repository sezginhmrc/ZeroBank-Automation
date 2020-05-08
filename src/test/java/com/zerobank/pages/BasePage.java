package com.zerobank.pages;

import com.zerobank.utilities.BrowserMethods;
import com.zerobank.utilities.CommonMethods;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class BasePage implements CommonMethods {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,30);


    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "signin_button")
    private WebElement signInButton ;


    public void clickSignInButton(){
        BrowserMethods.wait(2);
        wait.until(ExpectedConditions.visibilityOf(signInButton)).click();
    }


    public void navigateTo(String tabName){
        BrowserMethods.wait(3);
        String path = "//a[text()='"+tabName+"']";
        WebElement tab = driver.findElement(By.xpath(path));
        wait.until(ExpectedConditions.elementToBeClickable(tab)).click();
        BrowserMethods.wait(3);
    }
}
