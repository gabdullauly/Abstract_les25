/*
Create an abstract User class with parameters:
 - int id;
- String login;
- String password;
abstract String getUserData ();
Create default and parameter constructors
Create getters and setters
 */

public abstract class User {
    private int id;
    private String login;
    private String password;

    public abstract String getUserData();

    public User(){}
    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
