package annotationexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationexample/appConfig.xml");

        // Explicitly get a bean by name
        Coach tc = context.getBean("trackCoach", Coach.class);

        // Find the first bean that satisfies the type
        Coach c = context.getBean(Coach.class);

        System.out.println(tc.getDailyWorkout());
        System.out.println(tc.getDailyFortune());

        context.close();
    }
}
