/*
File name: Answer.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;

import java.util.ArrayList;

public class Answer{
// Instance Variables -- define your private data
    private String body;
    private int id;
     private static int idCounter = 0;

public Answer(String body){
    
    this.body = body;
    this.id = ++idCounter;
}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

}