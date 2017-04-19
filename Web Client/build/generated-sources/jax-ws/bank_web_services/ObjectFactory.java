
package bank_web_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bank_web_services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditEmployeeResponse_QNAME = new QName("http://bank_web_services/", "editEmployeeResponse");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://bank_web_services/", "deleteEmployeeResponse");
    private final static QName _EditEmployee_QNAME = new QName("http://bank_web_services/", "editEmployee");
    private final static QName _LoginResponse_QNAME = new QName("http://bank_web_services/", "loginResponse");
    private final static QName _SearchForEmployeeResponse_QNAME = new QName("http://bank_web_services/", "searchForEmployeeResponse");
    private final static QName _SearchForEmployee_QNAME = new QName("http://bank_web_services/", "searchForEmployee");
    private final static QName _Login_QNAME = new QName("http://bank_web_services/", "login");
    private final static QName _DeleteEmployee_QNAME = new QName("http://bank_web_services/", "deleteEmployee");
    private final static QName _CreateEmployee_QNAME = new QName("http://bank_web_services/", "createEmployee");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://bank_web_services/", "createEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bank_web_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchForEmployeeResponse }
     * 
     */
    public SearchForEmployeeResponse createSearchForEmployeeResponse() {
        return new SearchForEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link SearchForEmployee }
     * 
     */
    public SearchForEmployee createSearchForEmployee() {
        return new SearchForEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "editEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "editEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "searchForEmployeeResponse")
    public JAXBElement<SearchForEmployeeResponse> createSearchForEmployeeResponse(SearchForEmployeeResponse value) {
        return new JAXBElement<SearchForEmployeeResponse>(_SearchForEmployeeResponse_QNAME, SearchForEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "searchForEmployee")
    public JAXBElement<SearchForEmployee> createSearchForEmployee(SearchForEmployee value) {
        return new JAXBElement<SearchForEmployee>(_SearchForEmployee_QNAME, SearchForEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

}
