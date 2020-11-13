/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jcswa
 */
public class MainFrameFXMLController implements Initializable {

    @FXML
    private TitledPane title;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Button prevDate;
    @FXML
    private Button nextDate;
    @FXML
    private TextArea journalText;
    @FXML
    private Button addImage;
    @FXML
    private Button journalSave;
    @FXML
    private TextField a4;
    @FXML
    private TextField a1;
    @FXML
    private TextField a2;
    @FXML
    private TextField a3;
    @FXML
    private TextField a5;
    @FXML
    private Button questionSave;
    @FXML
    private Button date;
    @FXML
    private Label questionsTitle;
    @FXML
    private Label journalTitle;
    @FXML
    private Label q1;
    @FXML
    private Label q5;
    @FXML
    private Label q4;
    @FXML
    private Label q3;
    @FXML
    private Label q2;
    @FXML
    private Button moodButton;
    @FXML
    private Label moodLegend;
    @FXML
    private Label calendarMonth;
    @FXML
    private GridPane calendarPane;
    @FXML
    private Button settingsButton;
    @FXML
    private Button accountButton;
    @FXML
    private Label goalsTitle;
    @FXML
    private Label friLabel;
    @FXML
    private Hyperlink forgotPwLink;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void displayAccount(ActionEvent e) throws IOException {
        //go the account screen of the logged in user
         System.out.println("Account Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("Account.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage mfWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        mfWindow.setScene(scene);
        mfWindow.show();  
        //TODO
        
    }
    @FXML
    private void displayMCLegend(ActionEvent e) throws IOException {
      //go the account screen of the logged in user
       System.out.println("Mood color legend Button Clicked");

      Parent mainFrameParent = FXMLLoader.load(getClass().getResource("MoodColorLegend.fxml"));
      Scene scene = new Scene(mainFrameParent);

      // Get the stage information by casting the stage to a node
      Stage mcLegendWindow = (Stage)((Node)e.getSource()).getScene().getWindow();

      mcLegendWindow.setScene(scene);
      mcLegendWindow.show();  
      //TODO

  }
    
}
