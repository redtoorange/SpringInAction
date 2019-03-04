package xmlexample;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAddress;
    private String teamName;

    public CricketCoach(){
        System.out.println("Inside constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Play Cricket for 2 hours.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }
}
