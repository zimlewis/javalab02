package scr.staff_management;

import javax.swing.*;
import java.awt.*;

public class ImportForm extends JPanel {

    JTextField tf_id , tf_name;
    JButton btn_add , btn_remove , btn_update , btn_reset;
    JComboBox<String> dd_country;
    JRadioButton jr_male , jr_female;
    JCheckBox is_single;
    JTextArea ta_notes;

    public ImportForm() {
        initComponents();
    }

    private void initComponents() {
        setLayout(null);

        //Id
        JLabel id_label = new JLabel("Staff ID");
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

        // country
        JLabel country_label = new JLabel("Country");
        country_label.setBounds(10, 80, 80, 25);
        add(country_label);

        String[] items = {"Việt Nam" , "Japan" , "China" , "Korea"};
        dd_country = new JComboBox<>(items);
        dd_country.setBounds(100, 80, 500, 25);
        add(dd_country);
        
        // Gender
        JLabel gender_label = new JLabel("Gender");
        gender_label.setBounds(10, 110, 80, 25);
        add(gender_label);


        ButtonGroup bg_gender = new ButtonGroup();

        jr_male = new JRadioButton("Male");
        jr_female = new JRadioButton("Female");

        jr_male.setBounds(100, 110, 80, 25);
        jr_female.setBounds(180, 110, 80, 25);

        jr_male.setSelected(true);

        bg_gender.add(jr_male);
        bg_gender.add(jr_female);

        add(jr_male);
        add(jr_female);

        //single
        JLabel single_label = new JLabel("Is single");
        single_label.setBounds(10, 140, 80, 25);
        add(single_label);
        
        is_single = new JCheckBox("Single?");
        is_single.setBounds(100, 140, 80, 25);
        add(is_single);

        //Notes
        JLabel notes_label = new JLabel("Notes");
        notes_label.setBounds(10, 170, 80, 25);
        add(notes_label);

        ta_notes = new JTextArea(10, 30); // 10 rows and 30 columns
        ta_notes.setBounds(100, 170, 500, 150);

        add(ta_notes);

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
        dd_country.setSelectedIndex(0);
        jr_male.setSelected(true);
        is_single.setSelected(false);
        ta_notes.setText("");
    }
}