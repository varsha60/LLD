package designpatterns.factory;

import designpatterns.factory.components.button.AndroidButton;
import designpatterns.factory.components.button.Button;
import designpatterns.factory.components.dropdown.AndroidDropDown;
import designpatterns.factory.components.dropdown.DropDown;
import designpatterns.factory.components.menu.AndroidMenu;
import designpatterns.factory.components.menu.Menu;

public class AndroidFactory implements UIFactory {


    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
