package scr.employee_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImportForm extends JPanel {

    JTextField tf_id , tf_name , tf_age , tf_email , tf_salary;
    JButton btn_add , btn_remove , btn_update , btn_reset;


    public ImportForm() {
        initComponents();
    }

    private void initComponents() {
        setLayout(null);

        //Id
        JLabel id_label = new JLabel("Employee ID");
        id_label.setBounds(10, 20, 80, 25);
        add(id_label);

        tf_id = new JTextField(20);
        tf_id.setBounds(100, 20, 500, 25);
        add(tf_id);

        //Full name
        JLabel name_label = new JLabel("Full Name");
        name_label.setBounds(10, 50, 80, 25);
        add(name_label);

        tf_name = new JTextField(20);
        tf_name.setBounds(100, 50, 500, 25);
        add(tf_name);

        // Age
        JLabel age_label = new JLabel("Age");
        age_label.setBounds(10, 80, 80, 25);
        add(age_label);

        tf_age = new JTextField(20);
        tf_age.setBounds(100, 80, 500, 25);
        add(tf_age);
        tf_age.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // This method is called when a key is typed (pressed and released).
                char keyChar = e.getKeyChar();
                if (!Character.isDigit(keyChar)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
        // Email
        JLabel email_label = new JLabel("Email");
        email_label.setBounds(10, 110, 80, 25);
        add(email_label);

        tf_email = new JTextField(20);
        tf_email.setBounds(100, 110, 500, 25);
        add(tf_email);


        // Salary
        JLabel salary_label = new JLabel("Salary");
        salary_label.setBounds(10, 140, 80, 25);
        add(salary_label);
        
        tf_salary = new JTextField(20);
        tf_salary.setBounds(100, 140, 500, 25);
        add(tf_salary);
        tf_salary.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // This method is called when a key is typed (pressed and released).
                char keyChar = e.getKeyChar();
                if (!Character.isDigit(keyChar)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        //Buttons
        btn_add = new JButton("Add");
        btn_remove = new JButton("Remove");
        btn_update = new JButton("Update");
        btn_reset = new JButton("Reset");

        btn_add.setBounds(150, 350, 90, 25);
        btn_remove.setBounds(250, 350, 90, 25);
        btn_update.setBounds(350, 350, 90, 25);
        btn_reset.setBounds(450, 350, 90, 25);

        add(btn_add);
        add(btn_remove);
        add(btn_update);
        add(btn_reset);

    }

    public void clear_form() {
        tf_id.setText("");
        tf_name.setText("");
        tf_age.setText("");
        tf_email.setText("");
        tf_salary.setText("");
    }
}