package scr.employee_management;

public class Employee {
    private String id;
    private String full_name;
    private String email;
    private Integer age;
    private Integer salary;
    private String country;
    private String gender;
    private String status;
    private String notes;

    public Employee(String id , String full_name , String country , String gender , String status , String notes){
        this.id = id;
        this.country = country;
        this.gender = gender;
        this.status = status;
        this.notes = notes;
        this.full_name = full_name;
    }

    public Employee(String id , String name , String email , Integer age , Integer salary){
        this.id = id;
        this.full_name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }
    
    public Employee(){

    }

    public void set_email(String email) {
        this.email = email;
    }

    public String get_email() {
        return this.email;
    }

    public void set_age(Integer age) {
        this.age = age;
    }

    public Integer get_age() {
        return this.age;
    }

    public void set_salary(Integer salary) {
        this.salary = salary;
    }

    public Integer get_salary() {
        return this.salary;
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
