package model.legalMonetary.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PriceAmount
{
    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents" +
            "-2")
    private String priceAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public PriceAmount()
    {
    }

    public PriceAmount(String priceAmount, String currencyID)
    {
        this.priceAmount = priceAmount;
        this.currencyID = currencyID;
    }

    public String getPriceAmount()
    {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount)
    {
        this.priceAmount = priceAmount;
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
        return "PriceAmount{" +
                "priceAmount='" + priceAmount + '\'' +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
