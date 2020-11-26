/*
File name: User.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
 */
package model;

import java.util.logging.Logger;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
// Instance Variables -- define your private data

    private StringProperty firstName = new SimpleStringProperty();
    private StringProperty lastName= new SimpleStringProperty();
    private IntegerProperty weight= new SimpleIntegerProperty();
    private StringProperty height= new SimpleStringProperty();
    private StringProperty gender= new SimpleStringProperty();
    private IntegerProperty age= new SimpleIntegerProperty();

// Constructors
    public User(String fn, String ln, int wt, String ht, String g, int ag) {
// initialize default values
        this.firstName.set(fn);
        this.lastName.set(ln);
        this.weight.set(wt);
        this.height.set(ht);
        this.gender.set(g);
        this.age.set(ag);

    }

    public User() {
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public IntegerProperty weightProperty() {
        return weight;
    }

    public StringProperty heightProperty() {
        return height;
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public int getWeight() {
        return weight.get();
    }

    public void setWeight(int weight) {
        this.weight.set(weight);
    }

    public String getHeight() {
        return height.get();
    }

    public void setHeight(String height) {
        this.height.set(height);
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", userName=" + weight + ", password=" + height + '}';
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public int getAge() {
        return age.get();
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public String getAgeString() {
        return this.age + "";
    }

    public String getWeightString() {
        return weight + "";

    }

    public void setAgeString(String ageStr) {
        this.age.set(Integer.parseInt(ageStr));
    }

    public void setWeightString(String wgtStr) {
        this.weight.set(Integer.parseInt(wgtStr));
    }
    private static final Logger LOG = Logger.getLogger(User.class.getName());

}
