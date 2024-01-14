package com.phoenix.config;

import com.phoenix.emuns.RunModeType;
import org.aeonbits.owner.Converter;


import java.lang.reflect.Method;


public class RunModeTypeConverter implements Converter<RunModeType> {


    @Override
    public RunModeType convert(Method method, String runMode) {

        return RunModeType.valueOf(runMode.toUpperCase());
    }

}
