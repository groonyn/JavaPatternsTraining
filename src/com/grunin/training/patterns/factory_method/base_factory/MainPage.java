package com.grunin.training.patterns.factory_method.base_factory;

import com.grunin.training.patterns.factory_method.buttons.interfaces.Button;

public abstract class MainPage {
    public void render(){
        Button button = createButton();
        button.click();
    }
    public abstract Button createButton();
}
