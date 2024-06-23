package designpatterns.factory;

import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.Menu;

public class FactoryMain {

    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.getFactory();
        Menu menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        flutter.setTheme();
    }
}
