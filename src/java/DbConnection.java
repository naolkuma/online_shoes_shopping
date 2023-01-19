
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naol
 */
public class DbConnection {
        static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER = "JSFDB";
    static final String PASSWORD = "1234";
    Connection con = null;

    public Connection connMethod() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
      
        con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
      if (con != null) {
          System.out.println("Connect database successfully...");
      } else {
           System.out.println("nFailed to connect to Oracle DB");
        }
        return con;
    }
     public static void main(String []args) throws ClassNotFoundException, SQLException{
    DbConnection obj = new DbConnection();
   
    System.out.println(obj.connMethod());
    
}
}
