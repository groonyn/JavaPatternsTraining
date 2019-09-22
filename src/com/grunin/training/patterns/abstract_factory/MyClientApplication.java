package com.grunin.training.patterns.abstract_factory;

import com.grunin.training.patterns.abstract_factory.interfaces.Button;
import com.grunin.training.patterns.abstract_factory.interfaces.Checkbox;
import com.grunin.training.patterns.abstract_factory.interfaces.GUIFactory;

public class MyClientApplication {
    private Button button;
    private Checkbox checkbox;

    public MyClientApplication(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void showStatuses() {
        button.showStatus();
        checkbox.showStatus();
    }
}
