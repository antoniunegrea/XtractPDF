package model.parties;

import model.parties.partyComponents.PartyIdentification;
import model.parties.partyComponents.PartyLegalEntity;
import model.parties.partyComponents.PartyName;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PayeeParty
{
    @XmlElement(name = "PartyIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyIdentification partyIdentification;

    @XmlElement(name = "PartyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyName partyName;

    @XmlElement(name = "PartyLegalEntity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PartyLegalEntity partyLegalEntity;

    public PayeeParty()
    {
    }

    public PartyIdentification getPartyIdentification()
    {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification)
    {
        this.partyIdentification = partyIdentification;
    }

    public PartyName getPartyName()
    {
        return partyName;
    }

    public void setPartyName(PartyName partyName)
    {
        this.partyName = partyName;
    }

    public PartyLegalEntity getPartyLegalEntity()
    {
        return partyLegalEntity;
    }

    public void setPartyLegalEntity(PartyLegalEntity partyLegalEntity)
    {
        this.partyLegalEntity = partyLegalEntity;
    }

    @Override
    public String toString()
    {
        return "PayeeParty{" +
                "partyIdentification=" + partyIdentification +
                ", partyName=" + partyName +
                ", partyLegalEntity=" + partyLegalEntity +
                '}';
    }
}
