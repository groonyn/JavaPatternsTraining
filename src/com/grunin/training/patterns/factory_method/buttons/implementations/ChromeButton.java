package com.grunin.training.patterns.factory_method.buttons.implementations;

import com.grunin.training.patterns.factory_method.buttons.interfaces.Button;

public class ChromeButton implements Button {
    @Override
    public void click() {
        System.out.println("Button click");
    }
}
