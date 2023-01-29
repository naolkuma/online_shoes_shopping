/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naol
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="order")
@SessionScoped
public class Order {
    private String username;
    

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void deleteUser(){
    try {
             DbConnection db=new DbConnection();
             Connection con = db.connMethod();
            PreparedStatement stmt=con.prepareStatement("delete from JSFTABLE where USERNAME=?");
            stmt.setString(1, username);
            stmt.executeUpdate();  
            con.close();
        } catch(Exception sqlException){
            sqlException.printStackTrace();
        }
    }
    public void deleteOrder(){
    try {
             DbConnection db=new DbConnection();
             Connection con = db.connMethod();
            PreparedStatement stmt=con.prepareStatement("delete from ORDERTABLE where USERNAME=?");
            stmt.setString(1, username);
            stmt.executeUpdate();  
            con.close();
        } catch(Exception sqlException){
            sqlException.printStackTrace();
        }
    }
    
   
      } 

