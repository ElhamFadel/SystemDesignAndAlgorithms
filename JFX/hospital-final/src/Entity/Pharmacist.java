/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Shams
 */
public class Pharmacist {
    private int id ;
    private String name ;
    private String password ;

    public Pharmacist(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Pharmacist() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
