/*
File name: User.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
 */
package model;

import java.util.logging.Logger;

public class User {
// Instance Variables -- define your private data

    private String firstName;
    private String lastName;
    private int weight;
    private String height;
    private String gender;
    private int age;

// Constructors
    public User(String fn, String ln, int wt, String ht, String g, int ag) {
// initialize default values
        this.firstName = fn;
        this.lastName = ln;
        this.weight = wt;
        this.height = ht;
        this.gender = g;
        this.age = ag;

    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", userName=" + weight + ", password=" + height + '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private static final Logger LOG = Logger.getLogger(User.class.getName());

}
