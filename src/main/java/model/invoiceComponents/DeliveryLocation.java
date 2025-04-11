package model.invoiceComponents;

import javax.xml.bind.annotation.XmlElement;

public class DeliveryLocation
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "Address", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents" +
            "-2")
    private Address address;

    public DeliveryLocation()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "DeliveryLocation{" +
                "id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
