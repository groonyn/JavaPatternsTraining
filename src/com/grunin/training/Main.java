package com.grunin.training;

import com.grunin.training.patterns.abstract_factory.MyClientApplication;
import com.grunin.training.patterns.abstract_factory.factory_impl.MacOSFactory;
import com.grunin.training.patterns.abstract_factory.factory_impl.WinFactory;
import com.grunin.training.patterns.abstract_factory.interfaces.GUIFactory;

import java.util.Scanner;

public class Main {
    private static MyClientApplication configureApplication() {
        MyClientApplication app;
        GUIFactory factory;
        Scanner scanner = new Scanner(System.in);
        String system = scanner.nextLine();

        if (system.contains("mac")) {
            factory = new MacOSFactory();
            app = new MyClientApplication(factory);
        } else {
            factory = new WinFactory();
            app = new MyClientApplication(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        MyClientApplication app = configureApplication();
        app.showStatuses();
    }
}
