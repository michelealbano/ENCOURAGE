//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.19 at 02:19:15 PM GMT 
//


package encourager.generated.confappliance;

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
 *       &lt;attribute name="appliance_activacion_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appliance_desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appliance_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appliance_investment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appliance_leaving_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appliance_power" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="load_type_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="room_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subcategory_id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "ConfAppliance")
public class ConfAppliance {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "appliance_activacion_date")
    protected String applianceActivacionDate;
    @XmlAttribute(name = "appliance_desc")
    protected String applianceDesc;
    @XmlAttribute(name = "appliance_id")
    protected String applianceId;
    @XmlAttribute(name = "appliance_investment")
    protected String applianceInvestment;
    @XmlAttribute(name = "appliance_leaving_date")
    protected String applianceLeavingDate;
    @XmlAttribute(name = "appliance_power")
    protected String appliancePower;
    @XmlAttribute(name = "load_type_id")
    protected String loadTypeId;
    @XmlAttribute(name = "room_id")
    protected String roomId;
    @XmlAttribute(name = "subcategory_id")
    protected String subcategoryId;

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
     * Gets the value of the applianceActivacionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceActivacionDate() {
        return applianceActivacionDate;
    }

    /**
     * Sets the value of the applianceActivacionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceActivacionDate(String value) {
        this.applianceActivacionDate = value;
    }

    /**
     * Gets the value of the applianceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceDesc() {
        return applianceDesc;
    }

    /**
     * Sets the value of the applianceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceDesc(String value) {
        this.applianceDesc = value;
    }

    /**
     * Gets the value of the applianceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceId() {
        return applianceId;
    }

    /**
     * Sets the value of the applianceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceId(String value) {
        this.applianceId = value;
    }

    /**
     * Gets the value of the applianceInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceInvestment() {
        return applianceInvestment;
    }

    /**
     * Sets the value of the applianceInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceInvestment(String value) {
        this.applianceInvestment = value;
    }

    /**
     * Gets the value of the applianceLeavingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceLeavingDate() {
        return applianceLeavingDate;
    }

    /**
     * Sets the value of the applianceLeavingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceLeavingDate(String value) {
        this.applianceLeavingDate = value;
    }

    /**
     * Gets the value of the appliancePower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliancePower() {
        return appliancePower;
    }

    /**
     * Sets the value of the appliancePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliancePower(String value) {
        this.appliancePower = value;
    }

    /**
     * Gets the value of the loadTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadTypeId() {
        return loadTypeId;
    }

    /**
     * Sets the value of the loadTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadTypeId(String value) {
        this.loadTypeId = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomId(String value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the subcategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcategoryId() {
        return subcategoryId;
    }

    /**
     * Sets the value of the subcategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcategoryId(String value) {
        this.subcategoryId = value;
    }

}
