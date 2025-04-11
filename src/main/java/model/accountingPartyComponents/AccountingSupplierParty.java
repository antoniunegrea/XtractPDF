package model.accountingPartyComponents;

import javax.xml.bind.annotation.*;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AccountingSupplierParty
{
    @XmlElement(name = "Party", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    private Party party;

    public AccountingSupplierParty()
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
        return "AccountingSupplierParty{party=" + party + "}";
    }
}
