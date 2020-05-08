package com.zerobank.pages;

import com.zerobank.utilities.BrowserMethods;


import org.openqa.selenium.Alert;
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

    @FindBy(id = "sp_amount")
    private WebElement amount;

    @FindBy (id = "sp_date")
    private  WebElement date ;

    @FindBy(id = "ui-datepicker-div")
    private WebElement popUpWindow;

    @FindBy(xpath = "//a[text()='1']")
    private WebElement chooseDate;

    @FindBy(id = "sp_description")
    private WebElement description;

    @FindBy(id = "pay_saved_payees")
    private WebElement payButton;

    @FindBy(xpath = "//div[@id=\"alert_container\"]/*[2]/*[1]")
    private WebElement paymentSuccesMessage ;
    ////div[@id="alert_container"]/*[2]/*[1]



    public void selectPaymentCard(String card){
        BrowserMethods.wait(2);
        Select select = new Select(driver.findElement(By.id("sp_payee")));
        select.selectByVisibleText(card);
    }
    public void selectAccountType(String type){
        BrowserMethods.wait(2);
        Select select = new Select(driver.findElement(By.id("sp_account")));
        select.selectByVisibleText(type);
    }
    public void enterAmount(String amount1){
       BrowserMethods.wait(2);
        amount.sendKeys(amount1);
        BrowserMethods.wait(2);
    }

    public void selectDate(String date1){
        BrowserMethods.wait(3);
        date.click();
        wait.until(ExpectedConditions.visibilityOf(popUpWindow));
        chooseDate.click();
        BrowserMethods.wait(2);
    }
    public void enterDescription(String desc){
        BrowserMethods.wait(2);
        wait.until(ExpectedConditions.visibilityOf(description)).sendKeys(desc);
    }
    public void clickPayButton(){
        wait.until(ExpectedConditions.visibilityOf(payButton)).click();
    }

    public String paymentSucces(){
        return paymentSuccesMessage.getText();
    }

    public String popupErrorMessage(){
      return amount.getAttribute("validationMessage");

    }

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
