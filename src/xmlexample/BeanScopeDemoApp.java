package xmlexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Testing how Bean Scopes work in Spring
 */
public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlexample/beanScope-applicationContext.xml");

        // If the bean is Singleton, they will be the same reference
        //  if the bean is prototype, they will be different.
        Coach betaCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        System.out.println("coach:      " + betaCoach);
        System.out.println("alphaCoach: " + alphaCoach);

        boolean result = betaCoach == alphaCoach;
        if (result) {
            System.out.println("They are the same reference");
        } else {
            System.out.println("They are different");
        }


        context.close();
    }
}
