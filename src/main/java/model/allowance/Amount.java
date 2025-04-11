package model.Allowance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Amount
{
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String amount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public Amount()
    {
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
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
        return "Amount{" +
                "amount='" + amount + '\'' +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
