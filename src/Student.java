/*
Create a Student class which inherits from User class with parameters.
- String name;
- String surname;
 - String group;
- double gpa;
Create default and parameter constructors
Create getters and setters
Implement a getUserData () method that should return all user parameters.
 */

public class Student extends User{
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student(){}
    public Student(int id, String login, String password, String name, String surname, String group, double gpa){
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getGroup(){
        return group;
    }

    public double getGpa(){
        return gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    @Override
    public String getUserData(){
        return getId()+" "+getLogin()+" "+getPassword()+" "+name+" "+surname+" "+group+" "+gpa;
    }
}
