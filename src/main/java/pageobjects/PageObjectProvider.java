package pageobjects;

import com.codeborne.selenide.SelenideElement;
import pageobjects.conponents.Header;
import pageobjects.conponents.NavMenu;
import pageobjects.conponents.PopupBlock;
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
    public static PopupBlock popupBlock = new PopupBlock();


    public SelenideElement elementProvider(String elementText, String elementPosition) {
        SelenideElement element = null;

//        // получим имя вызывающего класса
//        Throwable thr = new Throwable();
//        StackTraceElement[] ste = thr.getStackTrace();
//        String callerClassName = null;
//        int i = 1;
//        while (i < ste.length && ste[i].getMethodName().startsWith("access$")) {
//            ++i;
//        }
//        if (i < ste.length) {
//            callerClassName = ste[i].getClassName();
//        }
//        System.out.println(callerClassName);

        switch (elementPosition) {
            case "всплывающем блоке":
                element = popupBlock.mapElements(elementText);
                break;
            case "выпадающем меню корзины":
                element = header.mapElements(elementText);
                break;
            case "карточке товара":
                element = itemCardPage.mapElements(elementText);
                break;
        }

        return element;
    }
}
