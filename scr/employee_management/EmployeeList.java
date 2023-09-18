package scr.employee_management;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeList extends JPanel{
    JTable table;
    JButton btn_load , btn_store;
    public EmployeeList() {
        initComponents();
    }

    private void initComponents() {
        // Create a DefaultTableModel with data and column names
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Email");
        model.addColumn("Salary");

        // Add some sample data to the model
        // model.addRow(new Object[]{1, "John Doe", "VN" , "Male" , "Single"});

        
        // Create a JTable with the model
        table = new JTable(model);

        // Create a JScrollPane to add the table to
        JScrollPane scroll_pane = new JScrollPane(table);

        // Debug
        // setBackground(new Color(255 , 255 , 0 , 255));
        // scroll_pane.setBackground(new Color(255 , 0 , 255 , 255));
        // table.setBackground(new Color(0 , 255 , 255 , 255));

        // Add the JScrollPane to the JFrame
        add(scroll_pane);

        // Buttons
        btn_load = new JButton("Load");
        btn_store = new JButton("Store");
        JPanel btn_panel = new JPanel(new GridLayout(2 , 1 , 5 , 5));
        btn_panel.add(btn_load);
        btn_panel.add(btn_store);

        add(btn_panel);
    }

    public void add_staff(Employee staff) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{staff.get_id(), staff.get_name(), staff.get_email(), staff.get_age(), staff.get_salary()});
    }

    public void remove_all_row(){
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
}
