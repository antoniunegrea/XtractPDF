package model.parties.partyComponents;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PartyLegalEntity
{
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String registrationName;

    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String companyID;

    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String companyLegalForm;

    public PartyLegalEntity()
    {
    }


    public String getRegistrationName()
    {
        return registrationName;
    }


    public String getCompanyID()
    {
        return companyID;
    }

    public String getCompanyLegalForm()
    {
        return companyLegalForm;
    }

    @Override
    public String toString()
    {
        return "PartyLegalEntity{" +
                "registrationName='" + registrationName + '\'' +
                ", companyID='" + companyID + '\'' +
                ", companyLegalForm='" + companyLegalForm + '\'' +
                '}';
    }
}
