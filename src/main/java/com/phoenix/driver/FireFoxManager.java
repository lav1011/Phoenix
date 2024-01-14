package com.phoenix.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class FireFoxManager {

    private FireFoxManager() {
    }

    public static WebDriver getdriver() {

        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
