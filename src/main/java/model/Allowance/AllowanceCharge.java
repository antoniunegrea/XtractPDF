package model.Allowance;

import model.tax.TaxCategory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AllowanceCharge
{
    @XmlElement(name = "ChargeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private boolean chargeIndicator;

    @XmlElement(name = "AllowanceChargeReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String allowanceChargeReasonCode;

    @XmlElement(name = "AllowanceChargeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String allowanceChargeReason;

    @XmlElement(name = "MultiplierFactorNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private double multiplierFactorNumeric;

    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private Amount amount;

    @XmlElement(name = "BaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private BaseAmount baseAmount;

    @XmlElement(name = "TaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents" +
            "-2")
    private TaxCategory taxCategory;

    public AllowanceCharge()
    {
    }


    public boolean isChargeIndicator()
    {
        return chargeIndicator;
    }

    public void setChargeIndicator(boolean chargeIndicator)
    {
        this.chargeIndicator = chargeIndicator;
    }

    public String getAllowanceChargeReasonCode()
    {
        return allowanceChargeReasonCode;
    }

    public void setAllowanceChargeReasonCode(String allowanceChargeReasonCode)
    {
        this.allowanceChargeReasonCode = allowanceChargeReasonCode;
    }

    public String getAllowanceChargeReason()
    {
        return allowanceChargeReason;
    }

    public void setAllowanceChargeReason(String allowanceChargeReason)
    {
        this.allowanceChargeReason = allowanceChargeReason;
    }

    public double getMultiplierFactorNumeric()
    {
        return multiplierFactorNumeric;
    }

    public void setMultiplierFactorNumeric(double multiplierFactorNumeric)
    {
        this.multiplierFactorNumeric = multiplierFactorNumeric;
    }

    public Amount getAmount()
    {
        return amount;
    }

    public void setAmount(Amount amount)
    {
        this.amount = amount;
    }

    public BaseAmount getBaseAmount()
    {
        return baseAmount;
    }

    public void setBaseAmount(BaseAmount baseAmount)
    {
        this.baseAmount = baseAmount;
    }

    public TaxCategory getTaxCategory()
    {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory)
    {
        this.taxCategory = taxCategory;
    }

    @Override
    public String toString()
    {
        return "AllowanceCharge{" +
                "chargeIndicator=" + chargeIndicator +
                ", allowanceChargeReasonCode='" + allowanceChargeReasonCode + '\'' +
                ", allowanceChargeReason='" + allowanceChargeReason + '\'' +
                ", multiplierFactorNumeric=" + multiplierFactorNumeric +
                ", amount=" + amount +
                ", baseAmount=" + baseAmount +
                ", taxCategory=" + taxCategory +
                '}';
    }

}
