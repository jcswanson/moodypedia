/*
File name: Account.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
 */
package model;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Account extends User implements MoveData {
// Instance Variables -- define your private data

    private String username;
    private String password;
    private String email;

// Constructors
    public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, String pw, String em) {
// initialize default values
        super(fn, ln, wt, ht, g, ag);
        this.username = un;
        this.password = pw;
        this.email = em;

    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", email=" + email + '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public ArrayList<String> getAccountData() {
        ArrayList<String> accData = new ArrayList<>();
        accData.add(username);
        accData.add(password);
        accData.add(email);
        accData.add(super.getFirstName());
        accData.add(super.getLastName());
        accData.add(super.getGender());
        accData.add(super.getHeight());
        accData.add(super.getAge() + "");
        accData.add(super.getWeight() + "");

        return accData;
    }

}
