package com.phoenix.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {

    private  ChromeManager(){
    }

    public  static WebDriver getdriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
