/*
File name: QuestionList.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;


import java.util.ArrayList;
import java.util.List;

public class QuestionList {
// Instance Variables -- define your private data

    private List<Question> questionList;

    // Constructors
    public QuestionList() {
        questionList = new ArrayList<>();
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}