//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.12 at 05:26:31 PM PDT 
//


package icm.toplschema;

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
 *       &lt;attribute name="outlink" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inlink" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "pair")
public class Pair {

    @XmlAttribute(name = "outlink", required = true)
    protected String outlink;
    @XmlAttribute(name = "inlink", required = true)
    protected String inlink;

    /**
     * Gets the value of the outlink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlink() {
        return outlink;
    }

    /**
     * Sets the value of the outlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlink(String value) {
        this.outlink = value;
    }

    /**
     * Gets the value of the inlink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlink() {
        return inlink;
    }

    /**
     * Sets the value of the inlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlink(String value) {
        this.inlink = value;
    }

}
