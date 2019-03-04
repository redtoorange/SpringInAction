package annotationexample;

import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach {
//    private FortuneService fortuneService;

//    public TrackCoach(FortuneService service) {
//        fortuneService = service;
//    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
//        return fortuneService.getFortune();
        return "";
    }

    public void create() {
        System.out.println("Created");
    }

    public void destroy() {
        System.out.println("Destroyed");
    }
}
