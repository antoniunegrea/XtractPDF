package model.accountingPartyComponents;

import model.accountingPartyComponents.partyComponents.*;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Party
{
    @XmlElement(name = "EndpointID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String endpointID;

    @XmlElement(name = "PartyIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyIdentification partyIdentification;

    @XmlElement(name = "PartyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyName partyName;

    @XmlElement(name = "PostalAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PostalAddress postalAddress;

    @XmlElement(name = "PartyTaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyTaxScheme partyTaxScheme;

    @XmlElement(name = "PartyLegalEntity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyLegalEntity partyLegalEntity;

    @XmlElement(name = "Contact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents" +
            "-2")
    private Contact contact;

    public Party()
    {
    }


    public String getEndpointID()
    {
        return endpointID;
    }

    public void setEndpointID(String endpointID)
    {
        this.endpointID = endpointID;
    }

    public PartyIdentification getPartyIdentification()
    {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification)
    {
        this.partyIdentification = partyIdentification;
    }

    public PostalAddress getPostalAddress()
    {
        return postalAddress;
    }

    public PartyName getPartyName()
    {
        return partyName;
    }

    public void setPartyName(PartyName partyName)
    {
        this.partyName = partyName;
    }

    public void setPostalAddress(PostalAddress postalAddress)
    {
        this.postalAddress = postalAddress;
    }

    public PartyTaxScheme getPartyTaxScheme()
    {
        return partyTaxScheme;
    }

    public void setPartyTaxScheme(PartyTaxScheme partyTaxScheme)
    {
        this.partyTaxScheme = partyTaxScheme;
    }

    public PartyLegalEntity getPartyLegalEntity()
    {
        return partyLegalEntity;
    }

    public void setPartyLegalEntity(PartyLegalEntity partyLegalEntity)
    {
        this.partyLegalEntity = partyLegalEntity;
    }

    public Contact getContact()
    {
        return contact;
    }

    public void setContact(Contact contact)
    {
        this.contact = contact;
    }

    @Override
    public String toString()
    {
        return "Party{" +
                "endpointID='" + endpointID + '\'' +
                ", partyIdentification=" + partyIdentification +
                ", partyName=" + partyName +
                ", postalAddress=" + postalAddress +
                ", partyTaxScheme=" + partyTaxScheme +
                ", partyLegalEntity=" + partyLegalEntity +
                ", contact=" + contact +
                '}';
    }
}
