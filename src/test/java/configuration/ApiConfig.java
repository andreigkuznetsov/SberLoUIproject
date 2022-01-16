package configuration;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/secret.properties",
        "classpath:config/secret.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://sberlogistics.ru/")
    String getBaseUrl();

    @Key("token")
    String token();
}