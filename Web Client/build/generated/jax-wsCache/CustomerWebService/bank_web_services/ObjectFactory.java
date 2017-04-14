
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

    private final static QName _CreateCustomerResponse_QNAME = new QName("http://bank_web_services/", "createCustomerResponse");
    private final static QName _CreateCustomer_QNAME = new QName("http://bank_web_services/", "createCustomer");
    private final static QName _Test_QNAME = new QName("http://bank_web_services/", "test");
    private final static QName _DeleteData_QNAME = new QName("http://bank_web_services/", "deleteData");
    private final static QName _SearchForCustomer_QNAME = new QName("http://bank_web_services/", "searchForCustomer");
    private final static QName _EditCustomer_QNAME = new QName("http://bank_web_services/", "editCustomer");
    private final static QName _GetCustomerListResponse_QNAME = new QName("http://bank_web_services/", "getCustomerListResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://bank_web_services/", "editCustomerResponse");
    private final static QName _DeleteDataResponse_QNAME = new QName("http://bank_web_services/", "deleteDataResponse");
    private final static QName _GetCustomerList_QNAME = new QName("http://bank_web_services/", "getCustomerList");
    private final static QName _SearchForCustomerResponse_QNAME = new QName("http://bank_web_services/", "searchForCustomerResponse");
    private final static QName _TestResponse_QNAME = new QName("http://bank_web_services/", "testResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bank_web_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchForCustomer }
     * 
     */
    public SearchForCustomer createSearchForCustomer() {
        return new SearchForCustomer();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerListResponse }
     * 
     */
    public GetCustomerListResponse createGetCustomerListResponse() {
        return new GetCustomerListResponse();
    }

    /**
     * Create an instance of {@link DeleteData }
     * 
     */
    public DeleteData createDeleteData() {
        return new DeleteData();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link GetCustomerList }
     * 
     */
    public GetCustomerList createGetCustomerList() {
        return new GetCustomerList();
    }

    /**
     * Create an instance of {@link SearchForCustomerResponse }
     * 
     */
    public SearchForCustomerResponse createSearchForCustomerResponse() {
        return new SearchForCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteDataResponse }
     * 
     */
    public DeleteDataResponse createDeleteDataResponse() {
        return new DeleteDataResponse();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "deleteData")
    public JAXBElement<DeleteData> createDeleteData(DeleteData value) {
        return new JAXBElement<DeleteData>(_DeleteData_QNAME, DeleteData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "searchForCustomer")
    public JAXBElement<SearchForCustomer> createSearchForCustomer(SearchForCustomer value) {
        return new JAXBElement<SearchForCustomer>(_SearchForCustomer_QNAME, SearchForCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "editCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "getCustomerListResponse")
    public JAXBElement<GetCustomerListResponse> createGetCustomerListResponse(GetCustomerListResponse value) {
        return new JAXBElement<GetCustomerListResponse>(_GetCustomerListResponse_QNAME, GetCustomerListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "editCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "deleteDataResponse")
    public JAXBElement<DeleteDataResponse> createDeleteDataResponse(DeleteDataResponse value) {
        return new JAXBElement<DeleteDataResponse>(_DeleteDataResponse_QNAME, DeleteDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "getCustomerList")
    public JAXBElement<GetCustomerList> createGetCustomerList(GetCustomerList value) {
        return new JAXBElement<GetCustomerList>(_GetCustomerList_QNAME, GetCustomerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "searchForCustomerResponse")
    public JAXBElement<SearchForCustomerResponse> createSearchForCustomerResponse(SearchForCustomerResponse value) {
        return new JAXBElement<SearchForCustomerResponse>(_SearchForCustomerResponse_QNAME, SearchForCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_web_services/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

}
