package annotationexample;

import org.springframework.stereotype.Component;

@Component
public class SkiCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Ski down a double black diamond slope.";
    }

    @Override
    public String getDailyFortune() {
        return "No Fortune for you.";
    }
}
