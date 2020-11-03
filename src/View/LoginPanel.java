package View;



import javax.swing.*;

public class LoginPanel extends JPanel {

    private JLabel unameLabel, pwLabel, resultLabel, logoLabel;
    private JTextField username;
    private JPasswordField password;
    private JPanel userPanel, pwPanel, btnPanel, logoPanel, resultPanel;
    private JButton loginBtn;
    private ImageIcon logo;
    
    public LoginPanel() {
        super();
        setupPanel();
       createComponents();
      addComponents();
        
    }

    public void addComponents(){
      
        logoPanel.add(logoLabel);
        userPanel.add(unameLabel);
        userPanel.add(username);
        pwPanel.add(pwLabel);
        pwPanel.add(password);
        btnPanel.add(loginBtn);
        resultPanel.add(resultLabel);
        
    }
   
    public void createComponents(){
        logo = new ImageIcon(this.getClass().getResource("./MPlogo1Lg.png"));
        logoLabel = new JLabel();
        logoLabel.setIcon(logo);
        unameLabel = new JLabel("User Name:");
        
        username = new JTextField(20);
        username.setText("test");
        pwLabel = new JLabel("Password:");
        password = new JPasswordField(20);
        password.setText("test");
        loginBtn = new JButton("Login");
        resultLabel = new JLabel();
    }
    public void setupPanel(){
       
        logoPanel = new JPanel();
        logoPanel.setVisible(true);
        add(logoPanel);
        userPanel = new JPanel();
        userPanel.setVisible(true);
        add(userPanel);
        pwPanel = new JPanel();
        pwPanel.setVisible(true);
        add(pwPanel);
        btnPanel = new JPanel();
        btnPanel.setSize(297, 35);
        btnPanel.setVisible(true);
        
        add(btnPanel);
        resultPanel = new JPanel();
        resultPanel.setVisible(true);
        add(resultPanel);
        
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    public void setResultLabel(JLabel resultLabel) {
        this.resultLabel = resultLabel;
    }

    public JLabel getLogoLabel() {
        return logoLabel;
    }

    public void setLogoLabel(JLabel logoLabel) {
        this.logoLabel = logoLabel;
    }

    public ImageIcon getLogo() {
        return logo;
    }

    public void setLogo(ImageIcon logo) {
        this.logo = logo;
    }

    public JLabel getUnameLabel() {
        return unameLabel;
    }

    public void setUnameLabel(JLabel unameLabel) {
        this.unameLabel = unameLabel;
    }

    public JLabel getPwLabel() {
        return pwLabel;
    }

    public void setPwLabel(JLabel pwLabel) {
        this.pwLabel = pwLabel;
    }

    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

    public JPanel getUserPanel() {
        return userPanel;
    }

    public void setUserPanel(JPanel userPanel) {
        this.userPanel = userPanel;
    }

    public JPanel getPwPanel() {
        return pwPanel;
    }

    public void setPwPanel(JPanel pwPanel) {
        this.pwPanel = pwPanel;
    }

    public JPanel getBtnPanel() {
        return btnPanel;
    }

    public void setBtnPanel(JPanel btnPanel) {
        this.btnPanel = btnPanel;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }
    
}
