package com.zerobank.pages;

import com.zerobank.utilities.BrowserMethods;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dashboard extends BasePage {


    @FindBy(xpath = "//a[text()='Account Summary']")
    private WebElement accountSummary;

    @FindBy(tagName = "h2")
    private List<WebElement> accountSummaryTitles;

    @FindBy(xpath = "(//thead)[3]//tr//th")
    private List<WebElement> creditAccountsTitles;

    @FindBy(linkText = "Account Activity")
    private WebElement accountAcitivity;





    public String selectedOption(){
        Select select = new Select(driver.findElement(By.id("aa_accountId")));
        return select.getFirstSelectedOption().getText();
    }
    public List<String> allSelectOptions(){
        Select select = new Select(driver.findElement(By.id("aa_accountId")));
        return BrowserMethods.getTextFromWebElements(select.getOptions());
    }

    public Boolean accountSummaryDisplayed(){
        BrowserMethods.wait(3);
        return accountSummary.isDisplayed();
    }

    public List<String> getAccountSummaryTitles(){
        BrowserMethods.wait(3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h2")));
        BrowserMethods.wait(3);
        return BrowserMethods.getTextFromWebElements(accountSummaryTitles);
    }


    public List<String> getCreditAccountsTitles() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//thead)[3]//tr//th")));
        return BrowserMethods.getTextFromWebElements(creditAccountsTitles);
    }





}
