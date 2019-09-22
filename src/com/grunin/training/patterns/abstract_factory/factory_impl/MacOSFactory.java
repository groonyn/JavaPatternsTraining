package com.grunin.training.patterns.abstract_factory.factory_impl;

import com.grunin.training.patterns.abstract_factory.elements_of_factory_impl.mac.MacOSButton;
import com.grunin.training.patterns.abstract_factory.elements_of_factory_impl.mac.MacOSCheckbox;
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
