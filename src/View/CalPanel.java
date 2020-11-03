package View;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CalPanel extends JPanel {

    JPanel cp;
    JButton nextMonth, prevMonth;
    DefaultTableModel calendarDefault;
    JTable calendarTable;
    int actualYear, actualMonth, actualDay;
    int currentYear, currentMonth; 
    JScrollPane pane;
    JLabel month;

    GregorianCalendar gCal = new GregorianCalendar();

    public CalPanel() {

        super();
        
        this.setSize(300, 250); 
        this.setVisible(true);
        this.setBackground(Color.white);
        
        LayoutSetupMAC();
                  
        calendarDefault = new DefaultTableModel();       
        
        calendarTable = new JTable(calendarDefault);
        
        cp = new JPanel();
        month = new JLabel("October");
        pane = new JScrollPane(calendarTable);
        ImageIcon logo = new ImageIcon(this.getClass().getResource("./MPlogo1Lg.png"));
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(logo);
        this.add(logoLabel);
        this.setBorder(BorderFactory.createTitledBorder("Calendar"));
        this.add(pane);
        this.add(month);
        //this.add(prevMonth);
        //this.add(nextMonth);
      
        int month = gCal.get(Calendar.MONTH);
        int year = gCal.get(Calendar.YEAR);
           
        actualDay = gCal.get(GregorianCalendar.DAY_OF_MONTH);
        actualMonth = gCal.get(GregorianCalendar.MONTH);
        actualYear = gCal.get(GregorianCalendar.YEAR);

        String[] days = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
        for (int i = 0; i < 7; ++i) {
            calendarDefault.addColumn(days[i]);
        }

        calendarTable.getTableHeader().setResizingAllowed(false);
        calendarTable.getTableHeader().setReorderingAllowed(false);

        //setting the table
        calendarTable.setRowHeight(30);
        calendarDefault.setColumnCount(7);
        calendarDefault.setRowCount(5);
        
        int startMonth;
        int numberMonth;
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        startMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);
        numberMonth = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        
        //Draw calendar
        for (int i=1; i<=numberMonth; i++){
            int row = (i+startMonth-2)/7;
            int column  =  (i+startMonth-2)%7;
            calendarTable.setValueAt(i, row, column);
        }
        
        //day selection
        calendarTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        calendarTable.setRowSelectionAllowed(true);
        calendarTable.setColumnSelectionAllowed(true);
        
        //changeCalendar(currentMonth, currentYear);       
    }
    /*
    public void changeCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

        int numDays, startMonth;

        prevMonth.setEnabled(true);
        nextMonth.setEnabled(true);
        
        //month.setText(months[month]);

    }
    */
    
    //add actionlisteners
      //prevMonth.addActionListener(new prevMonth());
      //nextMonth.addActionListener(new nextMonth());
          
/*
    public class prevMonth implements ActionListener {

        
        public void actionPerformed(ActionEvent e) {
            if (currentMonth == 0) { //Back one year
                currentMonth = 11;
                currentYear -= 1;
            } else { //Back one month
                currentMonth -= 1;
            }
            changeCalendar(currentMonth, currentYear);
        }

    }

    public class nextMonth implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (currentMonth == 11) { //Foward one year
                currentMonth = 0;
                currentYear += 1;
            } else { //Foward one month
                currentMonth += 1;
            }
            changeCalendar(currentMonth, currentYear);
        }
    }
    
*/
    void LayoutSetupMAC() {
    // On some MACs it might be necessary to have the statement below 
    //for the background color of the button to appear    
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
                  
    }
    

}
