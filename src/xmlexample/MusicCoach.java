package xmlexample;

public class MusicCoach implements Coach {
    private FortuneService fortuneService;

    public MusicCoach(FortuneService service){
        fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice piano for 45 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
