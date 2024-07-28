package com.minesaber.pojo;

/**
 * @author Minesaber
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
