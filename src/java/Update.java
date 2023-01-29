
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naol
 */
@ManagedBean
@SessionScoped
public class Update {
     private String username;
    private String email;
    private String address;
    private String phoneno;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

       public void updateUser() throws ClassNotFoundException, SQLException{
     try{
            DbConnection db=new DbConnection();
            Connection con = db.connMethod();
            PreparedStatement stmt=con.prepareStatement("update JSFTABLE set EMAIL_ADDRESS=?, ADDRESS=?, PHONE_NUMBER=? where USERNAME=?");
            stmt.setString(1, email);
            stmt.setString(2, address);
            stmt.setString(3, phoneno);
            stmt.setString(4, username);
            stmt.executeUpdate();  
            con.close();
        } catch(Exception sqlException){
            sqlException.printStackTrace();
        }
       }
}
      

