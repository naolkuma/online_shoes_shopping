
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
public class OrderRetrival {
     public List <Ordertable> Orderinfo;
    public List <Ordertable> getOrders(){
    Orderinfo=new ArrayList<>();
     
    try{
    DbConnection gettin=new DbConnection();
        Connection con=gettin.connMethod();
        
        ResultSet results=con.createStatement().executeQuery("select * from ORDERTABLE ");
        while(results.next()){
        String username=results.getString("USERNAME");
        String address=results.getString("ADDRESS");
        String orders=results.getString("ORDERS");
        
      
        Orderinfo.add(new Ordertable(username,address,orders));
        }
        
    }
    catch(Exception e){}
        return Orderinfo;
    }
}
