
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naol
 */
public class Retrival {
    public List <UserTable> UserInfo;
    public List <UserTable> getUsers(){
    UserInfo=new ArrayList<>();
    
    try{
    DbConnection gettin=new DbConnection();
        Connection con=gettin.connMethod();
        
        ResultSet results=con.createStatement().executeQuery("select * from JSFTABLE ");
        while(results.next()){
        String username=results.getNString("USERNAME");
        String passw=results.getNString("PASSWORD");
        String email=results.getNString("EMAIL_ADDRESS");
        String creditCardno=results.getNString("CREDIT_CARD_NO");
        String address=results.getNString("ADDRESS");
        String gender=results.getNString("GENDER");
        String phoneno=results.getNString("PHONE_NUMBER");
      
        UserInfo.add(new UserTable(username,passw,email,creditCardno,address,gender,phoneno));
        }
        
    }
    catch(Exception e){}
        return UserInfo;
    }
}
