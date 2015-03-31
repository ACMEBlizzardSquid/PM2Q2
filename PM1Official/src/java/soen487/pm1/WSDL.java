/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soen487.pm1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xmlsoap.schemas.wsdl.ObjectFactory;
import soen487.xml.XMLParser;
import soen487.xml.XMLReader;

/**
 *
 * @author c_bode
 */
public class WSDL {
    
    public static String run () throws ParserConfigurationException, SAXException, IOException {
        
        Document doc = XMLReader.readAsDOM("http://users.encs.concordia.ca/~s487_4/examples/soap/faultmessage/faultSample.wsdl");
        String result = XMLParser.prettyPrint(doc.getDocumentElement());
        return result;
    }
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
        System.out.println(run());
    }
    
    public static String getWSDL(String url)  throws ParserConfigurationException, SAXException, IOException{
        String result = "";
        try {
            result = XMLReader.readAsString(url);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
}
