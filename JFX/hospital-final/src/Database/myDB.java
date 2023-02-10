/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Entity.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author E N G Y
 */
public class myDB {

    static Connection conn = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "");
            System.out.println("Connection Sucessfullt");
        } catch (ClassNotFoundException ex) {
            System.err.println("class not found ");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.err.println(" sql exception : cannot connect to database ");
        }
        return conn;

    }
// get pharm from db to compare it whith inputs pharm data
    public static ResultSet getPharm(Pharmacist pharm) {
        ResultSet resultSet = null;
        if (!pharm.getName().equals("") || !pharm.getPassword().equals("")) {
            String sql = "select * from pharmacist where name = ? and password = ?";
            try {
                PreparedStatement statement = getConnection().prepareStatement(sql);
                statement.setString(1, pharm.getName());
                statement.setString(2, pharm.getPassword());
                resultSet = statement.executeQuery();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Please enter your credential");
        }
        return resultSet;
    }
 
//    load drugs from db to list  
     public static ObservableList<Medicine> getAllDrugs() {
        ObservableList<Medicine> resultList = FXCollections.observableArrayList();
        if (conn == null) {
            getConnection();
        }
        try {
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM medicine ");
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                double dose = rs.getDouble("dose");
                Medicine medicine = new Medicine(id, name, dose, quantity) ;
                resultList.add(medicine);
            }
        } catch (SQLException ex) {
            System.err.println("sql exception when get all mediciene : " + ex);
        }

        return resultList;

    }
//     add medicine to db 
      public static void addDrugRow(Medicine m) {
        if (conn == null) {
            getConnection();
        }
       try {
           PreparedStatement stat = conn.prepareStatement("INSERT INTO medicine(name,dose,quantity) VALUES (?,?,?) ;") ;
//           stat.setInt(1, m.getId());
           stat.setString(1, m.getName());
           stat.setDouble(2, m.getDose());
           stat.setInt(3, m.getQuantity()); 
           int rowCnt = stat.executeUpdate() ; 
        
       } catch (SQLException ex) {
           System.err.println("error in inserting row " + ex);
       }
    }
     
// delete medicine row 
    public static void deleteDrugRow(int id) {
        if (conn == null) {
            getConnection();
        }
        try {
            PreparedStatement stat = conn.prepareStatement("DELETE FROM medicine where id = ? ;");
            stat.setInt(1, id);
            int rowCnt = stat.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("error in deleting row " + ex);
        }
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////
//    for login operation 
    public static ResultSet getDoc(Doctors doc) {
        ResultSet resultSet = null;
        if (!doc.getName().equals("") || !doc.getPassword().equals("")) {
            String sql = "select * from doctors where name = ? and password = ?";
            try {
                PreparedStatement statement = getConnection().prepareStatement(sql);
                statement.setString(1, doc.getName());
                statement.setString(2, doc.getPassword());
                resultSet = statement.executeQuery();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Please enter your credential");
        }
        return resultSet;
    }
    
//    strat doctor operations 
//    get all patients from db 
     public static ObservableList<Patient> getAllPatients() {
        ObservableList<Patient> resultList = FXCollections.observableArrayList();
        if (conn == null) {
            getConnection();
        }
        try {
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM patient ");
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String img = rs.getString("image");
                String problem = rs.getString("problem");
                Date entrance = rs.getDate("entranceDate") ;
                int doc_id = rs.getInt("doctor_id") ;
                Patient p =new Patient(id, name, age, gender, img, problem, entrance, doc_id) ;
                resultList.add(p);
            }
        } catch (SQLException ex) {
            System.err.println("sql exception when get all patient : " + ex);
        }

        return resultList;

    }
    //     add patient to db 
      public static void addPatientRow(Patient p) {
        if (conn == null) {
            getConnection();
        }
       try {
           PreparedStatement stat = conn.prepareStatement("INSERT INTO patient(name,age,gender,image,problem,entranceDate) VALUES (?,?,?,?,?,?) ;") ;
           stat.setString(1,p.getName());
           stat.setInt(2, p.getAge());
           stat.setString(3, p.getGender());
           stat.setString(4, p.getImage());
           stat.setString(5,p.getProblem());
           stat.setDate(6, p.getEntranceDate());
           int rowCnt = stat.executeUpdate() ; 
        
       } catch (SQLException ex) {
           System.err.println("error in inserting row " + ex);
       }
    }
      // delete patient row 
    public static void deletePatientRow(int id) {
        if (conn == null) {
            getConnection();
        }
        try {
            PreparedStatement stat = conn.prepareStatement("DELETE FROM patient where id = ? ;");
            stat.setInt(1, id);
            int rowCnt = stat.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("error in deleting row " + ex);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
