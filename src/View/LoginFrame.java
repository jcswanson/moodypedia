package View; 

import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame{ 

    private LoginPanel lp;

    public LoginFrame(){ 

        super("Moodipedia Login");
        lp = new LoginPanel();
        this.add(lp);
        
        LayoutSetupMAC();
        
        this.setBackground(Color.WHITE);
        this.setSize(350, 250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    } 

    public LoginPanel getLp() {
        return lp;
    }

    public void setLp(LoginPanel lp) {
        this.lp = lp;
    }

            
    void LayoutSetupMAC() {
    // On some MACs it might be necessary to have the statement below 
    //for the background color of the button to appear    
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }
  

} 