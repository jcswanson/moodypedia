/*
File name: Account.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Account extends User implements MoveData {
// Instance Variables -- define your private data

    private StringProperty username = new SimpleStringProperty();
    private StringProperty password = new SimpleStringProperty();
    private StringProperty email = new SimpleStringProperty();
//   Username is test and password is test!    

// Constructors
    public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, String pw, String em) {
// initialize default values
        super(fn, ln, wt, ht, g, ag);
        this.username.set(un);
        this.password.set(pw);
        this.email.set(em);

    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", email=" + email + '}';
    }

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public ObservableList<String> getAccountData() {
        ObservableList<String> accData = FXCollections.observableArrayList();
        accData.add(username.get());
        accData.add(password.get());
        accData.add(email.get());
        accData.add(super.getFirstName());
        accData.add(super.getLastName());
        accData.add(super.getGender());
        accData.add(super.getHeight());
        accData.add(super.getAge() + "");
        accData.add(super.getWeight() + "");

        return accData;
    }

    @Override
    public ArrayList<String> getAccountData(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receiveData(ArrayList<String> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
