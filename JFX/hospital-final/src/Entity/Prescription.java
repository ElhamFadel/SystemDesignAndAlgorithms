/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author Shams
 */
public class Prescription {
    private int pat_id ;
    private int medicine_id ;
    private int doctors_id ;
    private Date publishedDate ;

    public Prescription(int pat_id, int medicine_id, int doctors_id, Date publishedDate) {
        this.pat_id = pat_id;
        this.medicine_id = medicine_id;
        this.doctors_id = doctors_id;
        this.publishedDate = publishedDate;
    }

    public Prescription() {
    }

    
    
    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public int getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(int medicine_id) {
        this.medicine_id = medicine_id;
    }

    public int getDoctors_id() {
        return doctors_id;
    }

    public void setDoctors_id(int doctors_id) {
        this.doctors_id = doctors_id;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    
    
    
}
