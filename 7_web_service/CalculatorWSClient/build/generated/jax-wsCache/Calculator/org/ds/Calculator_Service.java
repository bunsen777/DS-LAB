
package org.ds;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Calculator", targetNamespace = "http://ds.org/", wsdlLocation = "http://localhost:8080/CalculatorWS/Calculator?wsdl")
public class Calculator_Service
    extends Service
{

    private final static URL CALCULATOR_WSDL_LOCATION;
    private final static WebServiceException CALCULATOR_EXCEPTION;
    private final static QName CALCULATOR_QNAME = new QName("http://ds.org/", "Calculator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalculatorWS/Calculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATOR_WSDL_LOCATION = url;
        CALCULATOR_EXCEPTION = e;
    }

    public Calculator_Service() {
        super(__getWsdlLocation(), CALCULATOR_QNAME);
    }

    public Calculator_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATOR_QNAME, features);
    }

    public Calculator_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCULATOR_QNAME);
    }

    public Calculator_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATOR_QNAME, features);
    }

    public Calculator_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculator_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort() {
        return super.getPort(new QName("http://ds.org/", "CalculatorPort"), Calculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ds.org/", "CalculatorPort"), Calculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATOR_EXCEPTION!= null) {
            throw CALCULATOR_EXCEPTION;
        }
        return CALCULATOR_WSDL_LOCATION;
    }

}
