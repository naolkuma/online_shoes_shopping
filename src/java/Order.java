
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class Order {
    private String firstshoe="gfdytdtcvb";

    public String getFirstshoe() {
        return firstshoe;
    }

    public void setFirstshoe(String firstshoe) {
        this.firstshoe = "gfdytdtcvb";
    }

   
    public Order(){
    }
    
        public void addOrder() throws ClassNotFoundException, SQLException{
    
         DbConnection orders = new DbConnection();
        Connection con=orders.connMethod();
        
            try{
               String sql = "insert into ORDERTABLE(ORDERS) values(?)";
            PreparedStatement stmn = con.prepareStatement(sql); 
            stmn.setString(3,firstshoe);
            
            
            
            stmn.execute();
            }
            catch (Exception e) {
        }
        
    }
}
