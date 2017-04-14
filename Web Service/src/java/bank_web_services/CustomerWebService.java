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
        System.out.println(name+birthDate+address+mobile+email+accountType+accountNumber+sortCode+balance+card);
         Connection connection = DatabaseClass.getInstanceOfObject();
        String sql = "INSERT INTO customer (name, birth_date,address,mobile,email,accType,accNo,sortCode,balance,card) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, birthDate);
            statement.setString(3, address);
            statement.setString(4, mobile+"");
            statement.setString(5, email);
            statement.setString(6, accountType);
            statement.setString(7, accountNumber+"");
            statement.setString(8, sortCode);
            statement.setString(9, balance+"");
            statement.setString(10, card);
            int row = statement.executeUpdate();

        if (row > 0) {
                System.out.println("A employee was inserted.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @WebMethod(operationName = "editCustomer")
    public boolean editCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") int mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") int accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) {
        return false;
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
                            System.out.println("A cosdfth photo image.");

        } catch (SQLException ex) {
            Logger.getLogger(CustomerWebService.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("A contact was inserted with photo image.");

        }
           
        return data;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchForCustomer")
    public String searchForCustomer(@WebParam(name = "accountNo") String accountNo) {
        String returnData = null;
        try {
            Connection connection = DatabaseClass.getInstanceOfObject();
            Statement st = connection.createStatement();
            String sql = ("SELECT * FROM customer WHERE accNo = '"+accountNo+"';");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                int id = rs.getInt("customer_id");
                    
                String name = rs.getString("name");
                String birthDate = rs.getString("birth_date");
                String address = rs.getString("address");
                String mobile = rs.getString("mobile");
                
                String email = rs.getString("email");
                String accountType = rs.getString("accType");
                String accountNumber = rs.getString("accNo");
                String sortCode = rs.getString("sortCode");
                
                String balance = rs.getString("balance");
                String card = rs.getString("card");
                returnData = name+","+birthDate+","+address+","+mobile+","+email+","+accountType+","+accountNumber+","+sortCode+","+balance+","+card;
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
    @WebMethod(operationName = "deleteData")
    public String deleteData(@WebParam(name = "accountNo") String accountNo) {
         try {
            System.out.println(accountNo);
            Connection connection = DatabaseClass.getInstanceOfObject();
            Statement st = connection.createStatement();
            String sql = ("DELETE FROM customer WHERE accNo = '"+accountNo+"';");
            st.executeUpdate(sql);
            return "Successful";
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeWebService.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
            return "Unsuccessful";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCustomerList")
    public ArrayList<String> getCustomerList() {
        ArrayList<String> returnData = new ArrayList<String>();
         int index= 0;
        try {
            Connection connection = DatabaseClass.getInstanceOfObject();
            Statement st = connection.createStatement();
            String sql = ("SELECT * FROM customer;");
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()) {
                index++;
                 int id = rs.getInt("customer_id");
             String name = rs.getString("name");
             String accountNumber = rs.getString("accNo");
             returnData.add(name +   ", " +        accountNumber);
              //returnData = name+","+birthDate+","+address+","+mobile+","+email+","+accountType+","+accountNumber+","+sortCode+","+balance+","+card;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeWebService.class.getName()).log(Level.SEVERE, null, ex);
        }            
       
        return returnData;
    }
    
}
