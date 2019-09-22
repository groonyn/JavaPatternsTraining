package com.grunin.training.patterns.factory_method;

import com.grunin.training.patterns.factory_method.base_factory.MainPage;
import com.grunin.training.patterns.factory_method.pages.ChromeMainPage;
import com.grunin.training.patterns.factory_method.pages.FirefoxMainPage;

import java.util.Scanner;

public class Main {
    private static MainPage mainPage;

    public static void main(String[] args) {
        configure();
        runLogic();
    }

    private static void configure() {
        Scanner scanner = new Scanner(System.in);
        String system = scanner.nextLine();
        if (system.equals("chrome")) {
            mainPage = new ChromeMainPage();
        }
        if (system.equals("firefox")) {
            mainPage = new FirefoxMainPage();
        }
    }

    private static void runLogic() {
        mainPage.render();
    }
}
