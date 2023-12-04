package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DeskTopPage extends Utility {
    By Desktops = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopAndNotBooks = By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNoteBooks = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
    By nameZtoA = By.id("input-sort");
    By descendingOrder = By.tagName("h4");
    By currencyDropDown = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//ul[@class = 'dropdown-menu']/li");
    By NameAtoZ = By.id("input-sort");
    By hpProduct = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyText = By.xpath("//h1[contains(text(),'HP LP3065')]");

   // By selectDeliveryDate = By.

    By enterQty = By.name("quantity");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissib");
    By Product21 = By.xpath("//a[contains(text(),'shopping cart')]");




    public void verifyTheDeskTopText(){getTextFromElement(Desktops);}
    public void mouseHoverAndClickOnLaptopAndNoteBooks(){mouseHoverToElementAndClick(laptopAndNotBooks);}
    public void passTheMenuShowAllLaptopsAndNotebooks(){clickOnElement(showAllLaptopsAndNoteBooks);}
    public void selectSortByPositionByNameZToA(){selectByVisibleTextFromDropDown(nameZtoA,"Name (Z - A)");}
    public void productDisplayInDescendingOrder(){verifyTheListIsDescendingOrder(descendingOrder);}
    public void mouseHoverOnCurrencyDropDownAndClick(){clickOnElement(currencyDropDown);}
    public void mouseHoverOnPoundSterling(){selectByContainsTextFromListOfElements(poundSterling,"£Pound Sterling");}
    public void sortByPositionAtoZ(){selectByVisibleTextFromDropDown(NameAtoZ,"Name (A - Z)");}
    public void selectProductHpLP3065(){clickOnElement(hpProduct);}
    public void verifyTextHPLp3065(){getTextFromElement(verifyText);}
    public void enterQuantity(){sendTextToElement(enterQty,"1");}
    public void clickOnAddToCartButton(){clickOnElement(addToCart);}
    public void verifyTheSuccessMessage(){selectByContainsTextFromListOfElements(successMessage,"Success: You have added HP LP3065 to your shopping cart!");}
    public void clickOnShoppingCart(){clickOnElement(Product21);}



}
