/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package webClientGUI;


/**
 *
 * @author userh *
 */
public class client_test {
    public static void main(String[] args){
       
        String val = test();
        //String val2 = test();
        //boolean val = createCustomer("","","",0,"","",0,"",0,"");
        System.out.println(val);
    }
    
    private static String test() {
        bank_web_services.CustomerWebService_Service service = new bank_web_services.CustomerWebService_Service();
        bank_web_services.CustomerWebService port = service.getCustomerWebServicePort();
        return port.test();
    }

    private static boolean createCustomer(java.lang.String name, java.lang.String birthDate, java.lang.String address, int mobile, java.lang.String email, java.lang.String accountType, int accountNumber, java.lang.String sortCode, double balance, java.lang.String card) {
        bank_web_services.CustomerWebService_Service service = new bank_web_services.CustomerWebService_Service();
        bank_web_services.CustomerWebService port = service.getCustomerWebServicePort();
        return port.createCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }
    
    
}
