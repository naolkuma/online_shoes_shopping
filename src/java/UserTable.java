
import javax.faces.bean.ManagedBean;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naol
 */
@ManagedBean
public class UserTable{
    public UserTable(){
    }

    public String getUsername() {
        return username;
    }

    public String getPassw() {
        return passw;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditCardno() {
        return creditCardno;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneno() {
        return phoneno;
    }
    



private String username;
private String passw;
private String email;
private String creditCardno; 
private String address;
private String gender;
private String phoneno;

public  UserTable(String username,String passw,String email,String creditCardno,String address,String gender,String phoneno){
 
this.username=username;
this.passw=passw;
this.email=email;
this.creditCardno=creditCardno;
this.address=address;
this.gender=gender;
this.phoneno=phoneno;
}
}
