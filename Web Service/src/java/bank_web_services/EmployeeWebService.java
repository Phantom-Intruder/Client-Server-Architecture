package bank_web_services;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Moiz Mansoor Ali
 */
@WebService(serviceName = "BankEmployeeWebService")
public class EmployeeWebService {

    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        System.out.println("asdsd323");
        if(username.equals("root") && password.equals("root123")){
            return true;
        }else{
            return false;
        }
    }

    @WebMethod(operationName = "createEmployee")
    public boolean createEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "retype_password") String retype_password) {
        Connection connection = DatabaseClass.getInstanceOfObject();
        String sql = "INSERT INTO employee (name, position, username, password) values (?, ?, ?, ?)";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, position);
            statement.setString(3, username);
            statement.setString(4, password);
            int row = statement.executeUpdate();

        if (row > 0) {
                System.out.println("A employee was inserted.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @WebMethod(operationName = "editEmployee")
    public boolean editEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "retype_password") String retype_password) {
        deleteEmployee(username);
        createEmployee(name, position, username, password, password);
        return false;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchForEmployee")
    public String searchForEmployee(@WebParam(name = "username") String username) {
        String returnData = null;
        try {
            Connection connection = DatabaseClass.getInstanceOfObject();
            Statement st = connection.createStatement();
            String sql = ("SELECT * FROM employee WHERE username = '"+username+"';");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                String usernameToDelete = rs.getString("username");
                String password = rs.getString("password");
                returnData = name +","+ position +","+  usernameToDelete +","+  password;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeWebService.class.getName()).log(Level.SEVERE, null, ex);
        }            
        if (returnData == null)
            return "No such record";
        return returnData;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteEmployee")
    public String deleteEmployee(@WebParam(name = "username") String username) {
        try {
            System.out.println(username);
            Connection connection = DatabaseClass.getInstanceOfObject();
            Statement st = connection.createStatement();
            String sql = ("DELETE FROM employee WHERE username = '"+username+"';");
            st.executeUpdate(sql);
            return "Successful";
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeWebService.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
            return "Unsuccessful";
        }
        
    }




    
}
