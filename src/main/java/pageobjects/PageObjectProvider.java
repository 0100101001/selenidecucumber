package pageobjects;

import pageobjects.conponents.Header;
import pageobjects.conponents.NavMenu;
import pageobjects.pages.CartPage;
import pageobjects.pages.HomePage;
import pageobjects.pages.ItemCardPage;
import pageobjects.pages.Plp;

public class PageObjectProvider {
    Header header = new Header();
    NavMenu navMenu = new NavMenu();
    CartPage cartPage = new CartPage();
    HomePage homePage = new HomePage();
    ItemCardPage itemCardPage = new ItemCardPage();
    Plp plp = new Plp();
}
