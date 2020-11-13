/*
File name: Account.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
*/

package model;

public class Account extends User{
// Instance Variables -- define your private data
private String username;
private String password;
private String email;


// Constructors
public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, String pw, String em){
// initialize default values
super(fn, ln, wt, ht, g, ag);
this.username = un;
this.password = pw;
this.email = em;


}
public Account(){
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

}