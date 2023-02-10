
package assignment2;
/**
 *
 * @author Elham Elshami
 */
public class User {
    private  String id , name , city , gnd ;
    private Double gpa;

    public User(String id, String name, String gnd, String city, Double gpa) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.gnd = gnd;
        this.gpa = gpa;
    }
    //getters and setters
    public String getUserId() { return id; }
    public String getUserName() { return name; }
    public String getUserCity() { return city; }
    public String getUserGnd() { return gnd; }
    public Double getUserGpa() { return gpa; }
    public void setUserId(String id) { this.id = id; }
    public void setUserName(String name) { this.name = name; }
    public void setUserCity(String city) { this.city = city; }
    public void setUserGnd(String gnd) { this.gnd = gnd; }
    public void setUserGpa(Double gpa) { this.gpa = gpa; }
}

   