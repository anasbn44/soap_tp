
package ma.enset.client.proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.server.enset.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "http://ws.server.enset.ma/", className = "ma.enset.client.proxy.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "http://ws.server.enset.ma/", className = "ma.enset.client.proxy.ConvertResponse")
    @Action(input = "http://ws.server.enset.ma/BanqueService/convertRequest", output = "http://ws.server.enset.ma/BanqueService/convertResponse")
    public double convert(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ma.enset.client.proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.server.enset.ma/", className = "ma.enset.client.proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.server.enset.ma/", className = "ma.enset.client.proxy.GetCompteResponse")
    @Action(input = "http://ws.server.enset.ma/BanqueService/getCompteRequest", output = "http://ws.server.enset.ma/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<ma.enset.client.proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws.server.enset.ma/", className = "ma.enset.client.proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws.server.enset.ma/", className = "ma.enset.client.proxy.ListComptesResponse")
    @Action(input = "http://ws.server.enset.ma/BanqueService/listComptesRequest", output = "http://ws.server.enset.ma/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

}
