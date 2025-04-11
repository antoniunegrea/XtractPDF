package model.Allowance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BaseAmount
{
    @XmlElement(name = "BaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String baseAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public BaseAmount()
    {
    }

    public String getBaseAmount()
    {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount)
    {
        this.baseAmount = baseAmount;
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
        return "BaseAmount{" +
                "baseAmount='" + baseAmount + '\'' +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
