package com.phoenix.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {

    private ConfigFactory(){}

    public  static  Frameworkconfig getconfig(){

        return  ConfigCache.getOrCreate(Frameworkconfig.class);
    }

}
