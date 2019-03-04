package annotationexample;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] fortunes = {
            "Fortune 0",
            "Fortune 1",
            "Fortune 2"};

    private Random random;

    public RandomFortuneService() {
        random = new Random();
    }

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
