package model;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class Human {
    private String id;
    private String name;
    private String surname;
    private Integer age;


    public void create(){
        System.out.println("human created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
