package scr;

import scr.staff_management.*;
import scr.login.*;
import scr.user_management.*;

public class app {
    static StaffManagement sm = new StaffManagement();
    static Login lg = new Login();
    static UserManagement um = new UserManagement();
    public static void main(String[] args){   
        lg.initialize();
    }
}
