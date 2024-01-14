package com.phoenix.driver;

import com.phoenix.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver initDriver() {
        WebDriver driver = null;
        if (ConfigFactory.getconfig().browser() == "CHROME") driver = ChromeManager.getdriver();
         else driver = FireFoxManager.getdriver();
        return driver;
    }
}
