package model.delivery;

import model.parties.partyComponents.PartyName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DeliveryParty
{
    @XmlElement(name = "PartyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private PartyName partyName;

    public DeliveryParty()
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

    @Override
    public String toString()
    {
        return "DeliveryParty{" +
                "partyName=" + partyName +
                '}';
    }
}
