package model.legalMonetary.item;

import model.Allowance.AllowanceCharge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Price
{
    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents" +
            "-2")
    private PriceAmount priceAmount;

    @XmlElement(name = "BaseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private BaseQuantity baseQuantity;

    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private AllowanceCharge allowanceCharge;

    public Price()
    {
    }

    public PriceAmount getPriceAmount()
    {
        return priceAmount;
    }

    public void setPriceAmount(PriceAmount priceAmount)
    {
        this.priceAmount = priceAmount;
    }

    public BaseQuantity getBaseQuantity()
    {
        return baseQuantity;
    }

    public void setBaseQuantity(BaseQuantity baseQuantity)
    {
        this.baseQuantity = baseQuantity;
    }

    public AllowanceCharge getAllowanceCharge()
    {
        return allowanceCharge;
    }

    public void setAllowanceCharge(AllowanceCharge allowanceCharge)
    {
        this.allowanceCharge = allowanceCharge;
    }

    @Override
    public String toString()
    {
        return "Price{" +
                "priceAmount='" + priceAmount + '\'' +
                ", baseQuantity='" + baseQuantity + '\'' +
                ", allowanceCharge=" + allowanceCharge +
                '}';
    }

}
