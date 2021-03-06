//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 05:14:09 PM BST 
//


package encourager.generated.meterconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAssetModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAssetModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateStandardKind" type="{http://www.encourage-project.eu/MeterConfig#}CorporateStandardKind" minOccurs="0"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageKind" type="{http://www.encourage-project.eu/MeterConfig#}AssetModelUsageKind" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.encourage-project.eu/MeterConfig#}Manufacturer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAssetModel", propOrder = {
    "corporateStandardKind",
    "modelNumber",
    "modelVersion",
    "usageKind",
    "manufacturer"
})
public class ProductAssetModel {

    protected CorporateStandardKind corporateStandardKind;
    protected String modelNumber;
    protected String modelVersion;
    protected AssetModelUsageKind usageKind;
    @XmlElement(name = "Manufacturer")
    protected Manufacturer manufacturer;

    /**
     * Gets the value of the corporateStandardKind property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateStandardKind }
     *     
     */
    public CorporateStandardKind getCorporateStandardKind() {
        return corporateStandardKind;
    }

    /**
     * Sets the value of the corporateStandardKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateStandardKind }
     *     
     */
    public void setCorporateStandardKind(CorporateStandardKind value) {
        this.corporateStandardKind = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * Gets the value of the usageKind property.
     * 
     * @return
     *     possible object is
     *     {@link AssetModelUsageKind }
     *     
     */
    public AssetModelUsageKind getUsageKind() {
        return usageKind;
    }

    /**
     * Sets the value of the usageKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetModelUsageKind }
     *     
     */
    public void setUsageKind(AssetModelUsageKind value) {
        this.usageKind = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link Manufacturer }
     *     
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manufacturer }
     *     
     */
    public void setManufacturer(Manufacturer value) {
        this.manufacturer = value;
    }

}
