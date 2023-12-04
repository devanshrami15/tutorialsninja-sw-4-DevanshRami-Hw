package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By desktop = By.linkText("Desktops");
    By showAllDeskTop = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']");
    By desktopMenu = By.xpath("//a[normalize-space()='Desktops']");
    By showAllDesktopsSubMenu = By.xpath("//a[normalize-space()='Show AllDesktops']");
    By laptopAndNotebooksMenu = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptopAndNotebooksSubMenu = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
    By componentsMenu = By.xpath("//a[normalize-space()='Components']");
    By showAllComponentsSubMenu = By.xpath("//a[normalize-space()='Show AllComponents']");
    By currencyDropDown = By.xpath("//span[normalize-space()='Currency']");
    By sterlingPoundCurrencyOption = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By myAccountMenu = By.xpath("//span[normalize-space()='My Account']");
    By registerOptionInMyAccountMenu = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
    By loginOptionInMyAccountMenu = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");





    public void mouseHoverAndClickOnDeskTop(){mouseHoverToElementAndClick(desktop);}
    public void clickOnShowAllDeskTop(){clickOnElement(showAllDeskTop);}
    public void mouseHoverOnDesktopMenu (){
        mouseHoverToElement(desktopMenu);
    }

    public void clickOnShowAllDesktopsSubMenu () {
        clickOnElement(showAllDesktopsSubMenu);
    }

    public void mouseHoverOnLaptopsAndNotebooksMenu () {
        mouseHoverToElement(laptopAndNotebooksMenu);
    }

    public void clickOnShowAllLaptopAndNotebooksSubMenu () {
        clickOnElement(showAllLaptopAndNotebooksSubMenu);
    }

    public void mouseHoverOnComponentsMenu () {
        mouseHoverToElement(componentsMenu);
    }

    public void clickOnShowAllComponentsSubMenu () {
        clickOnElement(showAllComponentsSubMenu);
    }

    public void mouseHoverAndClickOnCurrencyDroDown (){
        mouseHoverToElementAndClick(currencyDropDown);
    }

    public void selectSterlingPoundFromCurrencyDropDown(){
        mouseHoverToElementAndClick(sterlingPoundCurrencyOption);
    }

    public void clickOnMyAccountMenu () {
        clickOnElement(myAccountMenu);
    }

    public void clickOnRegisterOptionInMyAccount() {
        clickOnElement(registerOptionInMyAccountMenu);
    }

    public void clickOnLoginOptionInMyAccount() {
        clickOnElement(loginOptionInMyAccountMenu);
    }

}
