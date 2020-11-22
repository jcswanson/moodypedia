/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author apple
 */
public class SettingsController implements Initializable {
    
    ArrayList <String> questionArray;

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private TitledPane accountTitle;
    @FXML
    private ImageView accountIcon;
    @FXML
    private Button saveButtonSettings;
    @FXML
    private Label saveLabel;
    @FXML
    private ImageView accountLogo;
    @FXML
    private Button returnButton;
    @FXML
    private Button clearQuestionsButton;
    @FXML
    private Button resetButton;
    @FXML
    private Button changePasswordButton;
    @FXML
    private TabPane tabPane;
    @FXML
    private Tab updateQuestionsTab;
    @FXML
    private Pane updateQuestionsPane;
    @FXML
    private Label settingsQuestionTwoLabel;
    @FXML
    private TextField settingsQuestionOne;
    @FXML
    private TextField settingsQuestionTwo;
    @FXML
    private TextField settingsQuestionThree;
    @FXML
    private TextField settingsQuestionFour;
    @FXML
    private TextField settingsQuestionFive;
    
    
    private MainFrameFXMLController MFC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
     @FXML
     private void saveSettings(ActionEvent e) throws IOException {        
         saveQuestions();
         saveLabel.setText("Saved!");
     }

    
    public void saveQuestions(){
        questionArray = new ArrayList<>();
        
        String question1 = settingsQuestionOne.getText();
        String question2 = settingsQuestionTwo.getText();
        String question3 = settingsQuestionThree.getText();
        String question4 = settingsQuestionFour.getText();
        String question5 = settingsQuestionFive.getText();
        
        questionArray.add(question1);
        questionArray.add(question2);
        questionArray.add(question3);
        questionArray.add(question4);
        questionArray.add(question5);
    }
    
    public void clearQuestions(){
        
        
        settingsQuestionOne.clear();
        settingsQuestionTwo.clear();
        settingsQuestionThree.clear();
        settingsQuestionFour.clear();
        settingsQuestionFive.clear();
        
        questionArray.remove(0);
        questionArray.remove(1);
        questionArray.remove(2);
        questionArray.remove(3);
        questionArray.remove(4);
        
        MFC.getQ1().setText("N/A");
         MFC.getQ2().setText("N/A");
          MFC.getQ3().setText("N/A");
           MFC.getQ4().setText("N/A");
           MFC.getQ5().setText("N/A");
           
    }
    
    public void resetAccountInfo(){
        
    }
    @FXML
     private void displayResetConfirmation(ActionEvent e) throws IOException {
        //go the settings screen of the logged in user
         System.out.println("Reset Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/resetConfirmation.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage resetAccountWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        resetAccountWindow.setScene(scene);
        resetAccountWindow.show();  
        //TODO
        
    }
     @FXML
      private void displayChangePassword(ActionEvent e) throws IOException {
        //go the settings screen of the logged in user
         System.out.println("Reset Password Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/resetPasswordForm.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage resetPasswordWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        resetPasswordWindow.setScene(scene);
        resetPasswordWindow.show();  
        //TODO
        
    } 
     @FXML
       private void displayClearQuestionsConfirmation(ActionEvent e) throws IOException {
        //go the settings screen of the logged in user
         System.out.println("Clear Questions Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/clearQuestionsConfirmation.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage clearQuestionsWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        clearQuestionsWindow.setScene(scene);
        clearQuestionsWindow.show();  
        //TODO
        
    }
       @FXML
        private void returnMainFrame(ActionEvent e) throws IOException {
        //go the account screen of the logged in user
         System.out.println("Return to MainFrame Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/MainFrame.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage mfWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        mfWindow.setScene(scene);
        mfWindow.show();  
        //TODO
        
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

    /**
     * @return the settingsQuestionTwoLabel
     */
    public Label getSettingsQuestionTwoLabel() {
        return settingsQuestionTwoLabel;
    }

    /**
     * @param settingsQuestionTwoLabel the settingsQuestionTwoLabel to set
     */
    public void setSettingsQuestionTwoLabel(Label settingsQuestionTwoLabel) {
        this.settingsQuestionTwoLabel = settingsQuestionTwoLabel;
    }

    /**
     * @return the settingsQuestionOne
     */
    public TextField getSettingsQuestionOne() {
        return settingsQuestionOne;
    }

    /**
     * @param settingsQuestionOne the settingsQuestionOne to set
     */
    public void setSettingsQuestionOne(TextField settingsQuestionOne) {
        this.settingsQuestionOne = settingsQuestionOne;
    }

    /**
     * @return the settingsQuestionTwo
     */
    public TextField getSettingsQuestionTwo() {
        return settingsQuestionTwo;
    }

    /**
     * @param settingsQuestionTwo the settingsQuestionTwo to set
     */
    public void setSettingsQuestionTwo(TextField settingsQuestionTwo) {
        this.settingsQuestionTwo = settingsQuestionTwo;
    }

    /**
     * @return the settingsQuestionThree
     */
    public TextField getSettingsQuestionThree() {
        return settingsQuestionThree;
    }

    /**
     * @param settingsQuestionThree the settingsQuestionThree to set
     */
    public void setSettingsQuestionThree(TextField settingsQuestionThree) {
        this.settingsQuestionThree = settingsQuestionThree;
    }

    /**
     * @return the settingsQuestionFour
     */
    public TextField getSettingsQuestionFour() {
        return settingsQuestionFour;
    }

    /**
     * @param settingsQuestionFour the settingsQuestionFour to set
     */
    public void setSettingsQuestionFour(TextField settingsQuestionFour) {
        this.settingsQuestionFour = settingsQuestionFour;
    }

    /**
     * @return the settingsQuestionFive
     */
    public TextField getSettingsQuestionFive() {
        return settingsQuestionFive;
    }

    /**
     * @param settingsQuestionFive the settingsQuestionFive to set
     */
    public void setSettingsQuestionFive(TextField settingsQuestionFive) {
        this.settingsQuestionFive = settingsQuestionFive;
    }

    /**
     * @return the saveLabel
     */
    public Label getSaveLabel() {
        return saveLabel;
    }

    /**
     * @param saveLabel the saveLabel to set
     */
    public void setSaveLabel(Label saveLabel) {
        this.saveLabel = saveLabel;
    }
    
}
