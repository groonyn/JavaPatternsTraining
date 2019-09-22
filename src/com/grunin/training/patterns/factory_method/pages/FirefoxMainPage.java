package com.grunin.training.patterns.factory_method.pages;

import com.grunin.training.patterns.factory_method.base_factory.MainPage;
import com.grunin.training.patterns.factory_method.buttons.implementations.FirefoxButton;
import com.grunin.training.patterns.factory_method.buttons.interfaces.Button;

public class FirefoxMainPage extends MainPage {
    @Override
    public Button createButton() {
        return new FirefoxButton();
    }
}
