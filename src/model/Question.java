/*
File name: Question.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;

import controller.SettingsController;

public class Question{
    
    // Instance Variables -- define your private data
    private String questionOne;
    private String questionTwo;
    private String questionThree;
    private String questionFour;
    private String questionFive;
    
    SettingsController setCon;

    // Constructors
    public Question(String q1, String q2, String q3, String q4, String q5){
        questionOne=q1;
        questionTwo=q2;
        questionThree=q3;
        questionFour=q4;
        questionFive=q5;
    }
    
    public Question(){
        questionOne = setCon.getSettingsQuestionOne().getText();
        questionTwo = setCon.getSettingsQuestionTwo().getText();
        questionThree = setCon.getSettingsQuestionThree().getText();
        questionFour = setCon.getSettingsQuestionFour().getText();
        questionFive = setCon.getSettingsQuestionFive().getText();
    }

    /**
     * @return the questionOne
     */
    public String getQuestionOne() {
        return questionOne;
    }

    /**
     * @param questionOne the questionOne to set
     */
    public void setQuestionOne(String questionOne) {
        this.questionOne = questionOne;
    }

    /**
     * @return the questionTwo
     */
    public String getQuestionTwo() {
        return questionTwo;
    }

    /**
     * @param questionTwo the questionTwo to set
     */
    public void setQuestionTwo(String questionTwo) {
        this.questionTwo = questionTwo;
    }

    /**
     * @return the questionThree
     */
    public String getQuestionThree() {
        return questionThree;
    }

    /**
     * @param questionThree the questionThree to set
     */
    public void setQuestionThree(String questionThree) {
        this.questionThree = questionThree;
    }

    /**
     * @return the questionFour
     */
    public String getQuestionFour() {
        return questionFour;
    }

    /**
     * @param questionFour the questionFour to set
     */
    public void setQuestionFour(String questionFour) {
        this.questionFour = questionFour;
    }

    /**
     * @return the questionFive
     */
    public String getQuestionFive() {
        return questionFive;
    }

    /**
     * @param questionFive the questionFive to set
     */
    public void setQuestionFive(String questionFive) {
        this.questionFive = questionFive;
    }
    
}