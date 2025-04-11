package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PrepaidAmount
{
    @XmlElement(name = "PrepaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double prepaidAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public PrepaidAmount()
    {
    }

    public double getPrepaidAmount()
    {
        return prepaidAmount;
    }

    public void setPrepaidAmount(double prepaidAmount)
    {
        this.prepaidAmount = prepaidAmount;
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
        return "PrepaidAmount{" +
                "prepaidAmount=" + prepaidAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
