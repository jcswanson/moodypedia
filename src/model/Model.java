/*
File name: Model.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
*/

package model;

import java.util.ArrayList;

public class Model {

// Instance Variables -- define your private data 
    ArrayList<Account> testUsers = new ArrayList<>();

// Constructors 
    public Model() {
        
        Account john = new Account("John", "Swanson", 300, "6'3","M",35, "test", "test", "test@test.com");
        Account steven = new Account("Steven", "Roxberry", 180, "5'11","M",21, "test2", "test", "test2@test.com");
        Account nina = new Account("Nina", "Sudheesh", 110, "5'1","F", 20,"test3","test", "test3@test.com");
        
        testUsers.add(nina);
        testUsers.add(john);
        testUsers.add(steven);
    }
    public ArrayList<Account> getTestUsers() {
        return testUsers;
    }

    public void setTestUsers(ArrayList<Account> testUsers) {
        this.testUsers = testUsers;
    }
    public String welcomeUser(String username){
         for(int i =0;i < testUsers.size() ;i++){
             if(testUsers.get(i).getUsername().equalsIgnoreCase(username))
                 return testUsers.get(i).getFirstName();
         }
         return "";
    }
    public boolean confirmLogin(String pw, String un){
      
        for(int i =0;i < testUsers.size() ;i++){
            if(testUsers.get(i).getPassword().equalsIgnoreCase(pw) && testUsers.get(i).getPassword().equalsIgnoreCase(un))
                
                return true;
            
    }
        return false;
}
}