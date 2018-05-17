//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.PlexilNodeCondition;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}BooleanExpression"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "or",
    "xor",
    "and",
    "not",
    "isKnown",
    "gt",
    "ge",
    "lt",
    "le",
    "eqBoolean",
    "eqNumeric",
    "eqInternal",
    "eqString",
    "neBoolean",
    "neNumeric",
    "neInternal",
    "neString",
    "booleanVariable",
    "booleanValue",
    "lookupOnChange",
    "lookupNow",
    "arrayElement"
})
@XmlRootElement(name = "InvariantCondition")
public class InvariantCondition extends PlexilNodeCondition{

    @XmlElement(name = "OR")
    protected OR or;
    @XmlElement(name = "XOR")
    protected XOR xor;
    @XmlElement(name = "AND")
    protected AND and;
    @XmlElement(name = "NOT")
    protected NOT not;
    @XmlElement(name = "IsKnown")
    protected IsKnown isKnown;
    @XmlElement(name = "GT")
    protected GT gt;
    @XmlElement(name = "GE")
    protected GE ge;
    @XmlElement(name = "LT")
    protected LT lt;
    @XmlElement(name = "LE")
    protected LE le;
    @XmlElement(name = "EQBoolean")
    protected EQBoolean eqBoolean;
    @XmlElement(name = "EQNumeric")
    protected EQNumeric eqNumeric;
    @XmlElement(name = "EQInternal")
    protected EQInternal eqInternal;
    @XmlElement(name = "EQString")
    protected EQString eqString;
    @XmlElement(name = "NEBoolean")
    protected NEBoolean neBoolean;
    @XmlElement(name = "NENumeric")
    protected NENumeric neNumeric;
    @XmlElement(name = "NEInternal")
    protected NEInternal neInternal;
    @XmlElement(name = "NEString")
    protected NEString neString;
    @XmlElement(name = "BooleanVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String booleanVariable;
    @XmlElement(name = "BooleanValue")
    protected Boolean booleanValue;
    @XmlElement(name = "LookupOnChange")
    protected LookupOnChange lookupOnChange;
    @XmlElement(name = "LookupNow")
    protected LookupNow lookupNow;
    @XmlElement(name = "ArrayElement")
    protected ArrayElement arrayElement;

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link OR }
     *     
     */
    public OR getOR() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link OR }
     *     
     */
    public void setOR(OR value) {
        this.or = value;
    }

    /**
     * Gets the value of the xor property.
     * 
     * @return
     *     possible object is
     *     {@link XOR }
     *     
     */
    public XOR getXOR() {
        return xor;
    }

    /**
     * Sets the value of the xor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOR }
     *     
     */
    public void setXOR(XOR value) {
        this.xor = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link AND }
     *     
     */
    public AND getAND() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link AND }
     *     
     */
    public void setAND(AND value) {
        this.and = value;
    }

    /**
     * Gets the value of the not property.
     * 
     * @return
     *     possible object is
     *     {@link NOT }
     *     
     */
    public NOT getNOT() {
        return not;
    }

    /**
     * Sets the value of the not property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOT }
     *     
     */
    public void setNOT(NOT value) {
        this.not = value;
    }

    /**
     * Gets the value of the isKnown property.
     * 
     * @return
     *     possible object is
     *     {@link IsKnown }
     *     
     */
    public IsKnown getIsKnown() {
        return isKnown;
    }

    /**
     * Sets the value of the isKnown property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsKnown }
     *     
     */
    public void setIsKnown(IsKnown value) {
        this.isKnown = value;
    }

    /**
     * Gets the value of the gt property.
     * 
     * @return
     *     possible object is
     *     {@link GT }
     *     
     */
    public GT getGT() {
        return gt;
    }

    /**
     * Sets the value of the gt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GT }
     *     
     */
    public void setGT(GT value) {
        this.gt = value;
    }

    /**
     * Gets the value of the ge property.
     * 
     * @return
     *     possible object is
     *     {@link GE }
     *     
     */
    public GE getGE() {
        return ge;
    }

    /**
     * Sets the value of the ge property.
     * 
     * @param value
     *     allowed object is
     *     {@link GE }
     *     
     */
    public void setGE(GE value) {
        this.ge = value;
    }

    /**
     * Gets the value of the lt property.
     * 
     * @return
     *     possible object is
     *     {@link LT }
     *     
     */
    public LT getLT() {
        return lt;
    }

    /**
     * Sets the value of the lt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LT }
     *     
     */
    public void setLT(LT value) {
        this.lt = value;
    }

    /**
     * Gets the value of the le property.
     * 
     * @return
     *     possible object is
     *     {@link LE }
     *     
     */
    public LE getLE() {
        return le;
    }

    /**
     * Sets the value of the le property.
     * 
     * @param value
     *     allowed object is
     *     {@link LE }
     *     
     */
    public void setLE(LE value) {
        this.le = value;
    }

    /**
     * Gets the value of the eqBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link EQBoolean }
     *     
     */
    public EQBoolean getEQBoolean() {
        return eqBoolean;
    }

    /**
     * Sets the value of the eqBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQBoolean }
     *     
     */
    public void setEQBoolean(EQBoolean value) {
        this.eqBoolean = value;
    }

    /**
     * Gets the value of the eqNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EQNumeric }
     *     
     */
    public EQNumeric getEQNumeric() {
        return eqNumeric;
    }

    /**
     * Sets the value of the eqNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQNumeric }
     *     
     */
    public void setEQNumeric(EQNumeric value) {
        this.eqNumeric = value;
    }

    /**
     * Gets the value of the eqInternal property.
     * 
     * @return
     *     possible object is
     *     {@link EQInternal }
     *     
     */
    public EQInternal getEQInternal() {
        return eqInternal;
    }

    /**
     * Sets the value of the eqInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQInternal }
     *     
     */
    public void setEQInternal(EQInternal value) {
        this.eqInternal = value;
    }

    /**
     * Gets the value of the eqString property.
     * 
     * @return
     *     possible object is
     *     {@link EQString }
     *     
     */
    public EQString getEQString() {
        return eqString;
    }

    /**
     * Sets the value of the eqString property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQString }
     *     
     */
    public void setEQString(EQString value) {
        this.eqString = value;
    }

    /**
     * Gets the value of the neBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link NEBoolean }
     *     
     */
    public NEBoolean getNEBoolean() {
        return neBoolean;
    }

    /**
     * Sets the value of the neBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEBoolean }
     *     
     */
    public void setNEBoolean(NEBoolean value) {
        this.neBoolean = value;
    }

    /**
     * Gets the value of the neNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NENumeric }
     *     
     */
    public NENumeric getNENumeric() {
        return neNumeric;
    }

    /**
     * Sets the value of the neNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NENumeric }
     *     
     */
    public void setNENumeric(NENumeric value) {
        this.neNumeric = value;
    }

    /**
     * Gets the value of the neInternal property.
     * 
     * @return
     *     possible object is
     *     {@link NEInternal }
     *     
     */
    public NEInternal getNEInternal() {
        return neInternal;
    }

    /**
     * Sets the value of the neInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEInternal }
     *     
     */
    public void setNEInternal(NEInternal value) {
        this.neInternal = value;
    }

    /**
     * Gets the value of the neString property.
     * 
     * @return
     *     possible object is
     *     {@link NEString }
     *     
     */
    public NEString getNEString() {
        return neString;
    }

    /**
     * Sets the value of the neString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEString }
     *     
     */
    public void setNEString(NEString value) {
        this.neString = value;
    }

    /**
     * Gets the value of the booleanVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanVariable() {
        return booleanVariable;
    }

    /**
     * Sets the value of the booleanVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanVariable(String value) {
        this.booleanVariable = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the lookupOnChange property.
     * 
     * @return
     *     possible object is
     *     {@link LookupOnChange }
     *     
     */
    public LookupOnChange getLookupOnChange() {
        return lookupOnChange;
    }

    /**
     * Sets the value of the lookupOnChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupOnChange }
     *     
     */
    public void setLookupOnChange(LookupOnChange value) {
        this.lookupOnChange = value;
    }

    /**
     * Gets the value of the lookupNow property.
     * 
     * @return
     *     possible object is
     *     {@link LookupNow }
     *     
     */
    public LookupNow getLookupNow() {
        return lookupNow;
    }

    /**
     * Sets the value of the lookupNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupNow }
     *     
     */
    public void setLookupNow(LookupNow value) {
        this.lookupNow = value;
    }

    /**
     * Gets the value of the arrayElement property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayElement }
     *     
     */
    public ArrayElement getArrayElement() {
        return arrayElement;
    }

    /**
     * Sets the value of the arrayElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayElement }
     *     
     */
    public void setArrayElement(ArrayElement value) {
        this.arrayElement = value;
    }


    
    
}
