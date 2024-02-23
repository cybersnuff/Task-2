import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat cat1 =
                (Cat) applicationContext.getBean("cat");

        Cat cat2 =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Ссылаются ли HelloWorld на один объект? " + (bean==bean1));
        System.out.println("===========================================================");
        System.out.println("Ссылаются ли Cat на один объект? " + (cat1==cat2));


    }
}