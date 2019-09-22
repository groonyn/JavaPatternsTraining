package com.grunin.training.patterns.abstract_factory.implementations.elements_of_factory_implementations.win;

import com.grunin.training.patterns.abstract_factory.interfaces.Button;

public class WinButton implements Button {
    @Override
    public void showStatus() {
        System.out.println("This is Win Button implementation");
    }
}
