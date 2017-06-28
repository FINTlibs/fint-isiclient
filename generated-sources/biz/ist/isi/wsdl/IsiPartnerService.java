package biz.ist.isi.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-28T17:07:58.767+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "isiPartnerService", 
                  wsdlLocation = "file:src/main/resources/ISIPartnerEndpoint.wsdl",
                  targetNamespace = "http://isi.ist.biz/wsdl") 
public class IsiPartnerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://isi.ist.biz/wsdl", "isiPartnerService");
    public final static QName IsiPartnerPort = new QName("http://isi.ist.biz/wsdl", "isiPartnerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:src/main/resources/ISIPartnerEndpoint.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IsiPartnerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:src/main/resources/ISIPartnerEndpoint.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IsiPartnerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IsiPartnerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IsiPartnerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public IsiPartnerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IsiPartnerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IsiPartnerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IsiPartnerInterface
     */
    @WebEndpoint(name = "isiPartnerPort")
    public IsiPartnerInterface getIsiPartnerPort() {
        return super.getPort(IsiPartnerPort, IsiPartnerInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IsiPartnerInterface
     */
    @WebEndpoint(name = "isiPartnerPort")
    public IsiPartnerInterface getIsiPartnerPort(WebServiceFeature... features) {
        return super.getPort(IsiPartnerPort, IsiPartnerInterface.class, features);
    }

}
