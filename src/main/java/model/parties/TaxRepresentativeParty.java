package model.parties;

import model.parties.partyComponents.PartyName;
import model.parties.partyComponents.PartyTaxScheme;
import model.parties.partyComponents.PostalAddress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxRepresentativeParty
{
    @XmlElement(name = "PartyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyName partyName;

    @XmlElement(name = "PostalAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PostalAddress postalAddress;

    @XmlElement(name = "PartyTaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyTaxScheme partyTaxScheme;

    public TaxRepresentativeParty()
    {
    }

    public PartyName getPartyName()
    {
        return partyName;
    }

    public void setPartyName(PartyName partyName)
    {
        this.partyName = partyName;
    }

    public PostalAddress getPostalAddress()
    {
        return postalAddress;
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

    @Override
    public String toString()
    {
        return "TaxRepresentativeParty{" +
                "partyName=" + partyName +
                ", postalAddress=" + postalAddress +
                ", partyTaxScheme=" + partyTaxScheme +
                '}';
    }
}
