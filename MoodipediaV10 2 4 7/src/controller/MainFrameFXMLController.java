/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.QuestionList;
import model.Account;
import model.Model;
import model.Store;
import model.Journal;
import model.Question;
import model.Answer;
import model.AnswerList;
import model.JournalList;

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

    @FXML
    private Label journalSaveLabel;
    @FXML
    private Label answerSaveLabel;

    QuestionList QL;

    @FXML
    private ChoiceBox moodColorPicker;
    @FXML
    private Label moodColorLabel;
    @FXML 
    private Button moodColorButton;
    @FXML 
    private Label moodColorPickerLabel;
    
    private  Label selectedLabel;
    private  Button selectedButton;
   
    @FXML
    private  Label calMC0;
    @FXML
    private  Label calMC1;
    @FXML
    private  Label mcb1abel;
    @FXML
    private  Button mcb1;

    
    private Journal currentJournal;

    private Answer answer1;
    private Answer answer2;
    private Answer answer3;
    private Answer answer4;
    private Answer answer5;
  private Map<String, String> moodMap = new HashMap<>();
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TOD0


        //0This items are for configuring the ChoiceBox example
        moodColorPickerLabel.setText("");
        //MoodColor x = new MoodColor();  
       moodColorPicker.getItems().add("Happiness");
        moodColorPicker.getItems().add("Sadness");
        moodColorPicker.getItems().addAll("Elated", "Anger","Afraid", "Sick", "Depressed", "Anxious", "Calm");
              
        moodMap.put("Calm", "white");
        moodMap.put("Happiness", "yellow");
        moodMap.put("Anger", "red");
        moodMap.put("Sadness","blue");
        moodMap.put("Afraid", "purple");
        moodMap.put("Sick", "green");
        moodMap.put("Elated","orange");
        moodMap.put("Depressed", "black");
        moodMap.put("Anxious", "magenta");
    
        initializeQuestions();
              
    }
    
    
     
    //This will update the Label for the moodColorPicker ChoiceBox
    public void choiceBoxButtonPushed()
    {   String color = moodColorPicker.getValue().toString();
        moodColorPickerLabel.setText(color);
        selectedButton.setStyle("-fx-background-color: "+ moodMap.get(color));
        //moodColorPickerLabel.setTextFill(moodMap.get(color));
        //selectedLabel.setStyle("-fx-background-color: "+ moodMap.get(color));
        System.out.println(moodMap.get(color));
    }
    /*
    public void colorSave(){
        Account currentAccount = Store.getInstance().getCurrentAccount();
        QuestionList questionList = new QuestionList();
        questionList.getQuestionList().addAll(getAnswersFromUI());
        currentAccount.setQuestionList(questionList);
        saveAccount(currentAccount);
    }
    */
    
    
//    @FXML
    /*public void changemc1(MouseEvent e) throws IOException {
       //selectedButton =(Button) e.getSource();
       System.out.println("color");
    }*/
      
  
   public void test(ActionEvent e) throws IOException {
       selectedButton =(Button) e.getSource();
       System.out.println("color");
   }
   
    private void initializeQuestions() {
        List<Question> questionList = Store.getInstance().getCurrentAccount().getQuestionList().getQuestionList();
        for (int i = 0; i < questionList.size(); i++) 
        {
            Question question = questionList.get(i);
            switch (i) {
                case 0:
                    q1.setText(question.getBody());
                    break;
                case 1:
                    q2.setText(question.getBody());
                    break;
                case 2:
                    q3.setText(question.getBody());
                    break;
                case 3:
                    q4.setText(question.getBody());
                    break;
                case 4:
                    q5.setText(question.getBody());
                    break;
            }
        }
    }
    
      private void saveAccount(Account account) {
        Store.getInstance().saveAccount(account);
    }

  @FXML
    private void saveAnswers(ActionEvent e) throws IOException {
        answerSave();
        answerSaveLabel.setText("Answers Saved!");

    }

    public void answerSave() {
        Account currentAccount = Store.getInstance().getCurrentAccount();
        
        AnswerList answerList = new AnswerList();
       
        answerList.getAnswerList().addAll(getAnswersFromUI());
        currentAccount.setAnswerList(answerList);
        saveAccount(currentAccount);
    }

  
    private List<Answer> getAnswersFromUI() {
        String answer1 = a1.getText();
        String answer2 = a2.getText();
        String answer3 = a3.getText();
        String answer4 = a4.getText();
        String answer5 = a5.getText();
        return Arrays.asList(
                new Answer(answer1),
                new Answer(answer2),
                new Answer(answer3),
                new Answer(answer4),
                new Answer(answer5)
        );
    }

    @FXML
    private void saveJournal(ActionEvent e) throws IOException {
        saveJournal();
        journalSaveLabel.setText("Journal Saved!");

    }

    public void saveJournal() {
        Account currentAccount = Store.getInstance().getCurrentAccount();
        JournalList journalList = new JournalList();
        journalList.getJournalList().addAll(getJournalFromUI());
        currentAccount.setJournalList(journalList);
        saveAccount(currentAccount);
        
    }

    private List<Journal> getJournalFromUI() {
        String journal = journalText.getText();

        return Arrays.asList(
                new Journal(journal)
        );
    }
    


    @FXML
    private void displayAccount(ActionEvent e) throws IOException {
        //go the account screen of the logged in user
        System.out.println("Account Button Clicked");

        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/Account.fxml"));
        Scene scene = new Scene(mainFrameParent);

        // Get the stage information by casting the stage to a node
        Stage accountWindow = (Stage) ((Node) e.getSource()).getScene().getWindow();

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


    //close legend
    public void exitMCLegend(ActionEvent e) throws IOException {
        System.out.println("Mood Close Button Clicked");

        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/MainFrame.fxml"));
        Scene scene = new Scene(mainFrameParent);

        // Get the stage information by casting the stage to a node
        Stage mfWindow = (Stage) ((Node) e.getSource()).getScene().getWindow();

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
        Stage settingsWindow = (Stage) ((Node) e.getSource()).getScene().getWindow();

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

    /**
     * @return the currentJournal
     */
    public Journal getCurrentJournal() {
        return currentJournal;
    }

    /**
     * @param currentJournal the currentJournal to set
     */
    public void setCurrentJournal(Journal currentJournal) {
        this.currentJournal = currentJournal;
    }

    /**
     * @return the answer1
     */
    public Answer getAnswer1() {
        return answer1;
    }

    /**
     * @param answer1 the answer1 to set
     */
    public void setAnswer1(Answer answer1) {
        this.answer1 = answer1;
    }

    /**
     * @return the answer2
     */
    public Answer getAnswer2() {
        return answer2;
    }

    /**
     * @param answer2 the answer2 to set
     */
    public void setAnswer2(Answer answer2) {
        this.answer2 = answer2;
    }

    /**
     * @return the answer3
     */
    public Answer getAnswer3() {
        return answer3;
    }

    /**
     * @param answer3 the answer3 to set
     */
    public void setAnswer3(Answer answer3) {
        this.answer3 = answer3;
    }

    /**
     * @return the answer4
     */
    public Answer getAnswer4() {
        return answer4;
    }

    /**
     * @param answer4 the answer4 to set
     */
    public void setAnswer4(Answer answer4) {
        this.answer4 = answer4;
    }

    /**
     * @return the answer5
     */
    public Answer getAnswer5() {
        return answer5;
    }

    /**
     * @param answer5 the answer5 to set
     */
    public void setAnswer5(Answer answer5) {
        this.answer5 = answer5;
    }

}
