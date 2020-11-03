
package moodipedia;

import Controller.*;
import Model.*;
import View.*;

public class Moodipedia {

  
    public static void main(String[] args) {
        
    View view = new View();
    Model model = new Model();
    Controller controller = new Controller(model, view);
        
    }
    
}
