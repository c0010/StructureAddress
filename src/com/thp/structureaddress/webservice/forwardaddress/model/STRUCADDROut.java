
package com.thp.structureaddress.webservice.forwardaddress.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STRUCADDROut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRUCADDROut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CXBZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SJQHDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SJQHMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QXDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QXMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XZDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XZMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZRCQHDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZRCQHMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JLXDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JLXMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MPDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MPMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JZWDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JZWMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DYDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DYMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FJDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FJMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DZQC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZXJD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZXWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SYZTDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QYSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GXSJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PPD" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="BYZD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BYZD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BYZD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRUCADDROut", propOrder = {
    "cxbz",
    "guid",
    "sjqhdm",
    "sjqhmc",
    "qxdm",
    "qxmc",
    "xzdm",
    "xzmc",
    "zrcqhdm",
    "zrcqhmc",
    "jlxdm",
    "jlxmc",
    "mpdm",
    "mpmc",
    "jzwdm",
    "jzwmc",
    "dydm",
    "dymc",
    "lch",
    "fjdm",
    "fjmc",
    "dzqc",
    "bm",
    "zxjd",
    "zxwd",
    "syztdm",
    "qysj",
    "tysj",
    "gxsj",
    "ppd",
    "byzd1",
    "byzd2",
    "byzd3"
})
public class STRUCADDROut {

    @XmlElement(name = "CXBZ",namespace="http://soa.csg.cn")
    protected String cxbz;
    @XmlElement(name = "GUID",namespace="http://soa.csg.cn")
    protected String guid;
    @XmlElement(name = "SJQHDM",namespace="http://soa.csg.cn")
    protected String sjqhdm;
    @XmlElement(name = "SJQHMC",namespace="http://soa.csg.cn")
    protected String sjqhmc;
    @XmlElement(name = "QXDM",namespace="http://soa.csg.cn")
    protected String qxdm;
    @XmlElement(name = "QXMC",namespace="http://soa.csg.cn")
    protected String qxmc;
    @XmlElement(name = "XZDM",namespace="http://soa.csg.cn")
    protected String xzdm;
    @XmlElement(name = "XZMC",namespace="http://soa.csg.cn")
    protected String xzmc;
    @XmlElement(name = "ZRCQHDM",namespace="http://soa.csg.cn")
    protected String zrcqhdm;
    @XmlElement(name = "ZRCQHMC",namespace="http://soa.csg.cn")
    protected String zrcqhmc;
    @XmlElement(name = "JLXDM",namespace="http://soa.csg.cn")
    protected String jlxdm;
    @XmlElement(name = "JLXMC",namespace="http://soa.csg.cn")
    protected String jlxmc;
    @XmlElement(name = "MPDM",namespace="http://soa.csg.cn")
    protected String mpdm;
    @XmlElement(name = "MPMC",namespace="http://soa.csg.cn")
    protected String mpmc;
    @XmlElement(name = "JZWDM",namespace="http://soa.csg.cn")
    protected String jzwdm;
    @XmlElement(name = "JZWMC",namespace="http://soa.csg.cn")
    protected String jzwmc;
    @XmlElement(name = "DYDM",namespace="http://soa.csg.cn")
    protected String dydm;
    @XmlElement(name = "DYMC",namespace="http://soa.csg.cn")
    protected String dymc;
    @XmlElement(name = "LCH",namespace="http://soa.csg.cn")
    protected String lch;
    @XmlElement(name = "FJDM",namespace="http://soa.csg.cn")
    protected String fjdm;
    @XmlElement(name = "FJMC",namespace="http://soa.csg.cn")
    protected String fjmc;
    @XmlElement(name = "DZQC",namespace="http://soa.csg.cn")
    protected String dzqc;
    @XmlElement(name = "BM",namespace="http://soa.csg.cn")
    protected String bm;
    @XmlElement(name = "ZXJD",namespace="http://soa.csg.cn")
    protected String zxjd;
    @XmlElement(name = "ZXWD",namespace="http://soa.csg.cn")
    protected String zxwd;
    @XmlElement(name = "SYZTDM",namespace="http://soa.csg.cn")
    protected String syztdm;
    @XmlElement(name = "QYSJ",namespace="http://soa.csg.cn")
    protected String qysj;
    @XmlElement(name = "TYSJ",namespace="http://soa.csg.cn")
    protected String tysj;
    @XmlElement(name = "GXSJ",namespace="http://soa.csg.cn")
    protected String gxsj;
    @XmlElement(name = "PPD",namespace="http://soa.csg.cn")
    protected Float ppd;
    @XmlElement(name = "BYZD1",namespace="http://soa.csg.cn")
    protected String byzd1;
    @XmlElement(name = "BYZD2",namespace="http://soa.csg.cn")
    protected String byzd2;
    @XmlElement(name = "BYZD3",namespace="http://soa.csg.cn")
    protected String byzd3;

