
package proxies;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonSvcImplService", targetNamespace = "http://service.com/", wsdlLocation = "http://localhost:7777/ws/myperson?wsdl")
public class PersonSvcImplService
    extends Service
{

    private final static URL PERSONSVCIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONSVCIMPLSERVICE_EXCEPTION;
    private final static QName PERSONSVCIMPLSERVICE_QNAME = new QName("http://service.com/", "PersonSvcImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7777/ws/myperson?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONSVCIMPLSERVICE_WSDL_LOCATION = url;
        PERSONSVCIMPLSERVICE_EXCEPTION = e;
    }

    public PersonSvcImplService() {
        super(__getWsdlLocation(), PERSONSVCIMPLSERVICE_QNAME);
    }

    public PersonSvcImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONSVCIMPLSERVICE_QNAME, features);
    }

    public PersonSvcImplService(URL wsdlLocation) {
        super(wsdlLocation, PERSONSVCIMPLSERVICE_QNAME);
    }

    public PersonSvcImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONSVCIMPLSERVICE_QNAME, features);
    }

    public PersonSvcImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonSvcImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonSvc
     */
    @WebEndpoint(name = "PersonSvcImplPort")
    public PersonSvc getPersonSvcImplPort() {
        return super.getPort(new QName("http://service.com/", "PersonSvcImplPort"), PersonSvc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonSvc
     */
    @WebEndpoint(name = "PersonSvcImplPort")
    public PersonSvc getPersonSvcImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.com/", "PersonSvcImplPort"), PersonSvc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONSVCIMPLSERVICE_EXCEPTION!= null) {
            throw PERSONSVCIMPLSERVICE_EXCEPTION;
        }
        return PERSONSVCIMPLSERVICE_WSDL_LOCATION;
    }

}
