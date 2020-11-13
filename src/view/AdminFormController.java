package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import model.*;
import controller.*;
import controller.Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author jcswa
 */
public class AdminFormController implements Initializable {

    //signup componets
    @FXML
    private TextField lnTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField htTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField fnTextField;
    @FXML
    private TextField wgtTextField;
    @FXML
    private TextField gendTextField;
    @FXML
    private PasswordField pwTextfield1;
    @FXML
    private PasswordField pwTextfield2;
    @FXML
    private TextField usernTextField;
    @FXML
    private Button signupButton;
    @FXML
    private Hyperlink loginLink;
    
    //Account comoponets below
    @FXML
    private TitledPane accountTitle;
    @FXML
    private ImageView accountIcon;
    @FXML
    private Button saveButton;
    @FXML
    private Label accountInfoTitle;
    @FXML
    private Label fnLabel;
    @FXML
    private TextField fn;
    @FXML
    private Label lnLabel;
    @FXML
    private TextField ln;
    @FXML
    private Label unLabel;
    @FXML
    private TextField un;
    @FXML
    private Label pwLabel;
    @FXML
    private PasswordField pw;
    @FXML
    private Label emailLabel;
    @FXML
    private TextField email;
    @FXML
    private Label heightLabel;
    @FXML
    private TextField height;
    @FXML
    private Label weightLabel;
    @FXML
    private TextField accountWeight;
    @FXML
    private Label genderLabel;
    @FXML
    private TextField accountGender;
    @FXML
    private Label ageLabel;
    @FXML
    private TextField age;
    @FXML
    private Label accountUserInfoTitle;
    @FXML
    private ImageView accountLogo;
    @FXML
    private Button returnButton;
    
    //login componets
    @FXML
    private Label messageLabel;
    @FXML
    private TextField loginUnField;
    @FXML
    private PasswordField loginPwField;
    @FXML
    private Button loginButton;
    @FXML
    private ImageView loginLogo;
    @FXML
    private Button loginSignupButton;
    @FXML 
    private TitledPane title;
    Model model;
    Controller controller;
  
     @FXML 
    public void handleLogin(ActionEvent e) throws IOException{
        System.out.println("Login Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("MainFrame.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage mfWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        mfWindow.setScene(scene);
        mfWindow.show();  
    }
/*
        if (model.confirmLogin(loginPwField.getText(), loginUnField.getText())){
       }else{
            messageLabel.setText("Sorry, Invalid Credentials!");
            loginPwField.setText("");
            loginUnField.setText("");
        }
    }
*/      
    public void displaySignupForm(ActionEvent e) throws IOException{
        System.out.println("Signup Button Clicked");
        
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("SignupForm.fxml"));
        Scene scene = new Scene(mainFrameParent);
       
        // Get the stage information by casting the stage to a node
        Stage signupWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
        
        signupWindow.setScene(scene);
        signupWindow.show();  
        
    }
    public void registerUser(ActionEvent e){
      System.out.println("signup time"); 
    }
    //collect String data from text fields
    public String sendStringData(TextField object){
         System.out.println("signup time");
         String str = object.getText();
         return str;  
    }
    // collect int data from TextFields
    public int sendIntData(TextField number){
        String str = number.getText();
        int num = Integer.parseInt(str);
        return num;
    }
    
    public void signupUser(ActionEvent e){
        System.out.println("Account updated");
        Account newUser = new Account();
        newUser.setFirstName(sendStringData(getFnTextField()));
        newUser.setLastName(sendStringData(getLnTextField()));
        newUser.setEmail(sendStringData(getEmailTextField()));
        newUser.setGender(sendStringData(getGendTextField()));
    }

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
     /**
     * @return the lnTextField
     */
    public TextField getLnTextField() {
        return lnTextField;
    }

    /**
     * @param lnTextField the lnTextField to set
     */
    public void setLnTextField(TextField lnTextField) {
        this.lnTextField = lnTextField;
    }

    /**
     * @return the ageTextField
     */
    public TextField getAgeTextField() {
        return ageTextField;
    }

    /**
     * @param ageTextField the ageTextField to set
     */
    public void setAgeTextField(TextField ageTextField) {
        this.ageTextField = ageTextField;
    }

    /**
     * @return the htTextField
     */
    public TextField getHtTextField() {
        return htTextField;
    }

    /**
     * @param htTextField the htTextField to set
     */
    public void setHtTextField(TextField htTextField) {
        this.htTextField = htTextField;
    }

    /**
     * @return the emailTextField
     */
    public TextField getEmailTextField() {
        return emailTextField;
    }

