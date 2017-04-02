package bankWebServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
    
}
