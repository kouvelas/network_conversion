//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.12 at 05:26:31 PM PDT 
//


package icm.toplschema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gain_Alinea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="gain_Hero" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="activation_threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="deactivation_threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "onramp")
public class Onramp {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "gain_Alinea", required = true)
    protected BigDecimal gainAlinea;
    @XmlAttribute(name = "gain_Hero", required = true)
    protected BigDecimal gainHero;
    @XmlAttribute(name = "activation_threshold", required = true)
    protected BigDecimal activationThreshold;
    @XmlAttribute(name = "deactivation_threshold", required = true)
    protected BigDecimal deactivationThreshold;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the gainAlinea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGainAlinea() {
        return gainAlinea;
    }

    /**
     * Sets the value of the gainAlinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGainAlinea(BigDecimal value) {
        this.gainAlinea = value;
    }

    /**
     * Gets the value of the gainHero property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGainHero() {
        return gainHero;
    }

    /**
     * Sets the value of the gainHero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGainHero(BigDecimal value) {
        this.gainHero = value;
    }

    /**
     * Gets the value of the activationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivationThreshold() {
        return activationThreshold;
    }

    /**
     * Sets the value of the activationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivationThreshold(BigDecimal value) {
        this.activationThreshold = value;
    }

    /**
     * Gets the value of the deactivationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeactivationThreshold() {
        return deactivationThreshold;
    }

    /**
     * Sets the value of the deactivationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeactivationThreshold(BigDecimal value) {
        this.deactivationThreshold = value;
    }

}
