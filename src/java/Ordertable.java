
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
public class Ordertable {
    
    public Ordertable(){
        
    }
    private String username;
    private String address;
    private String orders;

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public String getOrders() {
        return orders;
    }
    
    public Ordertable(String username, String address, String orders){
        this.username= username;
        this.address=address;
        this.orders=orders;
        
    
    }
    
}
