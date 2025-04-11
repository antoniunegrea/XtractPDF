package model.delivery;

import model.parties.partyComponents.AddressLine;
import model.parties.partyComponents.Country;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Address
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

    public Address()
    {
    }

    public Address(String streetName, String additionalStreetName, String cityName, String postalZone,
            String countrySubEntity, AddressLine addressLine, Country country)
    {
        this.streetName = streetName;
        this.additionalStreetName = additionalStreetName;
        this.cityName = cityName;
        this.postalZone = postalZone;
        this.countrySubEntity = countrySubEntity;
        this.addressLine = addressLine;
        this.country = country;
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
        return "Address{" +
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
