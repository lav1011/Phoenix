package com.phoenix.config;

import com.phoenix.emuns.RemoteModeType;
import com.phoenix.emuns.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;


public class RemoteModeTypeConverter implements Converter<RemoteModeType> {


    @Override
    public RemoteModeType convert(Method method, String remoteMode) {

        return RemoteModeType.valueOf(remoteMode.toUpperCase());
    }

}
