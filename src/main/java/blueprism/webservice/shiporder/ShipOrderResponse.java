
package blueprism.webservice.shiporder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingComment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shippingId",
    "shippingComment"
})
@XmlRootElement(name = "ShipOrderResponse")
public class ShipOrderResponse implements java.io.Serializable {

    @XmlElement(name = "ShippingId", required = true)
    protected String shippingId;
    @XmlElement(name = "ShippingComment", required = true)
    protected String shippingComment;

    /**
     * Gets the value of the shippingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingId() {
        return shippingId;
    }

    /**
     * Sets the value of the shippingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingId(String value) {
        this.shippingId = value;
    }

    /**
     * Gets the value of the shippingComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingComment() {
        return shippingComment;
    }

    /**
     * Sets the value of the shippingComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingComment(String value) {
        this.shippingComment = value;
    }

}
