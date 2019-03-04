package classbasedconfig;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend an hour in the batting cages.";
    }

    @Override
    public String getDailyFortune() {
        return "";
    }
}
