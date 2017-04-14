
package bank_web_services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankEmployeeWebService", targetNamespace = "http://bank_web_services/", wsdlLocation = "http://localhost:8080/Web_Service/BankEmployeeWebService?wsdl")
public class BankEmployeeWebService
    extends Service
{

    private final static URL BANKEMPLOYEEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKEMPLOYEEWEBSERVICE_EXCEPTION;
    private final static QName BANKEMPLOYEEWEBSERVICE_QNAME = new QName("http://bank_web_services/", "BankEmployeeWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Web_Service/BankEmployeeWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKEMPLOYEEWEBSERVICE_WSDL_LOCATION = url;
        BANKEMPLOYEEWEBSERVICE_EXCEPTION = e;
    }

    public BankEmployeeWebService() {
        super(__getWsdlLocation(), BANKEMPLOYEEWEBSERVICE_QNAME);
    }

    public BankEmployeeWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKEMPLOYEEWEBSERVICE_QNAME, features);
    }

    public BankEmployeeWebService(URL wsdlLocation) {
        super(wsdlLocation, BANKEMPLOYEEWEBSERVICE_QNAME);
    }

    public BankEmployeeWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKEMPLOYEEWEBSERVICE_QNAME, features);
    }

    public BankEmployeeWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankEmployeeWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmployeeWebService
     */
    @WebEndpoint(name = "EmployeeWebServicePort")
    public EmployeeWebService getEmployeeWebServicePort() {
        return super.getPort(new QName("http://bank_web_services/", "EmployeeWebServicePort"), EmployeeWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeWebService
     */
    @WebEndpoint(name = "EmployeeWebServicePort")
    public EmployeeWebService getEmployeeWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bank_web_services/", "EmployeeWebServicePort"), EmployeeWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKEMPLOYEEWEBSERVICE_EXCEPTION!= null) {
            throw BANKEMPLOYEEWEBSERVICE_EXCEPTION;
        }
        return BANKEMPLOYEEWEBSERVICE_WSDL_LOCATION;
    }

}
