
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

public class Orders {
    public Orders(){}
    private String shoe;
    private String username1;
private String address;

private String userone;
private String addressone;
private String shoeone;

private String usertwo;
private String addresstwo;
private String shoetwo;

private String userthree;
private String addressthree;
private String shoethree;

private String userfour;
private String addressfour;
private String shoefour;

private String userfive;
private String addressfive;
private String shoefive;

private String usersix;
private String addresssix;
private String shoesix;

private String userseven;
private String addressseven;
private String shoeseven;

private String usereight;
private String addresseight;
private String shoeeight;

    public String getUsertwo() {
        return usertwo;
    }

    public void setUsertwo(String usertwo) {
        this.usertwo = usertwo;
    }

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

    public String getUserthree() {
        return userthree;
    }

    public void setUserthree(String userthree) {
        this.userthree = userthree;
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

    public String getUserfour() {
        return userfour;
    }

    public void setUserfour(String userfour) {
        this.userfour = userfour;
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

    public String getUserfive() {
        return userfive;
    }

    public void setUserfive(String userfive) {
        this.userfive = userfive;
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

    public String getUsersix() {
        return usersix;
    }

    public void setUsersix(String usersix) {
        this.usersix = usersix;
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

    public String getUserseven() {
        return userseven;
    }

    public void setUserseven(String userseven) {
        this.userseven = userseven;
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

    public String getUsereight() {
        return usereight;
    }

    public void setUsereight(String usereight) {
        this.usereight = usereight;
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




    public String getUserone() {
        return userone;
    }

    public void setUserone(String userone) {
        this.userone = userone;
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
    

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
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
                        
            tstmn.setString(1, userone);
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
                        
            tstmn.setString(1, usertwo);
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
                        
            tstmn.setString(1, userthree);
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
                        
            tstmn.setString(1, userfour);
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
                        
            tstmn.setString(1, userfive);
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
                        
            tstmn.setString(1, usersix);
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
                        
            tstmn.setString(1, userseven);
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
                        
            tstmn.setString(1, usereight);
            tstmn.setString(2,addresseight);
            tstmn.setString(3,shoeeight);

            tstmn.executeUpdate();
           
                        }
                        catch(Exception e){
                            
                        }
     
     }
     
     
     
}
