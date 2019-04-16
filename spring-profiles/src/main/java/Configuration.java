import knight.DevKnight;
import knight.Knight;
import knight.ProdKnight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    @Profile("dev")
    public Knight devKnight() {
        return new DevKnight();
    }

    @Bean
    @Profile("prod")
    public Knight prodKnight() {
        return new ProdKnight();
    }
}
