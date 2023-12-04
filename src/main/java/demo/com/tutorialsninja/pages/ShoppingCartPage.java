package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By verifyCartText = By.xpath("//div[@id='content']//h1");
    By verifyProductName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyDeliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]");
    By productModel = By.xpath("div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By quantityField = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By updateButton = By.xpath("(//button[@type='submit'])[1]");
    By shoppingCartUpdateMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By cartTotal = By.xpath("//div[@class = 'table-responsive']/table[1]/tbody[1]/tr[1]/td[6]");
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");



    public void verifyTheShoppingCartText(){getTextFromElement(verifyCartText).contains("Shopping Cart");}
    public void verifyTheProductName(){getTextFromElement(verifyProductName).contains("HP LP3065");}
    public void verifyTheDeliveryDate(){getTextFromElement(verifyDeliveryDate).contains("2023-11-27");}
    public void verifyTheModelNumber(){getTextFromElement(productModel).contains("Product21");}
    public void verifyTheTotalAmount(){getTextFromElement(total).contains("£74.73");}
    public void sendDataToQuantityField(String quantity) {sendTextToElement(quantityField, quantity);}
    public void clickOnUpdateButton () {clickOnElement(updateButton);}
    public String getShoppingCartUpdateMessage() {return getTextFromElement(shoppingCartUpdateMessage);}
    public String getCartTotal () {return getTextFromElement(cartTotal);}
    public void clickOnCheckOut() {clickOnElement(checkOutButton);}

    public String getWelcomeText() { return getTextFromElement(verifyCartText);
    }
}
