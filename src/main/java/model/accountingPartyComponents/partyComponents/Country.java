package model.accountingPartyComponents.partyComponents;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Country
{
    @XmlElement(name = "IdentificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String identificationCode;

    public Country()
    {
    }

    public Country(String identificationCode)
    {
        this.identificationCode = identificationCode;
    }

    public String getIdentificationCode()
    {
        return identificationCode;
    }


    @Override
    public String toString()
    {
        return "Country{identificationCode='" + identificationCode + "'}";
    }
}