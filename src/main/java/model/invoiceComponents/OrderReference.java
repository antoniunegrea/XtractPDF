package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderReference
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "SalesOrderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String salesOrderID;

    public OrderReference()
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

    public String getSalesOrderID()
    {
        return salesOrderID;
    }

    public void setSalesOrderID(String salesOrderID)
    {
        this.salesOrderID = salesOrderID;
    }

    @Override
    public String toString()
    {
        return "OrderReference{" +
                "id='" + id + '\'' +
                ", salesOrderID='" + salesOrderID + '\'' +
                '}';
    }
}
