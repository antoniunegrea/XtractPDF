package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ChargeTotalAmount
{
    @XmlElement(name = "ChargeTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double chargeTotalAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public ChargeTotalAmount()
    {
    }

    public double getChargeTotalAmount()
    {
        return chargeTotalAmount;
    }

    public void setChargeTotalAmount(double chargeTotalAmount)
    {
        this.chargeTotalAmount = chargeTotalAmount;
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
        return "ChargeTotalAmount{" +
                "chargeTotalAmount=" + chargeTotalAmount +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
