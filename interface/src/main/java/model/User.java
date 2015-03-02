package model;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class User {

    public User() {
    }

    public User(Integer id, String name, String surname, Integer password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    private Integer id;
    private String name;
    private String surname;
    private Integer password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
