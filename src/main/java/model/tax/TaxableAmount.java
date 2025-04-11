package model.tax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxableAmount
{
    @XmlElement(name = "TaxableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double taxableAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public TaxableAmount()
    {
    }

    public double getTaxableAmount()
    {
        return taxableAmount;
    }

    public void setTaxableAmount(double taxableAmount)
    {
        this.taxableAmount = taxableAmount;
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
        return "TaxableAmount{" +
                "taxableAmount=" + taxableAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
