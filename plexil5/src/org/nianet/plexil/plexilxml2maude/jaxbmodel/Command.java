//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ResourceList" minOccurs="0"/>
 *         &lt;group ref="{}DeclaredVariable" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}Name"/>
 *           &lt;element name="CommandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Arguments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resourceList",
    "integerVariable",
    "realVariable",
    "booleanVariable",
    "stringVariable",
    "arrayVariable",
    "arrayElement",
    "name",
    "commandName",
    "arguments"
})
@XmlRootElement(name = "Command")
public class Command {

    @XmlElement(name = "ResourceList")
    protected ResourceList resourceList;
    @XmlElement(name = "IntegerVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String integerVariable;
    @XmlElement(name = "RealVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String realVariable;
    @XmlElement(name = "BooleanVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String booleanVariable;
    @XmlElement(name = "StringVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String stringVariable;
    @XmlElement(name = "ArrayVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String arrayVariable;
    @XmlElement(name = "ArrayElement")
    protected ArrayElement arrayElement;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "CommandName")
    protected String commandName;
    @XmlElement(name = "Arguments")
    protected Arguments arguments;

    /**
     * Gets the value of the resourceList property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceList }
     *     
     */
    public ResourceList getResourceList() {
        return resourceList;
    }

    /**
     * Sets the value of the resourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceList }
     *     
     */
    public void setResourceList(ResourceList value) {
        this.resourceList = value;
    }

    /**
     * Gets the value of the integerVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegerVariable() {
        return integerVariable;
    }

    /**
     * Sets the value of the integerVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegerVariable(String value) {
        this.integerVariable = value;
    }

    /**
     * Gets the value of the realVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealVariable() {
        return realVariable;
    }

    /**
     * Sets the value of the realVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealVariable(String value) {
        this.realVariable = value;
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
     * Gets the value of the stringVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringVariable() {
        return stringVariable;
    }

    /**
     * Sets the value of the stringVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringVariable(String value) {
        this.stringVariable = value;
    }

    /**
     * Gets the value of the arrayVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayVariable() {
        return arrayVariable;
    }

    /**
     * Sets the value of the arrayVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayVariable(String value) {
        this.arrayVariable = value;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the commandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * Sets the value of the commandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandName(String value) {
        this.commandName = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link Arguments }
     *     
     */
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arguments }
     *     
     */
    public void setArguments(Arguments value) {
        this.arguments = value;
    }

    public List<Resource> getResources(){
    	return this.getResourceList().getResource();
    }
    
}