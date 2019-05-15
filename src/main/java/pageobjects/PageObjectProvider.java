package pageobjects;

import com.codeborne.selenide.SelenideElement;
import pageobjects.conponents.NavMenu;
import pageobjects.conponents.PopupBlock;
import pageobjects.pages.CartPage;
import pageobjects.pages.HomePage;
import pageobjects.pages.ItemCardPage;
import pageobjects.pages.Plp;

public class PageObjectProvider {
    public static NavMenu navMenu = new NavMenu();
    public static CartPage cartPage = new CartPage();
    public static HomePage homePage = new HomePage();
    public static ItemCardPage itemCardPage = new ItemCardPage();
    public static Plp plp = new Plp();
    public static PopupBlock popupBlock = new PopupBlock();


    public static SelenideElement elementProvider(String elementText, String elementPosition) {
        SelenideElement element = null;

        switch (elementPosition) {
            case "всплывающем блоке":
                element = popupBlock.mapElements(elementText);
                break;
            case "карточке товара":
                element = itemCardPage.mapElements(elementText);
                break;
        }
        return element;
    }
}
