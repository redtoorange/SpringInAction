package annotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    // Constructor annotation inject
    @Autowired
    public BaseballCoach( @Qualifier("happyFortuneService") FortuneService service){
        fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
