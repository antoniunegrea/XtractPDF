package model.parties.partyComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PartyTaxScheme
{
    @XmlElement(name = "RegistrationName", namespace =
            "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String registrationName;

    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String companyID;

    @XmlElement(name = "TaxScheme", namespace =
            "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    private TaxScheme taxScheme;

    public PartyTaxScheme()
    {
    }

    public PartyTaxScheme(String registrationName, String companyID, TaxScheme taxScheme)
    {
        this.registrationName = registrationName;
        this.companyID = companyID;
        this.taxScheme = taxScheme;
    }

    public String getRegistrationName()
    {
        return registrationName;
    }

    public String getCompanyID()
    {
        return companyID;
    }


    public TaxScheme getTaxScheme()
    {
        return taxScheme;
    }


    @Override
    public String toString()
    {
        return "PartyTaxScheme{companyID='" + companyID + "', taxScheme=" + taxScheme + "}";
    }
}