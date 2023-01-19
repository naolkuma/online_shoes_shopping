
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {
    private String username1;
    private String password1;
    private String msg;
    
    
    public LoginBean(){
    
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }
    
    public String validatingUsers() throws SQLException, ClassNotFoundException{
        boolean validator= LoginValidator.validator(username1, password1);
                if(validator){
                DbConnection insreg=new DbConnection();
        Connection con=insreg.connMethod();
        PreparedStatement mystmn=con.prepareStatement("select * from JSFTABLE where USERNAME=?");
        mystmn.setString(1, username1);
        ResultSet rs = mystmn.executeQuery();
            rs.next();
            String uservalid=rs.getString(1);
                    if("naol".equals(uservalid)){
                      return "adminpage.xhtml";
                    }
                    else
                    {
                      return "orderpage.xhtml";
                    }
                    
                }
                else
                {
                    FacesContext.getCurrentInstance().addMessage(null,
                  new FacesMessage(FacesMessage.SEVERITY_ERROR,"Incorrect username or password","please re-enter again correctly"));
                  
                  return "index.xhtml";
                }
                
    }
    
}
