package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxInclusiveAmount
{
    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double taxInclusiveAmount;
    @XmlElement(name = "currencyID")
    private String currencyID;

    public TaxInclusiveAmount()
    {
    }

    public double getTaxInclusiveAmount()
    {
        return taxInclusiveAmount;
    }

    public void setTaxInclusiveAmount(double taxInclusiveAmount)
    {
        this.taxInclusiveAmount = taxInclusiveAmount;
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
        return "TaxInclusiveAmount{" +
                "taxInclusiveAmount=" + taxInclusiveAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
