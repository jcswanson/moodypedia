/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jcswa
 */
public class SignupFormController implements Initializable {

    @FXML
    private TextField lnTextField;
    @FXML
    private TextField bdTextField;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
