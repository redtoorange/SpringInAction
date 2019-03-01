package xmlexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

        // use bean
        Coach coach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
