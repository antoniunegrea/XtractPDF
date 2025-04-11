package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class LineExtensionAmount
{
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String lineExtensionAmount;

    @XmlAttribute(name = "currencyID")
    private String currencyID;

    public LineExtensionAmount()
    {
    }

    public String getLineExtensionAmount()
    {
        return lineExtensionAmount;
    }

    public void setLineExtensionAmount(String lineExtensionAmount)
    {
        this.lineExtensionAmount = lineExtensionAmount;
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
        return "LineExtensionAmount{" +
                "lineExtensionAmount='" + lineExtensionAmount + '\'' +
                ", currencyID='" + currencyID + '\'' +
                '}';
    }
}
