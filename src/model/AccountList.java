/*
File name: AccountList.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 14, 2020
*/

package model;

import java.util.ArrayList;

public class AccountList implements MoveData{
// Instance Variables -- define your private data
private ArrayList<Account> accountList;

// Constructors
public AccountList(){
// initialize default values
        accountList = new ArrayList<>();
        Account john = new Account("John", "Swanson", 300, "6'3","M",35, "test", "test", "test@test.com");
        Account steven = new Account("Steven", "Roxberry", 180, "5'11","M",21, "test2", "test", "test2@test.com");
        Account nina = new Account("Nina", "Sudheesh", 110, "5'1","F", 20,"test3","test", "test3@test.com");
      
      
        accountList.add(nina);
        accountList.add(john);
        accountList.add(steven);
       
}
    public void addAccount(Account acc){
        accountList.add(acc);
    }
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
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