package classbasedconfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String teamName;

    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 10 laps! \n" + email + "\n" + teamName;
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
