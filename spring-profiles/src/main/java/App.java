import knight.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.greetings();
        applicationContext.start();
    }
}
