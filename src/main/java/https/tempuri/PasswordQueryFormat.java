//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.24 at 04:29:07 PM CEST 
//


package https.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordQueryFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PasswordQueryFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Exact"/>
 *     &lt;enumeration value="Regexp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PasswordQueryFormat")
@XmlEnum
public enum PasswordQueryFormat {

    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("Regexp")
    REGEXP("Regexp");
    private final String value;

    PasswordQueryFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PasswordQueryFormat fromValue(String v) {
        for (PasswordQueryFormat c: PasswordQueryFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
