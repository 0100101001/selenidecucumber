package pageobjects;

import pageobjects.conponents.Header;
import pageobjects.conponents.NavMenu;
import pageobjects.pages.CartPage;
import pageobjects.pages.HomePage;
import pageobjects.pages.ItemCardPage;
import pageobjects.pages.Plp;

public class PageObjectProvider {
    public static Header header = new Header();
    public static NavMenu navMenu = new NavMenu();
    public static CartPage cartPage = new CartPage();
    public static HomePage homePage = new HomePage();
    public static ItemCardPage itemCardPage = new ItemCardPage();
    public static Plp plp = new Plp();
}
