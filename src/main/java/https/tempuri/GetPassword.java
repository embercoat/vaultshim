//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.24 at 04:29:07 PM CEST 
//


package https.tempuri;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passwordWSRequest" type="{https://tempuri.org/}PasswordRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passwordWSRequest"
})
@XmlRootElement(name = "GetPassword")
public class GetPassword {

    @XmlElement(required = true)
    protected PasswordRequest passwordWSRequest;

    /**
     * Gets the value of the passwordWSRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordRequest }
     *     
     */
    public PasswordRequest getPasswordWSRequest() {
        return passwordWSRequest;
    }

    /**
     * Sets the value of the passwordWSRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordRequest }
     *     
     */
    public void setPasswordWSRequest(PasswordRequest value) {
        this.passwordWSRequest = value;
    }

}
