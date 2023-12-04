package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By ComponentsText = By.xpath("//h2[contains(text(),'Components')]");
    By welcomeText = By.tagName("h2");

    public void verifyTheComponentsText(){getTextFromElement(ComponentsText);}
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
