package annotationexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationexample/appConfig.xml");

        Coach alphaCoach = context.getBean("trackCoach", Coach.class);
        Coach betaCoach = context.getBean("trackCoach", Coach.class);

        System.out.println( alphaCoach );
        System.out.println( betaCoach );
        System.out.println("Same memory location? " + (alphaCoach == betaCoach));

        context.close();
    }
}
