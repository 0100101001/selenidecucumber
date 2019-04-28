package util;

import com.codeborne.selenide.Selenide;

public class ActionsOnElements {

    public static void removeEvilBanner() {
        String element = "return $('.flocktory-widget-overlay').each(function() { "
                + "return $(this).css('z-index') == '2000000000'; }).get(0)";
        try {
            Object evilBanner = Selenide.executeJavaScript(element + ";");

            if (evilBanner != null) {
                // удалить div с баннером со страницы
                Selenide.executeJavaScript(element + ".remove();");
            }
        } catch (Exception ignored) { // нам не нужно это исключение
        }
    }
}
