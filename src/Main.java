import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.start();

        Customer cust = context.getBean(LegacyCustomer.class);
        cust.setName("Andrew");
        System.out.println("Hello " + cust.getName());

        context.close();
    }
}
