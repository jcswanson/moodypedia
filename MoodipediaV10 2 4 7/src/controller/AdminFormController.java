package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Account;
import model.AccountList;
import model.Model;
import model.Store;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author jcswa
 */
public class AdminFormController implements Initializable {

    //signup components
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

    //login components
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

    //App Data Access
    private Model model;
    private Controller controller;
    private Account newUser;

    public AdminFormController() {
        model = new Model();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //------THE ANSWER LIES HERE I THINK------//

    }

    //-------------------------INITIAL SCREEN AFTER LOGGING IN-------------------------------------//
 
        //-------------------------INITIAL SCREEN AFTER LOGGING IN-------------------------------------//
    public void handleLogin(ActionEvent e) throws IOException{
        System.out.println("Login Button Clicked");
        
        if (logUserIn(loginPwField.getText(), loginUnField.getText())){
             Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/MainFrame.fxml"));
            Scene scene = new Scene(mainFrameParent);

            // Get the stage information by casting the stage to a node
            Stage mfWindow = (Stage) ((Node) e.getSource()).getScene().getWindow();

            mfWindow.setScene(scene);

            mfWindow.show();
        } else {
            messageLabel.setText("Sorry, Invalid Credentials!");
            loginPwField.setText("");
            loginUnField.setText("");

        }
    }
    
    private boolean logUserIn(String pw, String un){
        AccountList accountList = Store.getInstance().getAccountListFromJson();
        for(Account acc: accountList.getAccountList()){
            if(acc.getPassword().equals(pw) && acc.getUsername().equals(un)) {
                Store.getInstance().setCurrentAccountId(acc.getId());
                return true;
            }
        }
        return false;
    }
    

    //--------------------------DISPLAY SIGNUP FORM------------------------------------------//

    public void displaySignupForm(ActionEvent e) throws IOException {
        System.out.println("Signup Button Clicked");
        newUser = new Account();
        Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/SignupForm.fxml"));
        Scene scene = new Scene(mainFrameParent);

        // Get the stage information by casting the stage to a node
        Stage signupWindow = (Stage) ((Node) e.getSource()).getScene().getWindow();

        signupWindow.setScene(scene);
        signupWindow.show();

    }

    //---------------------------------DISPLAY ACCOUNT VIEW ------------------------------//
    public void displayAccount() {
        //go the account screen of the logged in user
        try {
            System.out.println("Account Button Clicked");

            Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/Account.fxml"));
            Scene scene = new Scene(mainFrameParent);

            // Get the stage information by casting the stage to a node
            Stage accountWindow = new Stage();//(Stage)((Node)e.getSource()).getScene().getWindow();

            accountWindow.setScene(scene);
            accountWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    //-----------------------------LOGIN DISPLAY---------------------------//
    public void displayLogin(ActionEvent e) {
        //go the account screen of the logged in user
        try {
            System.out.println("Login Link Clicked");
            Parent mainFrameParent = FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"));
            Scene scene = new Scene(mainFrameParent);

            // Get the stage information by casting the stage to a node
            Stage logForm = (Stage) ((Node) e.getSource()).getScene().getWindow();

            logForm.setScene(scene);
            logForm.show();
        } catch (Exception ex) {
            ex.printStackTrace();
            ex.getCause();
        }
    }

    //------------------ SENDING USER TO ACCOUNT ------------------//
    public void sendUserToAccountList(ActionEvent e) throws IOException {
        Account newAccount = createNewUser();
        Store store = Store.getInstance();
        store.addAccount(newAccount);
        store.setCurrentAccountId(newAccount.getId());
        System.out.println(newAccount);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/MainFrame.fxml"));
        Parent signupForm = loader.load();

        Scene accountDataView = new Scene(signupForm);
        Stage stage = new Stage();
        stage.setScene(accountDataView);
        stage.show();

    }


    //-------------------CREATE A NEW ACCOUNT-----------------------//
    public Account createNewUser() {
        newUser = new Account();
        String fName = sendStringData(getFnTextField());
        String lName = sendStringData(getLnTextField());
        String email = sendStringData(getEmailTextField());
        int age;
        age = sendIntData(getAgeTextField());
        String height = sendStringData(getHtTextField());
        int weight = sendIntData(getWgtTextField());
        String gender = sendStringData(getGendTextField());
        String username = sendStringData(getUsernTextField());
        String pword1 = sendStringData(getPwTextfield1());
        String pword2 = sendStringData(getPwTextfield2());
        newUser = new Account(fName, lName, weight, height, gender, age, username, pword1, email);
        //--------------TROUBLE ADDING newUser TO ACCOUNTLIST-----------------------//
        model.getAccountList().getAccountList().add(newUser);
        System.out.println("Account updated");
        //check if passwords are equal
//        if(pword1.equals(pword2)){


        System.out.println(newUser.toString());

        //-------------SEND VIEW TO ACCOUNT----------//
//             displayAccount();
        return newUser;
//        }else{
//            //set pw fields to blank again
//            pwTextfield1.setText("");
//            pwTextfield2.setText("");
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

    public Account getNewUser() {
        return newUser;
    }

    public void setNewUser(Account newUser) {
        this.newUser = newUser;
    }

    public Model getModel() {
        return model;
    }

    public Controller getController() {
        return controller;
    }
}


