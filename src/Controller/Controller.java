package Controller;

import Model.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller {

    Model model;
    View view;

    public Controller(Model m, View v) {

        this.model = m;
        this.view = v;
        addListeners();
       
    }

    private void addListeners() {

        view.getLf().getLp().getLoginBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JButton obj = (JButton) e.getSource();
                if (obj == view.getLf().getLp().getLoginBtn()) {
                    if (model.confirmLogin(view.getLf().getLp().getPassword().getText(), view.getLf().getLp().getUsername().getText())) {
                        // Send Welcome Message, open MainFrame, close LoginFrame
                        view.getLf().getLp().getResultLabel().setText("Welcome " + model.welcomeUser(view.getLf().getLp().getUsername().getText()) + "!");
                        view.getMF().setVisible(true);
                        view.getLf().dispose();

                    } else {
                        // if confirmLogin() is false, display message and reset TextFields
                        view.getLf().getLp().getResultLabel().setText("False Credentials, Try Again");
                        view.getLf().getLp().getUsername().setText("");
                        view.getLf().getLp().getPassword().setText("");

                    }
                }
            }

        });
    }
}