    /**
     * Gets the value of the cxbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCXBZ() {
        return cxbz;
    }

    /**
     * Sets the value of the cxbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCXBZ(String value) {
        this.cxbz = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the sjqhdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSJQHDM() {
        return sjqhdm;
    }

    /**
     * Sets the value of the sjqhdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSJQHDM(String value) {
        this.sjqhdm = value;
    }

    /**
     * Gets the value of the sjqhmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSJQHMC() {
        return sjqhmc;
    }

    /**
     * Sets the value of the sjqhmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSJQHMC(String value) {
        this.sjqhmc = value;
    }

    /**
     * Gets the value of the qxdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQXDM() {
        return qxdm;
    }

    /**
     * Sets the value of the qxdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQXDM(String value) {
        this.qxdm = value;
    }

    /**
     * Gets the value of the qxmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQXMC() {
        return qxmc;
    }

    /**
     * Sets the value of the qxmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQXMC(String value) {
        this.qxmc = value;
    }

    /**
     * Gets the value of the xzdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXZDM() {
        return xzdm;
    }

    /**
     * Sets the value of the xzdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXZDM(String value) {
        this.xzdm = value;
    }

    /**
     * Gets the value of the xzmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXZMC() {
        return xzmc;
    }

    /**
     * Sets the value of the xzmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXZMC(String value) {
        this.xzmc = value;
    }

    /**
     * Gets the value of the zrcqhdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRCQHDM() {
        return zrcqhdm;
    }

    /**
     * Sets the value of the zrcqhdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRCQHDM(String value) {
        this.zrcqhdm = value;
    }

    /**
     * Gets the value of the zrcqhmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRCQHMC() {
        return zrcqhmc;
    }

    /**
     * Sets the value of the zrcqhmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRCQHMC(String value) {
        this.zrcqhmc = value;
    }

    /**
     * Gets the value of the jlxdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJLXDM() {
        return jlxdm;
    }

    /**
     * Sets the value of the jlxdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJLXDM(String value) {
        this.jlxdm = value;
    }

    /**
     * Gets the value of the jlxmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJLXMC() {
        return jlxmc;
    }

    /**
     * Sets the value of the jlxmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJLXMC(String value) {
        this.jlxmc = value;
    }

    /**
     * Gets the value of the mpdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPDM() {
        return mpdm;
    }

    /**
     * Sets the value of the mpdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPDM(String value) {
        this.mpdm = value;
    }

    /**
     * Gets the value of the mpmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPMC() {
        return mpmc;
    }

    /**
     * Sets the value of the mpmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPMC(String value) {
        this.mpmc = value;
    }

    /**
     * Gets the value of the jzwdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJZWDM() {
        return jzwdm;
    }

    /**
     * Sets the value of the jzwdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJZWDM(String value) {
        this.jzwdm = value;
    }

    /**
     * Gets the value of the jzwmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJZWMC() {
        return jzwmc;
    }

    /**
     * Sets the value of the jzwmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJZWMC(String value) {
        this.jzwmc = value;
    }

    /**
     * Gets the value of the dydm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDYDM() {
        return dydm;
    }

    /**
     * Sets the value of the dydm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDYDM(String value) {
        this.dydm = value;
    }

    /**
     * Gets the value of the dymc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDYMC() {
        return dymc;
    }

    /**
     * Sets the value of the dymc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDYMC(String value) {
        this.dymc = value;
    }

    /**
     * Gets the value of the lch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCH() {
        return lch;
    }

    /**
     * Sets the value of the lch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCH(String value) {
        this.lch = value;
    }

    /**
     * Gets the value of the fjdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFJDM() {
        return fjdm;
    }

    /**
     * Sets the value of the fjdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFJDM(String value) {
        this.fjdm = value;
    }

    /**
     * Gets the value of the fjmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFJMC() {
        return fjmc;
    }

    /**
     * Sets the value of the fjmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFJMC(String value) {
        this.fjmc = value;
    }

    /**
     * Gets the value of the dzqc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDZQC() {
        return dzqc;
    }

    /**
     * Sets the value of the dzqc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDZQC(String value) {
        this.dzqc = value;
    }

    /**
     * Gets the value of the bm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBM() {
        return bm;
    }

    /**
     * Sets the value of the bm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBM(String value) {
        this.bm = value;
    }

    /**
     * Gets the value of the zxjd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZXJD() {
        return zxjd;
    }

    /**
     * Sets the value of the zxjd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZXJD(String value) {
        this.zxjd = value;
    }

    /**
     * Gets the value of the zxwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZXWD() {
        return zxwd;
    }

    /**
     * Sets the value of the zxwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZXWD(String value) {
        this.zxwd = value;
    }

    /**
     * Gets the value of the syztdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYZTDM() {
        return syztdm;
    }

    /**
     * Sets the value of the syztdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYZTDM(String value) {
        this.syztdm = value;
    }

    /**
     * Gets the value of the qysj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQYSJ() {
        return qysj;
    }

    /**
     * Sets the value of the qysj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQYSJ(String value) {
        this.qysj = value;
    }

    /**
     * Gets the value of the tysj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYSJ() {
        return tysj;
    }

    /**
     * Sets the value of the tysj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYSJ(String value) {
        this.tysj = value;
    }

    /**
     * Gets the value of the gxsj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGXSJ() {
        return gxsj;
    }

    /**
     * Sets the value of the gxsj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGXSJ(String value) {
        this.gxsj = value;
    }

    /**
     * Gets the value of the ppd property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPPD() {
        return ppd;
    }

    /**
     * Sets the value of the ppd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPPD(Float value) {
        this.ppd = value;
    }

    /**
     * Gets the value of the byzd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYZD1() {
        return byzd1;
    }

    /**
     * Sets the value of the byzd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYZD1(String value) {
        this.byzd1 = value;
    }

    /**
     * Gets the value of the byzd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYZD2() {
        return byzd2;
    }

    /**
     * Sets the value of the byzd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYZD2(String value) {
        this.byzd2 = value;
    }

    /**
     * Gets the value of the byzd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYZD3() {
        return byzd3;
    }

    /**
     * Sets the value of the byzd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYZD3(String value) {
        this.byzd3 = value;
    }

}
