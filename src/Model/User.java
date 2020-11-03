/*
File name: User.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Oct 17, 2020
*/

package Model;

public class User{
// Instance Variables -- define your private data
private String firstName;
private String lastName;
private String userName;
private String password;

// Constructors
public User(String fn, String ln, String un, String pw){
// initialize default values
this.firstName = fn;
this.lastName = ln;
this.userName = un;
this.password = pw;

}
public User(){
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + '}';
    }

}