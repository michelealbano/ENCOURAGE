//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.19 at 02:25:04 PM GMT 
//


package encourager.generated.confroom;

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
 *       &lt;attribute name="cell_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="room_desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="room_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="room_max_ocup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="room_surface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="room_volume" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "ConfRoom")
public class ConfRoom {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "cell_id")
    protected String cellId;
    @XmlAttribute(name = "room_desc")
    protected String roomDesc;
    @XmlAttribute(name = "room_id")
    protected String roomId;
    @XmlAttribute(name = "room_max_ocup")
    protected String roomMaxOcup;
    @XmlAttribute(name = "room_surface")
    protected String roomSurface;
    @XmlAttribute(name = "room_volume")
    protected String roomVolume;

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
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellId(String value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the roomDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDesc() {
        return roomDesc;
    }

    /**
     * Sets the value of the roomDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDesc(String value) {
        this.roomDesc = value;
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
     * Gets the value of the roomMaxOcup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomMaxOcup() {
        return roomMaxOcup;
    }

    /**
     * Sets the value of the roomMaxOcup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomMaxOcup(String value) {
        this.roomMaxOcup = value;
    }

    /**
     * Gets the value of the roomSurface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomSurface() {
        return roomSurface;
    }

    /**
     * Sets the value of the roomSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomSurface(String value) {
        this.roomSurface = value;
    }

    /**
     * Gets the value of the roomVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomVolume() {
        return roomVolume;
    }

    /**
     * Sets the value of the roomVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomVolume(String value) {
        this.roomVolume = value;
    }

}
