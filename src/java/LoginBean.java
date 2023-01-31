
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean {
    private String username1;
    private String password1;
    private String address;
    private String order;
    public String addr;
    public String usernam;
   
    public LoginBean(){
    
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getUsername() {
        return username1;
    }

    public void setUsername(String username1) {
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
            FacesContext facesContext=FacesContext.getCurrentInstance();
                ExternalContext external=facesContext.getExternalContext();
                Map<String,Object>sessionMap=external.getSessionMap();
                sessionMap.put("user",rs.getString(6));
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
