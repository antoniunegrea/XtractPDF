package model.parties.partyComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PostalAddress
{
    @XmlElement(name = "StreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String streetName;

    @XmlElement(name = "AdditionalStreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String additionalStreetName;

    @XmlElement(name = "CityName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String cityName;

    @XmlElement(name = "PostalZone", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String postalZone;

    @XmlElement(name = "CountrySubEntity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String countrySubEntity;

    @XmlElement(name = "AddressLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents" +
            "-2")
    private AddressLine addressLine;

    @XmlElement(name = "Country", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents" +
            "-2")
    private Country country;

    public PostalAddress()
    {
    }


    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getAdditionalStreetName()
    {
        return additionalStreetName;
    }

    public void setAdditionalStreetName(String additionalStreetName)
    {
        this.additionalStreetName = additionalStreetName;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getPostalZone()
    {
        return postalZone;
    }

    public void setPostalZone(String postalZone)
    {
        this.postalZone = postalZone;
    }

    public String getCountrySubEntity()
    {
        return countrySubEntity;
    }

    public void setCountrySubEntity(String countrySubEntity)
    {
        this.countrySubEntity = countrySubEntity;
    }

    public AddressLine getAddressLine()
    {
        return addressLine;
    }

    public void setAddressLine(AddressLine addressLine)
    {
        this.addressLine = addressLine;
    }

    public Country getCountry()
    {
        return country;
    }

    public void setCountry(Country country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "PostalAddress{" +
                "streetName='" + streetName + '\'' +
                ", additionalStreetName='" + additionalStreetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", postalZone='" + postalZone + '\'' +
                ", countrySubEntity='" + countrySubEntity + '\'' +
                ", addressLine=" + addressLine +
                ", country=" + country +
                '}';
    }

}
