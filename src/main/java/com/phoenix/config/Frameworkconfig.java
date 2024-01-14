package com.phoenix.config;

import com.phoenix.emuns.RemoteModeType;
import com.phoenix.emuns.RunModeType;
import org.aeonbits.owner.Config;


@Config.LoadPolicy (Config. LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"})

public interface Frameworkconfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringtoBrowserTypeConverter.class)
    String browser();
    @DefaultValue("staging")
    String environment();
    @Key ("${environment}.username")
    String username ();
    @Key ("${environment}.Url")
    String url();

    @Key("runmode")
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    RemoteModeType browserRemote();
}
