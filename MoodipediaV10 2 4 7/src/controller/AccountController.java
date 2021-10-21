/*
File name: AccountController.java
Short description:
IST 261 Assignment:
@author jcswa
@version 1.01 Nov 14, 2020
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Account;
import model.Model;
import model.Store;

public class AccountController implements Initializable {

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

    private Model model;
    private AdminFormController afc;
    private Account currentAccount;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        currentAccount = Store.getInstance().getCurrentAccount();
        
        displayAccount();
    }

    public void displayAccount() {
        
        //populate Signup form info to Account form
        fn.setText(currentAccount.getFirstName());
        ln.setText(currentAccount.getLastName());
        email.setText(currentAccount.getEmail());
        un.setText(currentAccount.getUsername());
        height.setText(currentAccount.getHeight());
        pw.setText(currentAccount.getPassword());
        age.setText(Integer.toString(currentAccount.getAge()));
        accountWeight.setText(Integer.toString(currentAccount.getWeight()));
        accountGender.setText(currentAccount.getGender());
        
        
        updateAccountData(currentAccount);

    }
    
   

    public void updateAccountData(Account account) {
        // get textfield ints and strings set newAccount fields
        
        currentAccount.setFirstName(getFn().getText());
        currentAccount.setLastName(getLn().getText());
        currentAccount.setEmail(getEmail().getText());
        int age;
        age = sendIntData(getAge());
        currentAccount.setAge(age);
        currentAccount.setHeight(getHeight().getText());
        int wgt = sendIntData(getAccountWeight());
        currentAccount.setWeight(wgt);
        currentAccount.setGender(getAccountGender().getText());
        currentAccount.setUsername(getUn().getText());
        currentAccount.setPassword(getPw().getText());
    
   
    } //-------------------RETURN BUTTON METHOD---------------------------//


    public void returnToMainFrame(ActionEvent e) throws IOException {
        System.out.println("Return to MainFrame");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/MainFrame.fxml"));
        Parent mf = loader.load();
        Scene scene = new Scene(mf);
        // Get the stage information by casting the stage to a node
        Stage mfWindow = (Stage) ((Node) e.getSource()).getScene().getWindow();
        mfWindow.setScene(scene);
        mfWindow.show();
    }
    

    //collect String data from text fields
    public String sendStringData(TextField object) {
        System.out.println("signup time");
        String str = object.getText();
        return str;
    }

    // collect int data from TextFields
    public int sendIntData(TextField number) {
        String str = number.getText();
        int num = Integer.parseInt(str);
        return num;
    }

    //convert int to string
    public String intToStr(int num) {
        String str = "" + num;
        return str;
    }

    public void setAccountField(String str) {
        fn.setText(str);
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



    public Model getModel() {
        return model;
    }

    public AdminFormController getAfc() {
        return afc;
    }
}
