
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

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

public class Orders {
    
    private String shoe;
    
private String address;


private String addressone;
private String shoeone;


private String addresstwo;
private String shoetwo;


private String addressthree;
private String shoethree;


private String addressfour;
private String shoefour;


private String addressfive;
private String shoefive;


private String addresssix;
private String shoesix;


private String addressseven;
private String shoeseven;


private String addresseight;
private String shoeeight;


    public String getAddresstwo() {
        return addresstwo;
    }

    public void setAddresstwo(String addresstwo) {
        this.addresstwo = addresstwo;
    }

    public String getShoetwo() {
        return shoetwo;
    }

    public void setShoetwo(String shoetwo) {
        this.shoetwo = shoetwo;
    }

    

    public String getAddressthree() {
        return addressthree;
    }

    public void setAddressthree(String addressthree) {
        this.addressthree = addressthree;
    }

    public String getShoethree() {
        return shoethree;
    }

    public void setShoethree(String shoethree) {
        this.shoethree = shoethree;
    }

   

    public String getAddressfour() {
        return addressfour;
    }

    public void setAddressfour(String addressfour) {
        this.addressfour = addressfour;
    }

    public String getShoefour() {
        return shoefour;
    }

    public void setShoefour(String shoefour) {
        this.shoefour = shoefour;
    }

  

    public String getAddressfive() {
        return addressfive;
    }

    public void setAddressfive(String addressfive) {
        this.addressfive = addressfive;
    }

    public String getShoefive() {
        return shoefive;
    }

    public void setShoefive(String shoefive) {
        this.shoefive = shoefive;
    }

   

    public String getAddresssix() {
        return addresssix;
    }

    public void setAddresssix(String addresssix) {
        this.addresssix = addresssix;
    }

    public String getShoesix() {
        return shoesix;
    }

    public void setShoesix(String shoesix) {
        this.shoesix = shoesix;
    }


    public String getAddressseven() {
        return addressseven;
    }

    public void setAddressseven(String addressseven) {
        this.addressseven = addressseven;
    }

    public String getShoeseven() {
        return shoeseven;
    }

    public void setShoeseven(String shoeseven) {
        this.shoeseven = shoeseven;
    }



    public String getAddresseight() {
        return addresseight;
    }

    public void setAddresseight(String addresseight) {
        this.addresseight = addresseight;
    }

    public String getShoeeight() {
        return shoeeight;
    }

    public void setShoeeight(String shoeeight) {
        this.shoeeight = shoeeight;
    }




    public String getAddressone() {
        return addressone;
    }

    public void setAddressone(String addressone) {
        this.addressone = addressone;
    }

    public String getShoeone() {
        return shoeone;
    }

    public void setShoeone(String shoeone) {
        this.shoeone = shoeone;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShoe() {
        return shoe;
    }

    public void setShoe(String shoe) {
        this.shoe = shoe;
    }
    

  String username1;
FacesContext facesContext = FacesContext.getCurrentInstance();
ExternalContext externalContext = facesContext.getExternalContext();
Map<String,Object> sessionMap = externalContext.getSessionMap();

public Orders(){
    
    username1=(String) sessionMap.get("user");
    }
   
    public void addOrders() throws ClassNotFoundException, SQLException{
      
        
        DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,address);
            tstmn.setString(3,shoe);

            tstmn.execute();
           
                        }
                        catch(Exception e){
                            
                        }
    }
  
     public void second() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addressone);
            tstmn.setString(3,shoeone);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
      public void thrid() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addresstwo);
            tstmn.setString(3,shoetwo);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
      
      
      
       public void fourth() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addressthree);
            tstmn.setString(3,shoethree);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
       
       
        public void fifth() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addressfour);
            tstmn.setString(3,shoefour);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
        
        
        
         public void sixth() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addressfive);
            tstmn.setString(3,shoefive);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
         public void seventh() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addresssix);
            tstmn.setString(3,shoesix);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
         
         
         
          public void eightth() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addressseven);
            tstmn.setString(3,shoeseven);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
        
           public void nineth() throws ClassNotFoundException, SQLException{
         
         
         DbConnection ord=new DbConnection();
        Connection con=ord.connMethod();
         try{
                       String sqll="insert into ORDERTABLE(USERNAME, ADDRESS, ORDERS) values(?, ?, ?)";
                       PreparedStatement tstmn=con.prepareStatement(sqll);
                        
            tstmn.setString(1, username1);
            tstmn.setString(2,addresseight);
            tstmn.setString(3,shoeeight);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
     
     
     
}
