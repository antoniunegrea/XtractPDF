package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PayableAmount
{
    @XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double payableAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public PayableAmount()
    {
    }

    public double getPayableAmount()
    {
        return payableAmount;
    }

    public void setPayableAmount(double payableAmount)
    {
        this.payableAmount = payableAmount;
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
        return "PayableAmount{" +
                "payableAmount=" + payableAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }

}
