package model.invoiceLine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoicedQuantity
{
    @XmlElement(name = "InvoicedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String invoicedQuantity;

    @XmlAttribute(name = "unitCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String unitCode;

    public InvoicedQuantity()
    {
    }

    public String getInvoicedQuantity()
    {
        return invoicedQuantity;
    }

    public void setInvoicedQuantity(String invoicedQuantity)
    {
        this.invoicedQuantity = invoicedQuantity;
    }

    public String getUnitCode()
    {
        return unitCode;
    }

    public void setUnitCode(String unitCode)
    {
        this.unitCode = unitCode;
    }

    @Override
    public String toString()
    {
        return "InvoicedQuantity{invoicedQuantity='" + invoicedQuantity + "', unitCode='" + unitCode + "'}";
    }
}
