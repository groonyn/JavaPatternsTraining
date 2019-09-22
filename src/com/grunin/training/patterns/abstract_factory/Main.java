package com.grunin.training.patterns.abstract_factory;

import com.grunin.training.patterns.abstract_factory.implementations.MacOSFactory;
import com.grunin.training.patterns.abstract_factory.implementations.WinFactory;
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
