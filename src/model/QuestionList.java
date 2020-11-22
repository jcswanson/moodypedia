/*
File name: QuestionList.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;


import java.util.ArrayList;

public class QuestionList{
// Instance Variables -- define your private data

    Question question;
    
    private ArrayList<String>questionList;


    // Constructors
    public QuestionList(ArrayList<String>questionList){
    // initialize default values
    this.questionList = questionList;
    questionList.add(question.getQuestionOne());
    questionList.add(question.getQuestionTwo());
    questionList.add(question.getQuestionThree());
    questionList.add(question.getQuestionFour());
    questionList.add(question.getQuestionFive());

}
    public QuestionList(){
}

    /**
     * @return the questionList
     */
    public ArrayList<String> getQuestionList() {
        return questionList;
    }

    /**
     * @param questionList the questionList to set
     */
    public void setQuestionList(ArrayList<String> questionList) {
        this.questionList = questionList;
    }

}