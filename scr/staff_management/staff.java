package scr.staff_management;

public class staff {
    private String id;
    private String full_name;
    private String country;
    private String gender;
    private String status;
    private String notes;

    public staff(String id , String full_name , String country , String gender , String status , String notes){
        this.id = id;
        this.country = country;
        this.gender = gender;
        this.status = status;
        this.notes = notes;
        this.full_name = full_name;
    }
    
    public staff(){

    }

    public void set_country(String country) {
        this.country = country;
    }

    public String get_country() {
        return country;
    }

    public void set_gender(String gender) {
        this.gender = gender;
    }

    public String get_gender() {
        return gender;
    }

    public void set_status(String status) {
        this.status = status;
    }

    public String get_status() {
        return status;
    }

    public void set_notes(String notes) {
        this.notes = notes;
    }

    public String get_notes() {
        return notes;
    }

    public void set_id(String id) {
        this.id = id;
    }

    public String get_id() {
        return id;
    }

    public void set_name(String full_name) {
        this.full_name = full_name;
    }

    public String get_name() {
        return full_name;
    }



}
