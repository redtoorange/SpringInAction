package classbasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Tell Spring this a Java based configuration
@Configuration
@PropertySource("classpath:classbasedconfig/sport.properties")
// Tell Spring to scan the package for beans
//@ComponentScan("classbasedconfig")
public class SportConfig {
    // Creates a bean with an id "happyFortune"
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
