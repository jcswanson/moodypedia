/*
File name: Model.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
*/

package model;

public class Model {

// Instance Variables -- define your private data 

    private AccountList accountList;

    // Constructors
    public Model() {
        accountList = new AccountList();

    }

    public String welcomeUser(String username) {
        for (int i = 0; i < accountList.getAccountList().size(); i++) {
            if (accountList.getAccountList().get(i).getUsername().equalsIgnoreCase(username))
                return accountList.getAccountList().get(i).getFirstName();
        }
        return "";
    }

    public boolean confirmLogin(String pw, String un) {

        for (Account acc : accountList.getAccountList()) {
            if (acc.getPassword().equals(pw) && acc.getPassword().equals(un)) {
                return true;
            }

        }
        return false;
    }

    public AccountList getAccountList() {
        return accountList;
    }

    public void setAccountList(AccountList accountList) {
        this.accountList = accountList;
    }

}