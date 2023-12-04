package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.DeskTopPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.ShoppingCartPage;
import demo.com.tutorialsninja.testbase.TestBase;
import org.testng.annotations.Test;

public class DeskTopTest extends TestBase {

    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        homePage.mouseHoverAndClickOnDeskTop(); //1.1 Mouse hover on Desktops Tab.and click
        homePage.clickOnShowAllDeskTop(); //1.2 Click on “Show All Desktops”
        deskTopPage.selectSortByPositionByNameZToA(); //1.3 Select Sort By position "Name: Z to A"
        deskTopPage.productDisplayInDescendingOrder();  // 1.4 Verify the Product will arrange in Descending order.
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        deskTopPage.mouseHoverOnCurrencyDropDownAndClick(); // 2.1 Mouse hover on Currency Dropdown and click
        deskTopPage.mouseHoverOnPoundSterling(); ///2.2 Mouse hover on £Pound Sterling and click
        homePage.mouseHoverAndClickOnDeskTop(); //2.3 Mouse hover on Desktops Tab.
        homePage.clickOnShowAllDeskTop(); //2.4 Click on “Show All Desktops”
        deskTopPage.sortByPositionAtoZ(); //2.5 Select Sort By position "Name: A to Z"
        deskTopPage.selectProductHpLP3065(); //2.6 Select product “HP LP3065”
        deskTopPage.verifyTextHPLp3065(); //2.7 Verify the Text "HP LP3065"

        deskTopPage.enterQuantity(); //2.9.Enter Qty "1” using Select class.
        deskTopPage.clickOnAddToCartButton(); //2.10 Click on “Add to Cart” button
        deskTopPage.verifyTheSuccessMessage(); //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        deskTopPage.clickOnShoppingCart(); //2.12 Click on link “shopping cart” display into success message
        shoppingCartPage.verifyTheShoppingCartText(); //2.13 Verify the text "Shopping Cart"
        shoppingCartPage.verifyTheProductName(); //2.14 Verify the Product name "HP LP3065"
        shoppingCartPage.verifyTheDeliveryDate(); //2.15 Verify the Delivery Date "2023-11-27"
        shoppingCartPage.verifyTheModelNumber(); //2.16 Verify the Model "Product21"
        shoppingCartPage.verifyTheTotalAmount(); //2.17 Verify the Total "£74.73"

    }
}
