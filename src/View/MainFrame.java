package View; 

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{ 

    private CalPanel cp;

    public MainFrame(){ 

        super("Moodipedia");
        cp = new CalPanel();
        this.add(cp, "East");
        
        LayoutSetupMAC();
        
        this.setBackground(Color.GRAY);
        this.setSize(1300, 700);
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
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