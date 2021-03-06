//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="memberType" type="{http://www.onem2m.org/xml/protocols}memberType"/>
 *         &lt;element name="currentNrOfMembers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="maxNrOfMembers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="memberIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;element name="membersAccessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="memberTypeValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="consistencyStrategy" type="{http://www.onem2m.org/xml/protocols}consistencyStrategy" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fanOutPoint" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creator",
    "memberType",
    "currentNrOfMembers",
    "maxNrOfMembers",
    "memberIDs",
    "membersAccessControlPolicyIDs",
    "memberTypeValidated",
    "consistencyStrategy",
    "groupName",
    "fanOutPoint",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "group")
@XmlRootElement(name = "grp")
public class Group
    extends AnnounceableResource
{
	
//	public final static String SCHEMA_LOCATION = "CDT-group-v1_2_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-group-v1_6_0.xsd";
	
	public static final String FANOUTPOINT_SHORTNAME = "fopt";

	@XmlElement(name = "cr")
    protected String creator;
    //@XmlElement(required = true)
	@XmlElement(name = "mt")
    protected Integer memberType;
    //@XmlElement(required = true)
	@XmlElement(name = "cnm")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer currentNrOfMembers;
    //@XmlElement(required = true)
	@XmlElement(name = "mnm")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer maxNrOfMembers;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = "mid")
    protected List<String> memberIDs;
    @XmlList
    @XmlElement(name = "macp")
    protected List<String> membersAccessControlPolicyIDs;
    @XmlElement(name = "mtv")
//    protected boolean memberTypeValidated;
    protected Boolean memberTypeValidated;
    @XmlElement(name = "csy")
    protected Integer consistencyStrategy;
    @XmlElement(name = "gn")
    protected String groupName;
    //@XmlElement(required = true)
    @XmlElement(name = "fopt")
    @XmlSchemaType(name = "anyURI")
    protected String fanOutPoint;
    @XmlElement(name = "ch")
    protected List<ChildResourceRef> childResource;
    @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the memberType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberType() {
        return memberType;
    }

    /**
     * Sets the value of the memberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberType(Integer value) {
        this.memberType = value;
    }

    /**
     * Gets the value of the currentNrOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNrOfMembers() {
        return currentNrOfMembers;
    }

    /**
     * Sets the value of the currentNrOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNrOfMembers(Integer value) {
        this.currentNrOfMembers = value;
    }

    /**
     * Gets the value of the maxNrOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNrOfMembers() {
        return maxNrOfMembers;
    }

    /**
     * Sets the value of the maxNrOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNrOfMembers(Integer value) {
        this.maxNrOfMembers = value;
    }

    /**
     * Gets the value of the memberIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMemberIDs() {
//    	if (memberIDs == null) {
//    		memberIDs = new ArrayList<String>();
//    	}
    	return this.memberIDs;
    }

    public void addMemberIDs(String mid) {
    	if (memberIDs == null) {
    		memberIDs = new ArrayList<String>();
    	}
    	this.memberIDs.add(mid);
    }
    
    /**
     * Gets the value of the membersAccessControlPolicyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membersAccessControlPolicyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembersAccessControlPolicyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMembersAccessControlPolicyIDs() {
//    	if (membersAccessControlPolicyIDs == null) {
//    		membersAccessControlPolicyIDs = new ArrayList<String>();
//    	}
    	return this.membersAccessControlPolicyIDs;
    }
    
    public void addMembersAccessControlPolicyIDs(String macp) {
    	if (membersAccessControlPolicyIDs == null) {
    		membersAccessControlPolicyIDs = new ArrayList<String>();
    	}
    	this.membersAccessControlPolicyIDs.add(macp);
    }

    /**
     * Gets the value of the memberTypeValidated property.
     * 
     */
    public Boolean isMemberTypeValidated() {
        return memberTypeValidated;
    }

    /**
     * Sets the value of the memberTypeValidated property.
     * 
     */
    public void setMemberTypeValidated(Boolean value) {
        this.memberTypeValidated = value;
    }

    /**
     * Gets the value of the consistencyStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsistencyStrategy() {
        return consistencyStrategy;
    }

    /**
     * Sets the value of the consistencyStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsistencyStrategy(Integer value) {
        this.consistencyStrategy = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the fanOutPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanOutPoint() {
        return fanOutPoint;
    }

    /**
     * Sets the value of the fanOutPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanOutPoint(String value) {
        this.fanOutPoint = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//    	}
    	return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(ch);
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
//    	if (subscription == null) {
//    		subscription = new ArrayList<Subscription>();
//    	}
    	return this.subscription;
    }
    
    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
    	}
    	this.subscription.add(sub);
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.creator != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'creator' is NP on CREATE operation");
			}
			if (this.currentNrOfMembers != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentNrOfMembers' is NP on CREATE operation");
			}
			if (this.memberTypeValidated != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'memberTypeValidated' is NP on CREATE operation");
			}
//			if (this.memberType == null) {  /2016.05.10
//				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'memberType' is M on CREATE operation");
//			}
			if (this.maxNrOfMembers == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'maxNrOfMembers' is M on CREATE operation");
			}
			if (this.memberIDs == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'memberIDs' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.creator != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'creator' is NP on CREATE operation");
			}
			if (this.currentNrOfMembers != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'currentNrOfMembers' is NP on CREATE operation");
			}
			if (this.memberTypeValidated != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'memberTypeValidated' is NP on CREATE operation");
			}
			if (this.consistencyStrategy != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'consistencyStrategy' is NP on CREATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}

}
