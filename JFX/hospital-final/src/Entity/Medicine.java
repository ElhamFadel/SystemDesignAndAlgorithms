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
public class Medicine {
    private  int id ;
    private String name ;
    private double dose ;
    private int quantity ;

    public Medicine(int id, String name, double dose, int quantity) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
    }

    public Medicine(String name, double dose, int quantity) {
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
    }

    public Medicine() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDose() {
        return dose;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
