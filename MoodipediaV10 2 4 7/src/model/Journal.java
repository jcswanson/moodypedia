/*
File name: Journal.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 18, 2020
*/

package model;

public class Journal{

     private static int idCounter = 0;
     private int id;
     private String body;
     
public Journal(String body){
// initialize default values
this.body = body;
this.id= idCounter++;

}
public Journal(){
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