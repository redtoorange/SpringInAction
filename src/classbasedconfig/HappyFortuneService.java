package classbasedconfig;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You'll have a great day!";
    }
}
