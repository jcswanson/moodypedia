

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