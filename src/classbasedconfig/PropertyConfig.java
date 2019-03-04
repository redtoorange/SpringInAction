package classbasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:classbasedconfig/sport.properties")
public class PropertyConfig {
    @Bean
    public FortuneService happyFortune() {
        return new HappyFortuneService();
    }

    // Creates a bean with an id "swimCoach"
    @Bean
    public Coach swimCoach() {
        // injects the Bean created with the other method
        return new SwimCoach(happyFortune());
    }
}
