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
public class Patient {
  private int id ;
  private String name ;
  private int age ;
  private String gender ;
  private String image ;
  private String problem ;
  private Date entranceDate ;
  private int doctor_id ;

    public Patient(int id, String name, int age, String gender, String image, String problem, Date entranceDate, int doctor_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.image = image;
        this.problem = problem;
        this.entranceDate = entranceDate;
        this.doctor_id = doctor_id;
    }

    public Patient() {
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getImage() {
        return image;
    }

    public String getProblem() {
        return problem;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

  
  

}
