package study.entity;

/**
 * @Author: xuming
 * @Date: 2023-06-24 15:15
 * @Version: 1.0
 * @Description: TODO
 **/

public class Person {

    private String name;

    private String email;

    private Integer age;

    public Person() {
    }

    public Person(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void say() {
        System.out.println("hello world");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

