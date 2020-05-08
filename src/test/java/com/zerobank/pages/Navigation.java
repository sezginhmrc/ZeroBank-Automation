package com.zerobank.pages;

import com.zerobank.utilities.BrowserMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Navigation extends BasePage {

    @FindBy(xpath = "(//tbody)[1]//tr[1]//td[1]/*[1]")
    private WebElement savings;

    @FindBy(xpath = "(//tbody)[2]//tr//td[1]/*[1]")
    private WebElement brokerage;

    @FindBy(xpath = "(//tbody)[3]//tr[1]//td[1]/*[1]")
    private WebElement checking;

    @FindBy(xpath = "(//tbody)[3]//tr[2]//td[1]/*[1]")
    private WebElement creditCart;

    @FindBy(xpath = "(//tbody)[4]//tr[1]//td[1]/*[1]")
    private WebElement loan;

    @Override
    public void clickButton(String button) {

        button = button.toUpperCase();
        switch (button) {
            case "SAVINGS":
                savings.click();
                break;
            case "BROKERAGE":
                brokerage.click();
                break;
            case "CHECKING":
                checking.click();
                break;
            case "CREDIT CARD":
                creditCart.click();
                break;
            case "LOAN":
                loan.click();
            default:
                Assert.fail("There are no such " + button + " available in switch statement ");
        }
    }
    public void scrollDownPage(){
        BrowserMethods.wait(3);
        BrowserMethods.scrollTo(creditCart);

    }

}
