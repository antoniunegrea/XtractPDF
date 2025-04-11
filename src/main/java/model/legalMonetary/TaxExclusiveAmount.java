package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxExclusiveAmount
{
    @XmlElement(name = "TaxExclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double taxExclusiveAmount;

    @XmlAttribute(name = "currencyID")

    private String currencyID;

    public TaxExclusiveAmount()
    {
    }

    public double getTaxExclusiveAmount()
    {
        return taxExclusiveAmount;
    }

    public void setTaxExclusiveAmount(double taxExclusiveAmount)
    {
        this.taxExclusiveAmount = taxExclusiveAmount;
    }

    public String getCurrencyID()
    {
        return currencyID;
    }

    public void setCurrencyID(String currencyID)
    {
        this.currencyID = currencyID;
    }

    @Override
    public String toString()
    {
        return "TaxExclusiveAmount{" +
                "taxExclusiveAmount=" + taxExclusiveAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
