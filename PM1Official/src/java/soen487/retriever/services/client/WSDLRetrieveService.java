
package soen487.retriever.services.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSDLRetrieveService", targetNamespace = "http://services.retriever.soen487/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSDLRetrieveService {


    /**
     * 
     * @param limit
     * @param wsdlURI
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws IOException_Exception
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveWSDLs", targetNamespace = "http://services.retriever.soen487/", className = "soen487.retriever.services.client.RetrieveWSDLs")
    @ResponseWrapper(localName = "retrieveWSDLsResponse", targetNamespace = "http://services.retriever.soen487/", className = "soen487.retriever.services.client.RetrieveWSDLsResponse")
    @Action(input = "http://services.retriever.soen487/WSDLRetrieveService/retrieveWSDLsRequest", output = "http://services.retriever.soen487/WSDLRetrieveService/retrieveWSDLsResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://services.retriever.soen487/WSDLRetrieveService/retrieveWSDLs/Fault/MalformedURLException"),
        @FaultAction(className = IOException_Exception.class, value = "http://services.retriever.soen487/WSDLRetrieveService/retrieveWSDLs/Fault/IOException")
    })
    public List<String> retrieveWSDLs(
        @WebParam(name = "wsdlURI", targetNamespace = "")
        String wsdlURI,
        @WebParam(name = "limit", targetNamespace = "")
        Integer limit)
        throws IOException_Exception, MalformedURLException_Exception
    ;

}