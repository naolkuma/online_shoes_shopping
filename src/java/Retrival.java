
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
public class Retrival {
    public List <UserTable> UserInfo;
    public List <UserTable> getUsers(){
    UserInfo=new ArrayList<>();
    
    try{
    DbConnection gettin=new DbConnection();
        Connection con=gettin.connMethod();
        
        ResultSet results=con.createStatement().executeQuery("select * from JSFTABLE ");
        while(results.next()){
        String username=results.getString("USERNAME");
        String passw=results.getString("PASSWORD");
        String email=results.getString("EMAIL_ADDRESS");
        String creditCardno=results.getString("CREDIT_CARD_NO");
        String address=results.getString("ADDRESS");
        String gender=results.getString("GENDER");
        String phoneno=results.getString("PHONE_NUMBER");
      
        UserInfo.add(new UserTable(username,passw,email,creditCardno,address,gender,phoneno));
        }
        
    }
    catch(Exception e){}
        return UserInfo;
    }
}
