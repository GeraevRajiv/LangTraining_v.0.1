package ru.innopolis.geraev.langtraining.entity;

/**
 * Created by Rajiv on 06.11.2016.
 */
public class User {
    private Integer id;

    private String username;

    private String password;

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }

    public Integer getId() { return id; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

}
