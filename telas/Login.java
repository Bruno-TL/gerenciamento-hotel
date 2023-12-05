package telas;

import javax.swing.*;
import java.awt.*;

public class Login extends JDialog{
    private JTextField login;
    private JPasswordField passwordField1;
    private JButton entrarButton;
    private JButton sairButton;
    private JPanel loginPanel;

    public Login(JFrame parent){
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(480,480));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Login login = new Login(null);
    }


}
