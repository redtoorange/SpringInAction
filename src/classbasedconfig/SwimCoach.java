package classbasedconfig;

public class SwimCoach implements Coach {
    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 10 laps!";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
