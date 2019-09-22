package com.grunin.training.patterns.abstract_factory.implementations;

import com.grunin.training.patterns.abstract_factory.implementations.elements_of_factory_implementations.mac.MacOSButton;
import com.grunin.training.patterns.abstract_factory.implementations.elements_of_factory_implementations.mac.MacOSCheckbox;
import com.grunin.training.patterns.abstract_factory.interfaces.Button;
import com.grunin.training.patterns.abstract_factory.interfaces.Checkbox;
import com.grunin.training.patterns.abstract_factory.interfaces.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
