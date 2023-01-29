
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ApplicationScoped;
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
@ApplicationScoped
public class Insertreg {
    
    private String email;
    private String creditcardno;
    private String address;
    private String gender;
    private String phoneno;
    private String username;
    private String password;
    
    public Insertreg(){
        
    }
  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditcardno() {
        return creditcardno;
    }

    public void setCreditcardno(String creditcardno) {
        this.creditcardno = creditcardno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      public void addUser() throws ClassNotFoundException, SQLException{
          Insertreg regs=new Insertreg();
          
       DbConnection insreg = new DbConnection();
        Connection con=insreg.connMethod();
        
            try{
               String sql = "Insert into JSFTABLE(EMAIL_ADDRESS, CREDIT_CARD_NO, ADDRESS, GENDER, PHONE_NUMBER, USERNAME, PASSWORD) values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement mystmn = con.prepareStatement(sql); 
            mystmn.setString(1, email);
            mystmn.setString(2, creditcardno);
            mystmn.setString(3, address);
            mystmn.setString(4, gender);
            mystmn.setString(5, phoneno);
            mystmn.setString(6, username);
            mystmn.setString(7, password);
            mystmn.execute();
            }
            catch (Exception e) {
        }
      
    }
      public static String deleteUser(String username){
          
        System.out.println("deleted");
        return "/signup.xhtml?faces-redirect=true";
    
          
      }
   
}
