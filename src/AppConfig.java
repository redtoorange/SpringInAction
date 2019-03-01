import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public LegacyCustomer getCustomer(){
        return new LegacyCustomer();
    }
}
