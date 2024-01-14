package com.phoenix.driver;

import com.phoenix.config.ConfigFactory;
import com.phoenix.emuns.RemoteModeType;
import org.openqa.selenium.WebDriver;

public class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver() {

        RemoteModeType remoteModeType = ConfigFactory.getconfig().browserRemote();

        if (remoteModeType == RemoteModeType.SELENIUM) {

        } else if (remoteModeType == RemoteModeType.SELENOID) {

        } else {
            remoteModeType = RemoteModeType.BROWSERSTACK;
        }

        return null;
    }
}
