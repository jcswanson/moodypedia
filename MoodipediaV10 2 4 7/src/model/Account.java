/*
File name: Account.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
 */
package model;

import java.util.UUID;
import java.util.logging.Logger;

public class Account extends User {
// Instance Variables -- define your private data

    private String id;
    private String username;
    private String password;
    private String email;
    private QuestionList questionList;
    private AnswerList answerList;
    private JournalList journalList;

    // Constructors
    public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, String pw, String em) {
// initialize default values
        super(fn, ln, wt, ht, g, ag);
        this.username = un;
        this.password = pw;
        this.email = em;
        this.id = UUID.randomUUID().toString();
        this.questionList = new QuestionList();
    }

    public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, String pw, String em, QuestionList questionList) {
        this(fn, ln, wt, ht, g, ag, un, pw, em);
        this.questionList = questionList;
        
    }
    
     public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, 
            String pw, String em, QuestionList questionList, AnswerList answerList){
        this(fn, ln, wt, ht, g, ag, un, pw, em, questionList);
        this.answerList=answerList;
     }
    
    public Account(String fn, String ln, int wt, String ht, String g, int ag, String un, 
            String pw, String em, QuestionList questionList, AnswerList answerList, JournalList journalList){
        this(fn, ln, wt, ht, g, ag, un, pw, em, questionList, answerList);
        this.journalList = journalList;
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

    private static final Logger LOG = Logger.getLogger(Account.class.getName());

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QuestionList getQuestionList() {
        return questionList;
    }

    public void setQuestionList(QuestionList questionList) {
        this.questionList = questionList;
    }

    /**
     * @return the journalList
     */
    public JournalList getJournalList() {
        return journalList;
    }

    /**
     * @param journalList the journalList to set
     */
    public void setJournalList(JournalList journalList) {
        this.journalList = journalList;
    }

    /**
     * @return the answerList
     */
    public AnswerList getAnswerList() {
        return answerList;
    }

    /**
     * @param answerList the answerList to set
     */
    public void setAnswerList(AnswerList answerList) {
        this.answerList = answerList;
    }

}
