package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.ComponentsPage;
import demo.com.tutorialsninja.pages.DeskTopPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import demo.com.tutorialsninja.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

@Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
      homePage.mouseHoverAndClickOnDeskTop();
      homePage.clickOnShowAllDeskTop();
      deskTopPage.verifyTheDeskTopText();
  }

 @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
    deskTopPage.mouseHoverAndClickOnLaptopAndNoteBooks();
    deskTopPage.passTheMenuShowAllLaptopsAndNotebooks();
    laptopsAndNotebooksPage.verifyTheLaptopsAndNotebooksText();
}
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
    laptopsAndNotebooksPage.mouseHoverOnComponents();
    laptopsAndNotebooksPage.clickOnShowAllComponents();
    componentsPage.verifyTheComponentsText();

}

}
