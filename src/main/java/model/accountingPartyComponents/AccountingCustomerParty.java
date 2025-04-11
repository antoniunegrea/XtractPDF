package model.accountingPartyComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AccountingCustomerParty
{
    @XmlElement(name = "Party", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    private Party party;

    public AccountingCustomerParty()
    {
    }

    public Party getParty()
    {
        return party;
    }

    public void setParty(Party party)
    {
        this.party = party;
    }

    @Override
    public String toString()
    {
        return "AccountingCustomerParty{party=" + party + "}";
    }
}
