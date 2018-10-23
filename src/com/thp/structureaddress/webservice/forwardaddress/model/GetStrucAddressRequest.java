
package com.thp.structureaddress.webservice.forwardaddress.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStrucAddressRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStrucAddressRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STRUCADDR_IN" type="{http://soa.csg.cn}STRUCADDRIn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStrucAddressRequest", propOrder = {
    "strucaddrin"
})
public class GetStrucAddressRequest {

    @XmlElement(name = "STRUCADDR_IN")
    protected List<STRUCADDRIn> strucaddrin;

    /**
     * Gets the value of the strucaddrin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strucaddrin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRUCADDRIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRUCADDRIn }
     * 
     * 
     */
    public List<STRUCADDRIn> getSTRUCADDRIN() {
        if (strucaddrin == null) {
            strucaddrin = new ArrayList<STRUCADDRIn>();
        }
        return this.strucaddrin;
    }

    
    public void setStrucaddrin(List<STRUCADDRIn> strucaddrin) {
		this.strucaddrin = strucaddrin;
	}
}
