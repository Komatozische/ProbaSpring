package springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Кома on 31.03.2016.
 */
public class Go {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Unit1 unit = (Unit1) context.getBean("unit1");
        unit.say();
        unit.move();
        unit.attack();
    }
}
