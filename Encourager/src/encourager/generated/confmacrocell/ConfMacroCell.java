//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.19 at 02:27:09 PM GMT 
//


package encourager.generated.confmacrocell;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="macrocell_desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="macrocell_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ConfMacroCell")
public class ConfMacroCell {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "macrocell_desc")
    protected String macrocellDesc;
    @XmlAttribute(name = "macrocell_id")
    protected String macrocellId;
    @XmlAttribute(name = "region")
    protected String region;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the macrocellDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacrocellDesc() {
        return macrocellDesc;
    }

    /**
     * Sets the value of the macrocellDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacrocellDesc(String value) {
        this.macrocellDesc = value;
    }

    /**
     * Gets the value of the macrocellId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacrocellId() {
        return macrocellId;
    }

    /**
     * Sets the value of the macrocellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacrocellId(String value) {
        this.macrocellId = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
