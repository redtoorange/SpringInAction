package xmlexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlexample/appConfig.xml");

        // use bean
        Coach coach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        if(coach instanceof CricketCoach){
            CricketCoach cc = (CricketCoach)coach;
            System.out.println(cc.getEmailAddress());
            System.out.println(cc.getTeamName());
        }

        // close context
        context.close();
    }
}
