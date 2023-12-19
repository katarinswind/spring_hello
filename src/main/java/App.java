import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean_0 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean_1 = (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean_0.getMessage());
//        System.out.println(bean_1.getMessage());

        Cat cat_0 = (Cat) applicationContext.getBean("cat");
        Cat cat_1 = (Cat) applicationContext.getBean("cat");

        System.out.printf("%b\n", bean_0 == bean_1);
        System.out.printf("%b\n", cat_0 == cat_1);
    }
}