package designpatterns.factory;

import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.button.IOSButton;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.dropdown.IOSDropDown;
import designpatterns.factory.components.menu.IOSMenu;
import designpatterns.factory.components.menu.Menu;

public class IOSFactory implements UIFactory {


    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
