package com.phoenix.config;

import com.phoenix.emuns.BrowserType;
import com.phoenix.emuns.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringtoBrowserTypeConverter implements Converter<BrowserType> {


    @Override
    public BrowserType convert(Method method, String browserName) {

        Map<String, BrowserType> StringBrowserTypeMap = Map.of("CHROME", BrowserType.CHROME, "FIREFOX", BrowserType.FIREFOX);
        return StringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }

}
