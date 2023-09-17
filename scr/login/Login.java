package scr.login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Login extends JFrame{
    JTextField tf_username , tf_pass;
    JButton btn_login , btn_reset;
    JCheckBox cb_remember_me;


    public Login(){
        setSize(640, 480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
    }

    public void initialize() {
        JPanel main_panel = new JPanel();
        add(main_panel);
        main_panel.setLayout(null);
        
        // Title
        JLabel lb_title = new JLabel("LOGIN FORM" , SwingConstants.CENTER);
        lb_title.setBounds(0, 20, 640, 70);
        Font lb_title_font = new Font("Courier" , Font.BOLD , 40);
        lb_title.setForeground(Color.blue);
        lb_title.setFont(lb_title_font);
        main_panel.add(lb_title);

        // Username
        JLabel lb_username = new JLabel("Username");
        lb_username.setBounds(30, 100, 80, 25);
        main_panel.add(lb_username);

        
        tf_username = new JTextField();
        tf_username.setBounds(130, 100, 470, 25);
        main_panel.add(tf_username);

        // Password
        JLabel lb_pass = new JLabel("Password");
        lb_pass.setBounds(30, 130, 80, 25);
        main_panel.add(lb_pass);

        tf_pass = new JPasswordField();
        tf_pass.setBounds(130, 130, 470, 25);
        main_panel.add(tf_pass);

        // Remember Me
        cb_remember_me = new JCheckBox("Remember Me?");
        cb_remember_me.setBounds(130, 160, 470, 25);
        main_panel.add(cb_remember_me);

        // Buttons
        btn_login = new JButton("Login");
        btn_reset = new JButton("Reset");

        btn_login.setBounds(350, 350, 90, 25);
        btn_reset.setBounds(450, 350, 90, 25);

        main_panel.add(btn_login);
        main_panel.add(btn_reset);

        setVisible(true);

        // Input
        tf_username.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tf_pass.requestFocus();
                }
            }
        });

        tf_pass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btn_login.doClick();
                }
            }
        });

        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_username.setText("");
                tf_pass.setText("");
            }
        });

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tf_username.getText();
                String password = new String(((JPasswordField) tf_pass).getPassword());

                if(username.equals("") || password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill in all the fields");
                    return;
                } 
                if(username.equals("fpt") && password.equals("polytechnic")) {
                    JOptionPane.showMessageDialog(null, "You have successfully logged in" + (cb_remember_me.isSelected()?", Your account has been remembered" : ".")); 
                    return;
                }
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                
            }
        });
    }
}
