package model.accountingPartyComponents.partyComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PostalAddress
{
    @XmlElement(name = "StreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String streetName;

    @XmlElement(name = "CityName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String cityName;

    @XmlElement(name = "CountrySubEntity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String countrySubEntity;

    @XmlElement(name = "Country", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents" +
            "-2")
    private Country country;

    public PostalAddress()
    {
    }

    public PostalAddress(String streetName, String cityName, String countrySubEntity, Country country)
    {
        this.streetName = streetName;
        this.cityName = cityName;
        this.countrySubEntity = countrySubEntity;
        this.country = country;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getCityName()
    {
        return cityName;
    }

    public String getCountrySubEntity()
    {
        return countrySubEntity;
    }

    public Country getCountry()
    {
        return country;
    }

    @Override
    public String toString()
    {
        return "PostalAddress{" +
                "streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", countrySubEntity='" + countrySubEntity + '\'' +
                ", country=" + country +
                '}';
    }
}
