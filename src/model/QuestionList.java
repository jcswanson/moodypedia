/*
File name: QuestionList.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;


import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class QuestionList{
// Instance Variables -- define your private data
    
    private ObservableList<Question>questionList;


    // Constructors
    public QuestionList(){
    // initialize default values
    this.questionList = FXCollections.observableArrayList();
    questionList.add(new Question());
    questionList.add(new Question());
    questionList.add(new Question());
    questionList.add(new Question());
    questionList.add(new Question());

}


    /**
     * @return the questionList
     */
    public ObservableList<Question> getQuestionList() {
        return questionList;
    }

    /**
     * @param questionList the questionList to set
     */
    public void setQuestionList(ObservableList<Question> questionList) {
        this.questionList = questionList;
    }

}