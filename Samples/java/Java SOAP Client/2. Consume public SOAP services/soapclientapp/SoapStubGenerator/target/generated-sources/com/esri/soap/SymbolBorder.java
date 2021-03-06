
package com.esri.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SymbolBorder complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SymbolBorder"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.7}Border"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="HorizontalGap" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="CornerRounding" type="{http://www.w3.org/2001/XMLSchema}short"/&amp;gt;
 *         &amp;lt;element name="VerticalGap" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="Symbol" type="{http://www.esri.com/schemas/ArcGIS/10.7}LineSymbol" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolBorder", propOrder = {
    "horizontalGap",
    "cornerRounding",
    "verticalGap",
    "symbol"
})
public class SymbolBorder
    extends Border
{

    @XmlElement(name = "HorizontalGap")
    protected double horizontalGap;
    @XmlElement(name = "CornerRounding")
    protected short cornerRounding;
    @XmlElement(name = "VerticalGap")
    protected double verticalGap;
    @XmlElement(name = "Symbol")
    protected LineSymbol symbol;

    /**
     * Gets the value of the horizontalGap property.
     * 
     */
    public double getHorizontalGap() {
        return horizontalGap;
    }

    /**
     * Sets the value of the horizontalGap property.
     * 
     */
    public void setHorizontalGap(double value) {
        this.horizontalGap = value;
    }

    /**
     * Gets the value of the cornerRounding property.
     * 
     */
    public short getCornerRounding() {
        return cornerRounding;
    }

    /**
     * Sets the value of the cornerRounding property.
     * 
     */
    public void setCornerRounding(short value) {
        this.cornerRounding = value;
    }

    /**
     * Gets the value of the verticalGap property.
     * 
     */
    public double getVerticalGap() {
        return verticalGap;
    }

    /**
     * Sets the value of the verticalGap property.
     * 
     */
    public void setVerticalGap(double value) {
        this.verticalGap = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link LineSymbol }
     *     
     */
    public LineSymbol getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineSymbol }
     *     
     */
    public void setSymbol(LineSymbol value) {
        this.symbol = value;
    }

}
