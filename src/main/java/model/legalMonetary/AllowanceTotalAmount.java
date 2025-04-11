package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AllowanceTotalAmount
{
    @XmlElement(name = "AllowanceTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double allowanceTotalAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public AllowanceTotalAmount()
    {
    }

    public double getAllowanceTotalAmount()
    {
        return allowanceTotalAmount;
    }

    public void setAllowanceTotalAmount(double allowanceTotalAmount)
    {
        this.allowanceTotalAmount = allowanceTotalAmount;
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
        return "AllowanceTotalAmount{" +
                "allowanceTotalAmount=" + allowanceTotalAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
