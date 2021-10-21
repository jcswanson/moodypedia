
package model;

import java.util.ArrayList;

public class AnswerList{
// Instance Variables -- define your private data
    private ArrayList<Answer>answerList;


public AnswerList(){
   answerList = new ArrayList<Answer>();
}

    /**
     * @return the answerList
     */
    public ArrayList<Answer> getAnswerList() {
        return answerList; 
    }

    /**
     * @param answerList the answerList to set
     */
    public void setAnswerList(ArrayList<Answer> answerList) {
        this.answerList = answerList;
    }

}