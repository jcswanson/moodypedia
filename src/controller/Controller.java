/*
File name: Controller.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 4, 2020
*/

package controller;

import model.Model;

public class Controller{
// Instance Variables -- define your private data
Model model;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }


// Constructors
public Controller(Model model){
    this.model = model;
}

}