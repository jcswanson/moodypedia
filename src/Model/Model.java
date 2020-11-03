package Model;

import java.util.ArrayList;

public class Model {

// Instance Variables -- define your private data 
    ArrayList<User> testUsers;

// Constructors 
    public Model() {

        User john = new User("John", "Swanson", "test", "test");
        User steven = new User("Steven", "Roxberry", "scr5239", "scubasteve");
        User nina = new User("Nina", "Sudheesh", "nus688", "ninernina");
        testUsers = new ArrayList<>();
        testUsers.add(nina);
        testUsers.add(john);
        testUsers.add(steven);
   
    }

    public ArrayList<User> getTestUsers() {
        return testUsers;
    }

    public void setTestUsers(ArrayList<User> testUsers) {
        this.testUsers = testUsers;
    }
    public String welcomeUser(String username){
         for(int i =0;i < testUsers.size() ;i++){
             if(testUsers.get(i).getUserName().equalsIgnoreCase(username))
                 return testUsers.get(i).getFirstName();
         }
         return "";
    }
    public boolean confirmLogin(String pw, String un){
      
        for(int i =0;i < testUsers.size() ;i++){
            if(testUsers.get(i).getPassword().equalsIgnoreCase(pw) && testUsers.get(i).getUserName().equalsIgnoreCase(un))
                return true;
            
    }
        return false;
}
}