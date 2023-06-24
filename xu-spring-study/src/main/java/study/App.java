package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.entity.Person;

/**
 * @Author: xuming
 * @Date: 2023-06-24 15:14
 * @Version: 1.0
 * @Description: TODO
 **/
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = context.getBean(Person.class);
        person.say();
    }
}
