package bank_web_services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Moiz Mansoor Ali
 */
@WebService(serviceName = "CustomerWebService")
public class CustomerWebService {
    
    @WebMethod(operationName = "createCustomer")
    public boolean createCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") int mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") int accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) {
        
        return false;
    }

    @WebMethod(operationName = "editCustomer")
    public boolean editCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") int mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") int accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) {
        return false;
    }

    @WebMethod(operationName = "deleteCustomer")
    public boolean deleteCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") int mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") int accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) {
        return false;
    }

    @WebMethod(operationName = "getCustomerList")
    public String[] getCustomerList() {
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "test")
    public String test() {
        //TODO write your implementation code here:
        String data = "adadad";
        
        Connection connection = DatabaseClass.getInstanceOfObject();
        String sql = "INSERT INTO person (first_name, last_name) values (?, ?)";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
             statement.setString(1, "Tom");
            statement.setString(2, "Eagar");
            int row = statement.executeUpdate();

        if (row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return data;
    }
    
}
