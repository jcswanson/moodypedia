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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.QuestionList;

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
    
    QuestionList QL;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
       // setQuestions();
    
        
    }    

    public void setQuestions(){
      //q1.setText(SC.getSettingsQuestionOne().getText());
      //q2.setText(SC.getSettingsQuestionTwo().getText());
      //q3.setText(SC.getSettingsQuestionThree().getText());
      //q4.setText(SC.getSettingsQuestionFour().getText());
      //q5.setText(SC.getSettingsQuestionFive().getText());
      
      q1.setText(QL.getQuestionList().get(0));
      q2.setText(QL.getQuestionList().get(1));
      q3.setText(QL.getQuestionList().get(2));
      q4.setText(QL.getQuestionList().get(3));
      q5.setText(QL.getQuestionList().get(4));
      
       
    }
    
    @FXML
    private void displayAccount(ActionEvent e) throws IOException {
        //go the account screen of the logged in user
         System.out.println("Account Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/Account.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage accountWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        accountWindow.setScene(scene);
        accountWindow.show();  
//         FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/view/Account.fxml"));
//        Parent signupForm = loader.load();
//        
//        Scene accountDataView = new Scene(signupForm);
//        Stage stage = new Stage();
//        stage.setScene(accountDataView);
//        //access Account Controller and send signup data to Textfields
//        
//        AccountController accControl = loader.getController();
//        accControl.saveAccountData();
//        stage.show();
//        
       
        
    }
    @FXML
    private void displayMCLegend(ActionEvent e) throws IOException {
      //go the account screen of the logged in user
       System.out.println("Mood color legend Button Clicked");

      Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/MoodColorLegend.fxml"));
      Scene scene = new Scene(mainFrameParent);

      // Get the stage information by casting the stage to a node
      Stage mcLegendWindow = (Stage)((Node)e.getSource()).getScene().getWindow();

      mcLegendWindow.setScene(scene);
      mcLegendWindow.show();  
      //TODO

  }
    //close legend
     public void exitMCLegend(ActionEvent e) throws IOException{
        System.out.println("Mood Close Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/MainFrame.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage mfWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        mfWindow.setScene(scene);
        mfWindow.show(); 
    }
     
      @FXML
    private void displaySettings(ActionEvent e) throws IOException {
      //go the settings screen of the logged in user
       System.out.println("Settings button clicked");

     Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/Settings.fxml"));
      Scene scene = new Scene(mainFrameParent);

      // Get the stage information by casting the stage to a node
      Stage settingsWindow = (Stage)((Node)e.getSource()).getScene().getWindow();

      settingsWindow.setScene(scene);
      settingsWindow.show();  
      //TODO

  }

    /**
     * @return the q1
     */
    public Label getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(Label q1) {
        this.q1 = q1;
    }

    /**
     * @return the q5
     */
    public Label getQ5() {
        return q5;
    }

    /**
     * @param q5 the q5 to set
     */
    public void setQ5(Label q5) {
        this.q5 = q5;
    }

    /**
     * @return the q4
     */
    public Label getQ4() {
        return q4;
    }

    /**
     * @param q4 the q4 to set
     */
    public void setQ4(Label q4) {
        this.q4 = q4;
    }

    /**
     * @return the q3
     */
    public Label getQ3() {
        return q3;
    }

    /**
     * @param q3 the q3 to set
     */
    public void setQ3(Label q3) {
        this.q3 = q3;
    }

    /**
     * @return the q2
     */
    public Label getQ2() {
        return q2;
    }

    /**
     * @param q2 the q2 to set
     */
    public void setQ2(Label q2) {
        this.q2 = q2;
    }
 
}
