//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 01:29:44 PM BST 
//


package encourager.generated.meterreadings;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RationalNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RationalNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RationalNumber", propOrder = {
    "denominator",
    "numerator"
})
public class RationalNumber {

    @XmlElement(required = true)
    protected BigInteger denominator;
    @XmlElement(required = true)
    protected BigInteger numerator;

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenominator(BigInteger value) {
        this.denominator = value;
    }

    /**
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumerator(BigInteger value) {
        this.numerator = value;
    }

}