    /**
     * @param emailTextField the emailTextField to set
     */
    public void setEmailTextField(TextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    /**
     * @return the fnTextField
     */
    public TextField getFnTextField() {
        return fnTextField;
    }

    /**
     * @param fnTextField the fnTextField to set
     */
    public void setFnTextField(TextField fnTextField) {
        this.fnTextField = fnTextField;
    }

    /**
     * @return the wgtTextField
     */
    public TextField getWgtTextField() {
        return wgtTextField;
    }

    /**
     * @param wgtTextField the wgtTextField to set
     */
    public void setWgtTextField(TextField wgtTextField) {
        this.wgtTextField = wgtTextField;
    }

    /**
     * @return the gendTextField
     */
    public TextField getGendTextField() {
        return gendTextField;
    }

    /**
     * @param gendTextField the gendTextField to set
     */
    public void setGendTextField(TextField gendTextField) {
        this.gendTextField = gendTextField;
    }

    /**
     * @return the pwTextfield1
     */
    public PasswordField getPwTextfield1() {
        return pwTextfield1;
    }

    /**
     * @param pwTextfield1 the pwTextfield1 to set
     */
    public void setPwTextfield1(PasswordField pwTextfield1) {
        this.pwTextfield1 = pwTextfield1;
    }

    /**
     * @return the pwTextfield2
     */
    public PasswordField getPwTextfield2() {
        return pwTextfield2;
    }

    /**
     * @param pwTextfield2 the pwTextfield2 to set
     */
    public void setPwTextfield2(PasswordField pwTextfield2) {
        this.pwTextfield2 = pwTextfield2;
    }

    /**
     * @return the usernTextField
     */
    public TextField getUsernTextField() {
        return usernTextField;
    }

    /**
     * @param usernTextField the usernTextField to set
     */
    public void setUsernTextField(TextField usernTextField) {
        this.usernTextField = usernTextField;
    }

    /**
     * @return the signupButton
     */
    public Button getSignupButton() {
        return signupButton;
    }

    /**
     * @param signupButton the signupButton to set
     */
    public void setSignupButton(Button signupButton) {
        this.signupButton = signupButton;
    }

    /**
     * @return the loginLink
     */
    public Hyperlink getLoginLink() {
        return loginLink;
    }

    /**
     * @param loginLink the loginLink to set
     */
    public void setLoginLink(Hyperlink loginLink) {
        this.loginLink = loginLink;
    }

    /**
     * @return the accountTitle
     */
    public TitledPane getAccountTitle() {
        return accountTitle;
    }

    /**
     * @param accountTitle the accountTitle to set
     */
    public void setAccountTitle(TitledPane accountTitle) {
        this.accountTitle = accountTitle;
    }

    /**
     * @return the accountIcon
     */
    public ImageView getAccountIcon() {
        return accountIcon;
    }

    /**
     * @param accountIcon the accountIcon to set
     */
    public void setAccountIcon(ImageView accountIcon) {
        this.accountIcon = accountIcon;
    }

    /**
     * @return the saveButton
     */
    public Button getSaveButton() {
        return saveButton;
    }

    /**
     * @param saveButton the saveButton to set
     */
    public void setSaveButton(Button saveButton) {
        this.saveButton = saveButton;
    }

    /**
     * @return the accountInfoTitle
     */
    public Label getAccountInfoTitle() {
        return accountInfoTitle;
    }

    /**
     * @param accountInfoTitle the accountInfoTitle to set
     */
    public void setAccountInfoTitle(Label accountInfoTitle) {
        this.accountInfoTitle = accountInfoTitle;
    }

    /**
     * @return the fnLabel
     */
    public Label getFnLabel() {
        return fnLabel;
    }

    /**
     * @param fnLabel the fnLabel to set
     */
    public void setFnLabel(Label fnLabel) {
        this.fnLabel = fnLabel;
    }

    /**
     * @return the fn
     */
    public TextField getFn() {
        return fn;
    }

    /**
     * @param fn the fn to set
     */
    public void setFn(TextField fn) {
        this.fn = fn;
    }

    /**
     * @return the lnLabel
     */
    public Label getLnLabel() {
        return lnLabel;
    }

    /**
     * @param lnLabel the lnLabel to set
     */
    public void setLnLabel(Label lnLabel) {
        this.lnLabel = lnLabel;
    }

    /**
     * @return the ln
     */
    public TextField getLn() {
        return ln;
    }

    /**
     * @param ln the ln to set
     */
    public void setLn(TextField ln) {
        this.ln = ln;
    }

    /**
     * @return the unLabel
     */
    public Label getUnLabel() {
        return unLabel;
    }

    /**
     * @param unLabel the unLabel to set
     */
    public void setUnLabel(Label unLabel) {
        this.unLabel = unLabel;
    }

    /**
     * @return the un
     */
    public TextField getUn() {
        return un;
    }

    /**
     * @param un the un to set
     */
    public void setUn(TextField un) {
        this.un = un;
    }

    /**
     * @return the pwLabel
     */
    public Label getPwLabel() {
        return pwLabel;
    }

    /**
     * @param pwLabel the pwLabel to set
     */
    public void setPwLabel(Label pwLabel) {
        this.pwLabel = pwLabel;
    }

    /**
     * @return the pw
     */
    public PasswordField getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(PasswordField pw) {
        this.pw = pw;
    }

    /**
     * @return the emailLabel
     */
    public Label getEmailLabel() {
        return emailLabel;
    }

    /**
     * @param emailLabel the emailLabel to set
     */
    public void setEmailLabel(Label emailLabel) {
        this.emailLabel = emailLabel;
    }

    /**
     * @return the email
     */
    public TextField getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(TextField email) {
        this.email = email;
    }

    /**
     * @return the heightLabel
     */
    public Label getHeightLabel() {
        return heightLabel;
    }

    /**
     * @param heightLabel the heightLabel to set
     */
    public void setHeightLabel(Label heightLabel) {
        this.heightLabel = heightLabel;
    }

    /**
     * @return the height
     */
    public TextField getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(TextField height) {
        this.height = height;
    }

    /**
     * @return the weightLabel
     */
    public Label getWeightLabel() {
        return weightLabel;
    }

    /**
     * @param weightLabel the weightLabel to set
     */
    public void setWeightLabel(Label weightLabel) {
        this.weightLabel = weightLabel;
    }

    /**
     * @return the accountWeight
     */
    public TextField getAccountWeight() {
        return accountWeight;
    }

    /**
     * @param accountWeight the accountWeight to set
     */
    public void setAccountWeight(TextField accountWeight) {
        this.accountWeight = accountWeight;
    }

    /**
     * @return the genderLabel
     */
    public Label getGenderLabel() {
        return genderLabel;
    }

    /**
     * @param genderLabel the genderLabel to set
     */
    public void setGenderLabel(Label genderLabel) {
        this.genderLabel = genderLabel;
    }

    /**
     * @return the accountGender
     */
    public TextField getAccountGender() {
        return accountGender;
    }

    /**
     * @param accountGender the accountGender to set
     */
    public void setAccountGender(TextField accountGender) {
        this.accountGender = accountGender;
    }

    /**
     * @return the ageLabel
     */
    public Label getAgeLabel() {
        return ageLabel;
    }

    /**
     * @param ageLabel the ageLabel to set
     */
    public void setAgeLabel(Label ageLabel) {
        this.ageLabel = ageLabel;
    }

    /**
     * @return the age
     */
    public TextField getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(TextField age) {
        this.age = age;
    }

    /**
     * @return the accountUserInfoTitle
     */
    public Label getAccountUserInfoTitle() {
        return accountUserInfoTitle;
    }

    /**
     * @param accountUserInfoTitle the accountUserInfoTitle to set
     */
    public void setAccountUserInfoTitle(Label accountUserInfoTitle) {
        this.accountUserInfoTitle = accountUserInfoTitle;
    }

    /**
     * @return the accountLogo
     */
    public ImageView getAccountLogo() {
        return accountLogo;
    }

    /**
     * @param accountLogo the accountLogo to set
     */
    public void setAccountLogo(ImageView accountLogo) {
        this.accountLogo = accountLogo;
    }

    /**
     * @return the returnButton
     */
    public Button getReturnButton() {
        return returnButton;
    }

    /**
     * @param returnButton the returnButton to set
     */
    public void setReturnButton(Button returnButton) {
        this.returnButton = returnButton;
    }

    /**
     * @return the messageLabel
     */
    public Label getMessageLabel() {
        return messageLabel;
    }

    /**
     * @param messageLabel the messageLabel to set
     */
    public void setMessageLabel(Label messageLabel) {
        this.messageLabel = messageLabel;
    }

    /**
     * @return the loginUnField
     */
    public TextField getLoginUnField() {
        return loginUnField;
    }

    /**
     * @param loginUnField the loginUnField to set
     */
    public void setLoginUnField(TextField loginUnField) {
        this.loginUnField = loginUnField;
    }

    /**
     * @return the loginPwField
     */
    public PasswordField getLoginPwField() {
        return loginPwField;
    }

    /**
     * @param loginPwField the loginPwField to set
     */
    public void setLoginPwField(PasswordField loginPwField) {
        this.loginPwField = loginPwField;
    }

    /**
     * @return the loginButton
     */
    public Button getLoginButton() {
        return loginButton;
    }

    /**
     * @param loginButton the loginButton to set
     */
    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    /**
     * @return the loginLogo
     */
    public ImageView getLoginLogo() {
        return loginLogo;
    }

    /**
     * @param loginLogo the loginLogo to set
     */
    public void setLoginLogo(ImageView loginLogo) {
        this.loginLogo = loginLogo;
    }

    /**
     * @return the loginSignupButton
     */
    public Button getLoginSignupButton() {
        return loginSignupButton;
    }

    /**
     * @param loginSignupButton the loginSignupButton to set
     */
    public void setLoginSignupButton(Button loginSignupButton) {
        this.loginSignupButton = loginSignupButton;
    }

    /**
     * @return the title
     */
    public TitledPane getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(TitledPane title) {
        this.title = title;
    }
}


