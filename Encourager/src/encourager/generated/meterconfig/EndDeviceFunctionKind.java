//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.24 at 05:14:09 PM BST 
//


package encourager.generated.meterconfig;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceFunctionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndDeviceFunctionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="autonomousDst"/>
 *     &lt;enumeration value="demandResponse"/>
 *     &lt;enumeration value="electricMetering"/>
 *     &lt;enumeration value="gasMetering"/>
 *     &lt;enumeration value="metrology"/>
 *     &lt;enumeration value="onRequestRead"/>
 *     &lt;enumeration value="outageHistory"/>
 *     &lt;enumeration value="relaysProgramming"/>
 *     &lt;enumeration value="reverseFlow"/>
 *     &lt;enumeration value="waterMetering"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndDeviceFunctionKind")
@XmlEnum
public enum EndDeviceFunctionKind {

    @XmlEnumValue("autonomousDst")
    AUTONOMOUS_DST("autonomousDst"),
    @XmlEnumValue("demandResponse")
    DEMAND_RESPONSE("demandResponse"),
    @XmlEnumValue("electricMetering")
    ELECTRIC_METERING("electricMetering"),
    @XmlEnumValue("gasMetering")
    GAS_METERING("gasMetering"),
    @XmlEnumValue("metrology")
    METROLOGY("metrology"),
    @XmlEnumValue("onRequestRead")
    ON_REQUEST_READ("onRequestRead"),
    @XmlEnumValue("outageHistory")
    OUTAGE_HISTORY("outageHistory"),
    @XmlEnumValue("relaysProgramming")
    RELAYS_PROGRAMMING("relaysProgramming"),
    @XmlEnumValue("reverseFlow")
    REVERSE_FLOW("reverseFlow"),
    @XmlEnumValue("waterMetering")
    WATER_METERING("waterMetering");
    private final String value;

    EndDeviceFunctionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndDeviceFunctionKind fromValue(String v) {
        for (EndDeviceFunctionKind c: EndDeviceFunctionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
