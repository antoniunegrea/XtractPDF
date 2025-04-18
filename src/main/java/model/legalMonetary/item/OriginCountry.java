package model.legalMonetary.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OriginCountry
{
    @XmlElement(name = "IdentificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String identificationCode;

    public OriginCountry()
    {
    }

    public OriginCountry(String identificationCode)
    {
        this.identificationCode = identificationCode;
    }

    public String getIdentificationCode()
    {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode)
    {
        this.identificationCode = identificationCode;
    }

    @Override
    public String toString()
    {
        return "OriginCountry{" +
                "identificationCode='" + identificationCode + '\'' +
                '}';
    }
}
