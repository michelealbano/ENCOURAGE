//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 05:14:09 PM BST 
//


package encourager.generated.meterconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RemoteConnectDisconnectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteConnectDisconnectInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="armedTimeout" type="{http://www.encourage-project.eu/MeterConfig#}Seconds" minOccurs="0"/>
 *         &lt;element name="energyLimit" type="{http://www.encourage-project.eu/MeterConfig#}RealEnergy" minOccurs="0"/>
 *         &lt;element name="energyUsageStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="energyUsageWarning" type="{http://www.encourage-project.eu/MeterConfig#}RealEnergy" minOccurs="0"/>
 *         &lt;element name="isArmConnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isArmDisconnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEnergyLimiting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="needsPowerLimitCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usePushbutton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteConnectDisconnectInfo", propOrder = {
    "armedTimeout",
    "energyLimit",
    "energyUsageStartDateTime",
    "energyUsageWarning",
    "isArmConnect",
    "isArmDisconnect",
    "isEnergyLimiting",
    "needsPowerLimitCheck",
    "usePushbutton"
})
public class RemoteConnectDisconnectInfo {

    protected Float armedTimeout;
    protected Float energyLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar energyUsageStartDateTime;
    protected Float energyUsageWarning;
    protected Boolean isArmConnect;
    protected Boolean isArmDisconnect;
    protected Boolean isEnergyLimiting;
    protected Boolean needsPowerLimitCheck;
    protected Boolean usePushbutton;

    /**
     * Gets the value of the armedTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getArmedTimeout() {
        return armedTimeout;
    }

    /**
     * Sets the value of the armedTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setArmedTimeout(Float value) {
        this.armedTimeout = value;
    }

    /**
     * Gets the value of the energyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEnergyLimit() {
        return energyLimit;
    }

    /**
     * Sets the value of the energyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEnergyLimit(Float value) {
        this.energyLimit = value;
    }

    /**
     * Gets the value of the energyUsageStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnergyUsageStartDateTime() {
        return energyUsageStartDateTime;
    }

    /**
     * Sets the value of the energyUsageStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnergyUsageStartDateTime(XMLGregorianCalendar value) {
        this.energyUsageStartDateTime = value;
    }

    /**
     * Gets the value of the energyUsageWarning property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEnergyUsageWarning() {
        return energyUsageWarning;
    }

    /**
     * Sets the value of the energyUsageWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEnergyUsageWarning(Float value) {
        this.energyUsageWarning = value;
    }

    /**
     * Gets the value of the isArmConnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArmConnect() {
        return isArmConnect;
    }

    /**
     * Sets the value of the isArmConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArmConnect(Boolean value) {
        this.isArmConnect = value;
    }

    /**
     * Gets the value of the isArmDisconnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArmDisconnect() {
        return isArmDisconnect;
    }

    /**
     * Sets the value of the isArmDisconnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArmDisconnect(Boolean value) {
        this.isArmDisconnect = value;
    }

    /**
     * Gets the value of the isEnergyLimiting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnergyLimiting() {
        return isEnergyLimiting;
    }

    /**
     * Sets the value of the isEnergyLimiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnergyLimiting(Boolean value) {
        this.isEnergyLimiting = value;
    }

    /**
     * Gets the value of the needsPowerLimitCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsPowerLimitCheck() {
        return needsPowerLimitCheck;
    }

    /**
     * Sets the value of the needsPowerLimitCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsPowerLimitCheck(Boolean value) {
        this.needsPowerLimitCheck = value;
    }

    /**
     * Gets the value of the usePushbutton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePushbutton() {
        return usePushbutton;
    }

    /**
     * Sets the value of the usePushbutton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePushbutton(Boolean value) {
        this.usePushbutton = value;
    }

}
