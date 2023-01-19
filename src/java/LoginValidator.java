
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naol
 */
public class LoginValidator {
    public static boolean validator(String username1,String password1){
        boolean status=false;
    try{
        DbConnection insreg=new DbConnection();
        Connection con=insreg.connMethod();
        PreparedStatement mystmn=con.prepareStatement("select * from JSFTABLE where USERNAME=? and PASSWORD=?");
        mystmn.setString(1, username1);
        mystmn.setString(2, password1);
        ResultSet rs = mystmn.executeQuery();
            status = rs.next();
        
    }
    catch(Exception e){
    }
    return status;
    }
    
}
