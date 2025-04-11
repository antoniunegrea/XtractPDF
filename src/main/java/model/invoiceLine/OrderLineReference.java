package model.invoiceLine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderLineReference
{
    @XmlElement(name = "LineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String lineID;

    public OrderLineReference()
    {
    }


    public String getLineID()
    {
        return lineID;
    }

    public void setLineID(String lineID)
    {
        this.lineID = lineID;
    }

    @Override
    public String toString()
    {
        return "OrderLineReference{" +
                "lineID='" + lineID + '\'' +
                '}';
    }

}
