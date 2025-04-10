package model.accountingPartyComponents.partyComponents;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PartyLegalEntity
{
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String registrationName;

    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String companyID;

    public PartyLegalEntity()
    {
    }

    public PartyLegalEntity(String registrationName, String companyID)
    {
        this.registrationName = registrationName;
        this.companyID = companyID;
    }

    public String getRegistrationName()
    {
        return registrationName;
    }


    public String getCompanyID()
    {
        return companyID;
    }


    @Override
    public String toString()
    {
        return "PartyLegalEntity{registrationName='" + registrationName + "', companyID='" + companyID + "'}";
    }
}
