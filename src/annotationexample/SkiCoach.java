package annotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SkiCoach implements Coach {
    private FortuneService service;

    @Autowired
    public SkiCoach(@Qualifier("happyFortuneService") FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Ski down a double black diamond slope.";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void somethingElse(
             FortuneService service,
             FortuneService service2){
        System.out.println( "Inside somethingElse method" );
        System.out.println(service.getFortune());
        System.out.println(service2.getFortune());
    }

    @Autowired
    public void something(
            @Qualifier("happyFortuneService") FortuneService service,
            @Qualifier("randomFortuneService") FortuneService service2){
        System.out.println( "Inside something method" );
        System.out.println(service.getFortune());
        System.out.println(service2.getFortune());
    }
}
