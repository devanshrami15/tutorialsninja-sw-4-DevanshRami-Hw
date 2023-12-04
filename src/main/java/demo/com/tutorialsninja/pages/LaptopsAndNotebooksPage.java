package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {
     By laptopsAndNoteBooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By components = By.linkText("Components");
    By showAllComponents = By.xpath("//a[normalize-space()='Show AllComponents']");
    By welcomeText = By.tagName("h2");
    By sortByFilter = By.xpath("//select[@id='input-sort']");
    By MacBookProductName = By.xpath("//a[normalize-space()='MacBook']");


    public void verifyTheLaptopsAndNotebooksText(){getTextFromElement(laptopsAndNoteBooks);}
    public void mouseHoverOnComponents(){mouseHoverToElement(components);}
    public void clickOnShowAllComponents(){clickOnElement(showAllComponents);}
    public String getWelcomeText() {return getTextFromElement(welcomeText);}
    public void sortByFilter(String sortByOption) {selectByVisibleTextFromDropDown(sortByFilter, sortByOption);}
    public void clickOnMacBookProduct () {clickOnElement(MacBookProductName);}
}
