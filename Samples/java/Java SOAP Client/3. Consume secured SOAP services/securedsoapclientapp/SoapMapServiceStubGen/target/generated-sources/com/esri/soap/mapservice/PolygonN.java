
package com.esri.soap.mapservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PolygonN complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PolygonN"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.esri.com/schemas/ArcGIS/2.6.0}Polygon"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="HasID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="HasZ" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="HasM" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="Extent" type="{http://www.esri.com/schemas/ArcGIS/2.6.0}Envelope" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RingArray" type="{http://www.esri.com/schemas/ArcGIS/2.6.0}ArrayOfRing"/&amp;gt;
 *         &amp;lt;element name="SpatialReference" type="{http://www.esri.com/schemas/ArcGIS/2.6.0}SpatialReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KnownSimple" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonN", propOrder = {
    "hasID",
    "hasZ",
    "hasM",
    "extent",
    "ringArray",
    "spatialReference",
    "knownSimple"
})
public class PolygonN
    extends Polygon
{

    @XmlElement(name = "HasID")
    protected boolean hasID;
    @XmlElement(name = "HasZ")
    protected boolean hasZ;
    @XmlElement(name = "HasM")
    protected boolean hasM;
    @XmlElement(name = "Extent")
    protected Envelope extent;
    @XmlElement(name = "RingArray", required = true)
    protected ArrayOfRing ringArray;
    @XmlElement(name = "SpatialReference")
    protected SpatialReference spatialReference;
    @XmlElement(name = "KnownSimple")
    protected Boolean knownSimple;

    /**
     * Gets the value of the hasID property.
     * 
     */
    public boolean isHasID() {
        return hasID;
    }

    /**
     * Sets the value of the hasID property.
     * 
     */
    public void setHasID(boolean value) {
        this.hasID = value;
    }

    /**
     * Gets the value of the hasZ property.
     * 
     */
    public boolean isHasZ() {
        return hasZ;
    }

    /**
     * Sets the value of the hasZ property.
     * 
     */
    public void setHasZ(boolean value) {
        this.hasZ = value;
    }

    /**
     * Gets the value of the hasM property.
     * 
     */
    public boolean isHasM() {
        return hasM;
    }

    /**
     * Sets the value of the hasM property.
     * 
     */
    public void setHasM(boolean value) {
        this.hasM = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link Envelope }
     *     
     */
    public Envelope getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Envelope }
     *     
     */
    public void setExtent(Envelope value) {
        this.extent = value;
    }

    /**
     * Gets the value of the ringArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRing }
     *     
     */
    public ArrayOfRing getRingArray() {
        return ringArray;
    }

    /**
     * Sets the value of the ringArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRing }
     *     
     */
    public void setRingArray(ArrayOfRing value) {
        this.ringArray = value;
    }

    /**
     * Gets the value of the spatialReference property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialReference }
     *     
     */
    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    /**
     * Sets the value of the spatialReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialReference }
     *     
     */
    public void setSpatialReference(SpatialReference value) {
        this.spatialReference = value;
    }

    /**
     * Gets the value of the knownSimple property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKnownSimple() {
        return knownSimple;
    }

    /**
     * Sets the value of the knownSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKnownSimple(Boolean value) {
        this.knownSimple = value;
    }

}
