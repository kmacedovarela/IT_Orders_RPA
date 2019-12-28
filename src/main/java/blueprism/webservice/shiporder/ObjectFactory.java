
package blueprism.webservice.shiporder;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the blueprism.webservice.shiporder package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blueprism.webservice.shiporder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipOrder }
     * 
     */
    public ShipOrder createShipOrder() {
        return new ShipOrder();
    }

    /**
     * Create an instance of {@link ShipOrderResponse }
     * 
     */
    public ShipOrderResponse createShipOrderResponse() {
        return new ShipOrderResponse();
    }

}
