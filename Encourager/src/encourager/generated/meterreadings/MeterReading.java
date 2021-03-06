//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 01:29:44 PM BST 
//


package encourager.generated.meterreadings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeterReading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDeviceEvents" type="{http://www.encourage-project.eu/MeterReadings#}EndDeviceEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntervalBlocks" type="{http://www.encourage-project.eu/MeterReadings#}IntervalBlock" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Meter" type="{http://www.encourage-project.eu/MeterReadings#}Meter" minOccurs="0"/>
 *         &lt;element name="Readings" type="{http://www.encourage-project.eu/MeterReadings#}Reading" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsagePoint" type="{http://www.encourage-project.eu/MeterReadings#}UsagePoint" minOccurs="0"/>
 *         &lt;element name="valuesInterval" type="{http://www.encourage-project.eu/MeterReadings#}DateTimeInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReading", propOrder = {
    "endDeviceEvents",
    "intervalBlocks",
    "meter",
    "readings",
    "usagePoint",
    "valuesInterval"
})
public class MeterReading {

    @XmlElement(name = "EndDeviceEvents")
    protected List<EndDeviceEvent> endDeviceEvents;
    @XmlElement(name = "IntervalBlocks")
    protected List<IntervalBlock> intervalBlocks;
    @XmlElement(name = "Meter")
    protected Meter meter;
    @XmlElement(name = "Readings")
    protected List<Reading> readings;
    @XmlElement(name = "UsagePoint")
    protected UsagePoint usagePoint;
    protected DateTimeInterval valuesInterval;

    /**
     * Gets the value of the endDeviceEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceEvent }
     * 
     * 
     */
    public List<EndDeviceEvent> getEndDeviceEvents() {
        if (endDeviceEvents == null) {
            endDeviceEvents = new ArrayList<EndDeviceEvent>();
        }
        return this.endDeviceEvents;
    }

    /**
     * Gets the value of the intervalBlocks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalBlocks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalBlocks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervalBlock }
     * 
     * 
     */
    public List<IntervalBlock> getIntervalBlocks() {
        if (intervalBlocks == null) {
            intervalBlocks = new ArrayList<IntervalBlock>();
        }
        return this.intervalBlocks;
    }

    /**
     * Gets the value of the meter property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getMeter() {
        return meter;
    }

    /**
     * Sets the value of the meter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setMeter(Meter value) {
        this.meter = value;
    }

    /**
     * Gets the value of the readings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reading }
     * 
     * 
     */
    public List<Reading> getReadings() {
        if (readings == null) {
            readings = new ArrayList<Reading>();
        }
        return this.readings;
    }

    /**
     * Gets the value of the usagePoint property.
     * 
     * @return
     *     possible object is
     *     {@link UsagePoint }
     *     
     */
    public UsagePoint getUsagePoint() {
        return usagePoint;
    }

    /**
     * Sets the value of the usagePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsagePoint }
     *     
     */
    public void setUsagePoint(UsagePoint value) {
        this.usagePoint = value;
    }

    /**
     * Gets the value of the valuesInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getValuesInterval() {
        return valuesInterval;
    }

    /**
     * Sets the value of the valuesInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setValuesInterval(DateTimeInterval value) {
        this.valuesInterval = value;
    }

}
