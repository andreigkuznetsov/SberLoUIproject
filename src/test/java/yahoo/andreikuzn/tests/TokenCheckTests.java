package yahoo.andreikuzn.tests;

import configuration.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TokenCheckTests {

    @Test
    public void tokenCheckTestLocal() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertEquals(apiConfig.token(), "secrettokenstring");
    }

    @Test
    public void tokenCheckTestRemote() throws Exception {
        String token = "secrettokenstring";
        Path properties = Paths.get("C:\\windows\\temp\\token.properties");

        Files.write(properties, token.getBytes(StandardCharsets.UTF_8));

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertEquals(apiConfig.token(), "secrettokenstring");

        Files.delete(properties);
    }
}
