package xmlexample;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new TrackCoach(new HappyFortuneService());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }
}
