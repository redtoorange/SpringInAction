package classbasedconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyAppDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PropertyConfig.class);

        Coach coach = context.getBean("swimCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
