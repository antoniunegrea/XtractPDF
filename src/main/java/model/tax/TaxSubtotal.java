package model.tax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxSubtotal
{
    @XmlElement(name = "TaxableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private TaxableAmount taxableAmount;

    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private TaxAmount taxAmount;

    @XmlElement(name = "TaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private TaxCategory taxCategory;

    public TaxSubtotal()
    {
    }

    public TaxableAmount getTaxableAmount()
    {
        return taxableAmount;
    }

    public void setTaxableAmount(TaxableAmount taxableAmount)
    {
        this.taxableAmount = taxableAmount;
    }

    public TaxAmount getTaxAmount()
    {
        return taxAmount;
    }

    public void setTaxAmount(TaxAmount taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    public TaxCategory getTaxCategory()
    {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory)
    {
        this.taxCategory = taxCategory;
    }

    @Override
    public String toString()
    {
        return "TaxSubtotal{" +
                "taxableAmount=" + taxableAmount +
                ", taxAmount=" + taxAmount +
                ", taxCategory=" + taxCategory +
                '}';
    }
}
