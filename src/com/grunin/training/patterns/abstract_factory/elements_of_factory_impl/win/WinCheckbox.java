package com.grunin.training.patterns.abstract_factory.elements_of_factory_impl.win;

import com.grunin.training.patterns.abstract_factory.interfaces.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void showStatus() {
        System.out.println("This is Win Checkbox implementation");
    }
}
