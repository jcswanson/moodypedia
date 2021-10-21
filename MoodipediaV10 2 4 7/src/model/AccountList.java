/*
File name: AccountList.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 14, 2020
 */
package model;

import java.util.ArrayList;

public class AccountList {
// Instance Variables -- define your private data

    private ArrayList<Account> accountList;

// Constructors
    public AccountList() {
        accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

}
