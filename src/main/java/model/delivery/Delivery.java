package model.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Delivery
{
    @XmlElement(name = "ActualDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String actualDeliveryDate;

    @XmlElement(name = "DeliveryLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private DeliveryLocation deliveryLocation;

    @XmlElement(name = "DeliveryParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private DeliveryParty deliveryParty;

    public Delivery()
    {
    }

    public String getActualDeliveryDate()
    {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(String actualDeliveryDate)
    {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public DeliveryLocation getDeliveryLocation()
    {
        return deliveryLocation;
    }

    public void setDeliveryLocation(DeliveryLocation deliveryLocation)
    {
        this.deliveryLocation = deliveryLocation;
    }

    public DeliveryParty getDeliveryParty()
    {
        return deliveryParty;
    }

    public void setDeliveryParty(DeliveryParty deliveryParty)
    {
        this.deliveryParty = deliveryParty;
    }

    @Override
    public String toString()
    {
        return "Delivery{" +
                "actualDeliveryDate='" + actualDeliveryDate + '\'' +
                ", deliveryLocation=" + deliveryLocation +
                ", deliveryParty=" + deliveryParty +
                '}';
    }
}
