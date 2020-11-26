/*
File name: AccountList.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 14, 2020
*/

package model;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AccountList implements MoveData{
// Instance Variables -- define your private data
private ObservableList<Account> accountList;

// Constructors
public AccountList(){
// initialize default values
        
        Account john = new Account("John", "Swanson", 300, "6'3","M",35, "test", "test", "test@test.com");
        Account steven = new Account("Steven", "Roxberry", 180, "5'11","M",21, "test2", "test", "test2@test.com");
        Account nina = new Account("Nina", "Sudheesh", 110, "5'1","F", 20,"test3","test", "test3@test.com");
      //   Username is test and password is test!    
       accountList = FXCollections.observableArrayList(john, steven, nina);
      
//        accountList.add(nina);
//        accountList.add(john);
//        accountList.add(steven);
       
}

    public void addAccount(Account acc){
        accountList.add(acc);
    }
    public ObservableList<Account> getAccountList() {
        return accountList;
    }
    public Account getLastAccount(){
        int num = accountList.size()-1;
        return accountList.get(num);
    }
    public void setAccountList(ObservableList<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public ArrayList<String> getAccountData(int index) {
       return null;
    }

    @Override
    public void receiveData(ArrayList<String> data) {
       
       
    }


}