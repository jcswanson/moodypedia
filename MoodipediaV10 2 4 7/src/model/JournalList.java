
  

package model; 

import java.util.ArrayList;

  

public class JournalList{ 

// Instance Variables -- define your private data 

  private ArrayList<Journal> journalList;
 
 

public JournalList(){ 
    
    journalList = new ArrayList<Journal>(); 

} 

    /**
     * @return the journalList
     */
    public ArrayList<Journal> getJournalList() {
        return journalList;
    }

    /**
     * @param journalList the journalList to set
     */
    public void setJournalList(ArrayList<Journal> journalList) {
        this.journalList = journalList;
    }

  

} 