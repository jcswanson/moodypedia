/*
File name: Question.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
 */
package model;

import controller.SettingsController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Question {

    // Instance Variables -- define your private data
    private StringProperty questionOne = new SimpleStringProperty();
    private StringProperty questionTwo = new SimpleStringProperty();
    private StringProperty questionThree = new SimpleStringProperty();
    private StringProperty questionFour = new SimpleStringProperty();
    private StringProperty questionFive = new SimpleStringProperty();

    // Constructors
    public Question(String q1, String q2, String q3, String q4, String q5) {
        this.questionOne.set(q1);
        this.questionTwo.set(q2);
        this.questionThree.set(q3);
        this.questionFour.set(q4);
        this.questionFive.set(q5);
    }

    public Question() {

    }

    public StringProperty questionOneProperty() {
        return questionOne;
    }

    public StringProperty questionTwoProperty() {
        return questionTwo;
    }

    public StringProperty questionThreeProperty() {
        return questionThree;
    }

    public StringProperty questionFourProperty() {
        return questionFour;
    }

    public StringProperty questionFiveProperty() {
        return questionFive;
    }

    /**
     * @return the questionOne
     */
    public String getQuestionOne() {
        return questionOne.get();
    }

    /**
     * @param questionOne the questionOne to set
     */
    public void setQuestionOne(String questionOne) {
        this.questionOne.set(questionOne);
    }

    /**
     * @return the questionTwo
     */
    public String getQuestionTwo() {
        return questionTwo.get();
    }

    /**
     * @param questionTwo the questionTwo to set
     */
    public void setQuestionTwo(String questionTwo) {
        this.questionTwo.set(questionTwo);
    }

    /**
     * @return the questionThree
     */
    public String getQuestionThree() {
        return questionThree.get();
    }

    /**
     * @param questionThree the questionThree to set
     */
    public void setQuestionThree(String questionThree) {
        this.questionThree.set(questionThree);
    }

    /**
     * @return the questionFour
     */
    public String getQuestionFour() {
        return questionFour.get();
    }

    /**
     * @param questionFour the questionFour to set
     */
    public void setQuestionFour(String questionFour) {
        this.questionFour.set(questionFour);
    }

    /**
     * @return the questionFive
     */
    public String getQuestionFive() {
        return questionFive.get();
    }

    /**
     * @param questionFive the questionFive to set
     */
    public void setQuestionFive(String questionFive) {
        this.questionFive.set(questionFive);
    }

}
