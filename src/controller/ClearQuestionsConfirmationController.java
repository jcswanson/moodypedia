/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author apple
 */
public class ClearQuestionsConfirmationController implements Initializable {

    @FXML
    private AnchorPane clearQuestionFrame;
    @FXML
    private Button exitQuestionsClear;
    @FXML
    private Button yesQuestionsClear;
    @FXML
    private Label clearQuestionsMessageLabel;
    
   // private SettingsController SC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void displaySettings(ActionEvent e) throws IOException {
        //go the settings screen of the logged in user
         System.out.println("Settings Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/Settings.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage settingsWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        settingsWindow.setScene(scene);
        settingsWindow.show();  
        //TODO
        
    }
    
    @FXML
    private void clearQuestions(ActionEvent e) throws IOException {
       // SC.clearQuestions();
        clearQuestionsMessageLabel.setText("Questions have been wiped!");
        
    }

    
}
