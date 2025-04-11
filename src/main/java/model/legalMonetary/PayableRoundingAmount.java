package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PayableRoundingAmount
{
    @XmlElement(name = "PayableRoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double payableRoundingAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public PayableRoundingAmount()
    {
    }

    public double getPayableRoundingAmount()
    {
        return payableRoundingAmount;
    }

    public void setPayableRoundingAmount(double payableRoundingAmount)
    {
        this.payableRoundingAmount = payableRoundingAmount;
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
        return "PayableRoundingAmount{" +
                "payableRoundingAmount=" + payableRoundingAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
