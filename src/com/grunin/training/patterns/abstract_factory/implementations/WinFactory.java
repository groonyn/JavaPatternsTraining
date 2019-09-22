package com.grunin.training.patterns.abstract_factory.implementations;

import com.grunin.training.patterns.abstract_factory.implementations.elements_of_factory_implementations.win.WinButton;
import com.grunin.training.patterns.abstract_factory.implementations.elements_of_factory_implementations.win.WinCheckbox;
import com.grunin.training.patterns.abstract_factory.interfaces.Button;
import com.grunin.training.patterns.abstract_factory.interfaces.Checkbox;
import com.grunin.training.patterns.abstract_factory.interfaces.GUIFactory;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
