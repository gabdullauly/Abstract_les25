/*
Create a Teacher class which inherits from User class with parameters.
- String nickName;
- String status; //// for example: Professor, Lecturer, Tutor, Assistant.
- String subjects [];
Create default and parameter constructors
Create getters and setters
Implement the getUserData () method that should return all parameters of the user, including all items that he is driving.
 */


public class Teacher extends User{
    private String nickName;
    private String status;
    private String[] subjects;

    public Teacher(){}
    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects){
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
    }

    public String getNickName(){
        return nickName;
    }

    public String getStatus(){
        return status;
    }

    public String[] getSubjects(){
        return subjects;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setSubjects(String[] subjects){
        this.subjects = subjects;
    }

    @Override
    public String getUserData(){
        String allParam = getId()+" "+getLogin()+" "+getPassword()+" "+nickName+" "+status+" ";
        for (int i=0; i< subjects.length; i++){
            allParam = allParam + subjects[i]+" ";
        }
        return allParam;
    }
}
