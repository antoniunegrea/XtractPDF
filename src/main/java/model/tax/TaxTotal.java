package model.tax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxTotal
{
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private double taxAmount;
    
    @XmlElement(name = "TaxSubtotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<TaxSubtotal> taxSubtotal;

    public TaxTotal()
    {
    }

    public double getTaxAmount()
    {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    public List<TaxSubtotal> getTaxSubtotal()
    {
        return taxSubtotal;
    }

    public void setTaxSubtotal(List<TaxSubtotal> taxSubtotal)
    {
        this.taxSubtotal = taxSubtotal;
    }

    @Override
    public String toString()
    {
        return "TaxTotal{" +
                "taxAmount=" + taxAmount +
                ", taxSubtotal=" + taxSubtotal +
                '}';
    }
}
