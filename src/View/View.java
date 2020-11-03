package View;


public class View {
   
    public MainFrame mf;
    public LoginFrame lf;

    public View() {
      
        lf = new LoginFrame();
        mf = new MainFrame();
    }

    public void setMF(MainFrame mf) {
        this.mf = mf;
    }

    public MainFrame getMF() {
        return mf;
    }

    public LoginFrame getLf() {
        return lf;
    }

    public void setLf(LoginFrame lf) {
        this.lf = lf;
    }

       }


