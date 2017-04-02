package bankWebServices;

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
        if(username.equals("root") && password.equals("root123")){
            return true;
        }else{
            return false;
        }
    }

    @WebMethod(operationName = "createEmployee")
    public boolean createEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "retype_password") String retype_password) {
        return false;
    }

    @WebMethod(operationName = "editEmployee")
    public boolean editEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "retype_password") String retype_password) {
        return false;
    }

    @WebMethod(operationName = "deleteEmployee")
    public boolean deleteEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username) {
        return false;
    }
    
}
