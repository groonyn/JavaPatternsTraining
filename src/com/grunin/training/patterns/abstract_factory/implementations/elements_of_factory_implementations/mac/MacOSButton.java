package com.grunin.training.patterns.abstract_factory.implementations.elements_of_factory_implementations.mac;

import com.grunin.training.patterns.abstract_factory.interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public void showStatus() {
        System.out.println("This is MacOS Button implementation");
    }
}
