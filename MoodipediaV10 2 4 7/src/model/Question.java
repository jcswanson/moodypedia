/*
File name: Question.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;

public class Question {

    // Instance Variables -- define your private data
    private static int idCounter = 0;
    private int id;
    private String body;
    private String answer;

    // Constructors
    public Question(String body) {
        this.body = body;
        this.id = ++idCounter;
    }

    // Constructors
    public Question(String body, String answer) {
        this(body);
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}