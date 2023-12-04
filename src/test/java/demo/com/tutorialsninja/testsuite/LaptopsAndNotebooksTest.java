package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.*;
import demo.com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class LaptopsAndNotebooksTest extends TestBase {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookProductPage macBookProductPage = new MacBookProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnLaptopsAndNotebooksMenu(); // 1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.clickOnShowAllLaptopAndNotebooksSubMenu(); // 1.2 Click on “Show All Laptops & Notebooks”
        String actualLaptopAndNotebooksPageText = laptopsAndNotebooksPage.getWelcomeText();
        String expectedLaptopAndNotebooksPageText = "Laptops & Notebooks";
        Assert.assertEquals(actualLaptopAndNotebooksPageText, expectedLaptopAndNotebooksPageText);
        laptopsAndNotebooksPage.sortByFilter("Price (High > Low)"); // 1.3 Select Sort By "Price (High > Low)"
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {

        //homePage.mouseHoverAndClickOnCurrencyDroDown();
        //homePage.selectSterlingPoundFromCurrencyDropDown();

        homePage.mouseHoverOnLaptopsAndNotebooksMenu(); // 2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.clickOnShowAllLaptopAndNotebooksSubMenu(); // 2.2 Click on “Show All Laptops & Notebooks”

        String actualLaptopAndNotebooksPageText = laptopsAndNotebooksPage.getWelcomeText();
        String expectedLaptopAndNotebooksPageText = "Laptops & Notebooks";
        Assert.assertEquals(actualLaptopAndNotebooksPageText, expectedLaptopAndNotebooksPageText);

        laptopsAndNotebooksPage.sortByFilter("Price (High > Low)"); //2.3 Select Sort By "Price (High > Low)"
        //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.clickOnMacBookProduct();
        //2.5 Verify the text “MacBook”
        String expectedProductMessage = "MacBook";

        String actualProductMessage = macBookProductPage.getWelcomeText().substring(0, expectedProductMessage.length());
        Assert.assertEquals(actualProductMessage, expectedProductMessage);

        macBookProductPage.clickOnAddToCart(); //2.6 Click on ‘Add To Cart’ button
        // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!";
        String actualSuccessMessage = macBookProductPage.getCartAddSuccessfulMessage().substring(0, expectedSuccessMessage.length());
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        //2.8 Click on link “shopping cart” display into success message
        macBookProductPage.clickOnShoppingCartLinkInMessage();

        Thread.sleep(2000);
        String expectedShoppingCartText = "Shopping Cart"; // 2.9 Verify the text "Shopping Cart"
        String actualShoppingCartText = shoppingCartPage.getWelcomeText().substring(0,expectedShoppingCartText.length()); // 2.10 Verify the Product name "MacBook"
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText);

        shoppingCartPage.sendDataToQuantityField(Keys.CONTROL +"a");
        shoppingCartPage.sendDataToQuantityField("2");

        shoppingCartPage.clickOnUpdateButton();

        String expectedUpdateMessage = "Success: You have modified your shopping cart!";
        String actualUpdateMessage = shoppingCartPage.getShoppingCartUpdateMessage().substring(0, expectedUpdateMessage.length());
        Assert.assertEquals(actualUpdateMessage, expectedUpdateMessage);
        // 2.14 Verify the Total £737.45
        String expectedCartTotal = "£737.45";
        String actualCartTotal = shoppingCartPage.getCartTotal().substring(0, expectedCartTotal.length());
        Assert.assertEquals(actualCartTotal, expectedCartTotal);

        shoppingCartPage.clickOnCheckOut();

        String expectedCheckoutText = "Checkout";
        String actualCheckoutText = checkoutPage.getCheckoutText();
        Assert.assertEquals(actualCheckoutText, expectedCheckoutText);

        String expectedNewCustomerText = "New Customer";
        String actualNewCustomerText = checkoutPage.getNewCustomerText();
        Assert.assertEquals(actualNewCustomerText, expectedNewCustomerText);

        checkoutPage.clickOnGuestCheckoutRadioButton();

        checkoutPage.clickOnGuestCheckoutContinueButton();

        checkoutPage.sendDataToFirstNameField("Abcd");
        checkoutPage.sendDataToLastNameField("Xyz");
        Random random = new Random();
        checkoutPage.sendDataToEmailField("abcd"+random.nextInt()+"@gmail.com");
        checkoutPage.sendDataToTelephoneField("074424856275");
        checkoutPage.sendDataToAddressField("1, ancd st.");
        checkoutPage.sendDataToCityField("London");
        checkoutPage.sendDataToPostCodeField("HA0 2AB");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.selectState("Essex");
        checkoutPage.clickOnBillingDetailContinueButton();
        checkoutPage.sendDataToCommentField("The product is good!"); // 2.22 Add Comments About your order into text area
        checkoutPage.clickOnTermAndCondition(); // 2.23 Check the Terms & Conditions check box
        checkoutPage.clickOnPaymentMethodContinueButton(); // 2.24 Click on “Continue” button
        // 2.25 Verify the message “Warning: Payment method required!”
        String expectedPaymentWarningMessage = "Warning: Payment method required!";
        String actualPaymentWarningMessage = checkoutPage.getPaymentWarningMessage().substring(0,expectedPaymentWarningMessage.length());
        Assert.assertEquals(actualPaymentWarningMessage, expectedPaymentWarningMessage);
    }
}
