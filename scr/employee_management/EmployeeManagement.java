package scr.employee_management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;



public class EmployeeManagement extends JFrame{
    EmployeeList l = new EmployeeList();
    ImportForm form = new ImportForm();
    
    ArrayList<Employee> data_list = new ArrayList<Employee>();

    void update_list(){
        l.remove_all_row();
        for (int i = 0; i < data_list.size(); i++){
            l.add_staff(data_list.get(i));
        }
        JOptionPane.showMessageDialog(
            null, 
            "Update successfully",
            "Update successfully",
            JOptionPane.DEFAULT_OPTION
        );
    }

    public void initialize(){
        setSize(640, 480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Human Resource Management");

        JTabbedPane main_tabpane = new JTabbedPane();

        main_tabpane.add("Staff edition" , form);
        main_tabpane.add("List" , l);

        add(main_tabpane);


        //Form input
        //Add
        form.btn_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = form.tf_id.getText().trim();
                String name =  form.tf_name.getText().trim();
                Integer age = Integer.valueOf(form.tf_age.getText().trim());
                String email = form.tf_email.getText().trim();
                Integer salary = Integer.valueOf(form.tf_salary.getText().trim());

                try{
                    if (id.length() == 0) throw new Exception("Id cannot be null!");
                    if (name.length() == 0) throw new Exception("Name cannot be null!");
                    boolean already_existing = false;
                    for (int i = 0 ; i < data_list.size() ; i++){
                        if (data_list.get(i).get_id().equals(id)){
                            already_existing = true;
                        }
                    }
                    if (already_existing){
                        throw new Exception("Id already exists!");
                    }
                    //Employee(String id , String name , String email , Integer age , Integer salary)
                    Employee temp = new Employee(id , name , email , age , salary);
                    data_list.add(temp);
                    update_list();
                }
                catch(Exception exc){
                    JOptionPane.showMessageDialog(
                        null, 
                        exc.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }


            }
        });
        //Remove
        form.btn_remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = form.tf_id.getText().trim();


                try{
                    if (id.length() == 0) throw new Exception("Id cannot be null!");


                    boolean deleted = false; 
                    
                    for (int i = 0 ; i < data_list.size() ; i++){
                        if (data_list.get(i).get_id().equals(id)){
                            data_list.remove(i);
                            deleted = true;

                            break;
                        }
                    }

                    if (deleted) update_list(); 
                    else throw new Exception("Id not found");
                    
                }
                catch(Exception exc){
                    JOptionPane.showMessageDialog(
                        null, 
                        exc.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }


            }
        });
        //Clear
        form.btn_reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.clear_form();
            }
        });
        //Update
        form.btn_update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = form.tf_id.getText().trim();
                String name =  form.tf_name.getText().trim();
                Integer age = Integer.valueOf(form.tf_age.getText().trim());
                String email = form.tf_email.getText().trim();
                Integer salary = Integer.valueOf(form.tf_salary.getText().trim());

                try{
                    if (id.length() == 0) throw new Exception("Id cannot be null!");


                    boolean found = false;
                    
                    for (int i = 0 ; i < data_list.size() ; i++){
                        if (data_list.get(i).get_id().equals(id)){
                            found = true;
                            
                            if (name.length() == 0) throw new Exception("Name cannot be null!");
                            
                            Employee temp = new Employee(id , name , email , age , salary);

                            data_list.set(i , temp);
                            
                            break;
                        }
                    }



                    if (found) update_list(); 
                    else throw new Exception("Id not found");
                }
                catch(Exception exc){
                    JOptionPane.showMessageDialog(
                        null, 
                        exc.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        setVisible(true);

    }
}