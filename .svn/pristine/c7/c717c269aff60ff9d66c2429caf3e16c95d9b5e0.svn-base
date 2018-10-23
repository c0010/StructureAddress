
package com.thp.structureaddress.webservice.forwardaddress.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStrucAddressResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStrucAddressResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STRUCADDR_OUT" type="{http://soa.csg.cn}STRUCADDROut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStrucAddressResponse", propOrder = {
    "strucaddrout",
    "replyCode"
})
public class GetStrucAddressResponse {

    @XmlElement(name = "STRUCADDR_OUT",namespace="http://soa.csg.cn")
    protected List<STRUCADDROut> strucaddrout;
    @XmlElement(name = "replyCode",namespace="http://soa.csg.cn")
    protected String replyCode;

    /**
     * Gets the value of the strucaddrout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strucaddrout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRUCADDROUT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRUCADDROut }
     * 
     * 
     */
    public List<STRUCADDROut> getSTRUCADDROUT() {
        if (strucaddrout == null) {
            strucaddrout = new ArrayList<STRUCADDROut>();
        }
        return this.strucaddrout;
    }

    /**
     * Gets the value of the replyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyCode() {
        return replyCode;
    }

    /**
     * Sets the value of the replyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyCode(String value) {
        this.replyCode = value;
    }

}
