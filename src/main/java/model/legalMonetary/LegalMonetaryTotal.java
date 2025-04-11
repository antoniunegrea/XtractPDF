package model.legalMonetary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class LegalMonetaryTotal
{
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private LineExtensionAmount lineExtensionAmount;

    @XmlElement(name = "TaxExclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private TaxExclusiveAmount taxExclusiveAmount;

    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private TaxInclusiveAmount taxInclusiveAmount;

    @XmlElement(name = "AllowanceTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private AllowanceTotalAmount allowanceTotalAmount;

    @XmlElement(name = "ChargeTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private ChargeTotalAmount chargeTotalAmount;

    @XmlElement(name = "PrepaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private PrepaidAmount prepaidAmount;

    @XmlElement(name = "PayableRoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private PayableRoundingAmount payableRoundingAmount;

    @XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private PayableAmount payableAmount;

    public LegalMonetaryTotal()
    {
    }

    public LineExtensionAmount getLineExtensionAmount()
    {
        return lineExtensionAmount;
    }

    public void setLineExtensionAmount(LineExtensionAmount lineExtensionAmount)
    {
        this.lineExtensionAmount = lineExtensionAmount;
    }

    public TaxExclusiveAmount getTaxExclusiveAmount()
    {
        return taxExclusiveAmount;
    }

    public void setTaxExclusiveAmount(TaxExclusiveAmount taxExclusiveAmount)
    {
        this.taxExclusiveAmount = taxExclusiveAmount;
    }

    public TaxInclusiveAmount getTaxInclusiveAmount()
    {
        return taxInclusiveAmount;
    }

    public void setTaxInclusiveAmount(TaxInclusiveAmount taxInclusiveAmount)
    {
        this.taxInclusiveAmount = taxInclusiveAmount;
    }

    public AllowanceTotalAmount getAllowanceTotalAmount()
    {
        return allowanceTotalAmount;
    }

    public void setAllowanceTotalAmount(AllowanceTotalAmount allowanceTotalAmount)
    {
        this.allowanceTotalAmount = allowanceTotalAmount;
    }

    public ChargeTotalAmount getChargeTotalAmount()
    {
        return chargeTotalAmount;
    }

    public void setChargeTotalAmount(ChargeTotalAmount chargeTotalAmount)
    {
        this.chargeTotalAmount = chargeTotalAmount;
    }

    public PrepaidAmount getPrepaidAmount()
    {
        return prepaidAmount;
    }

    public void setPrepaidAmount(PrepaidAmount prepaidAmount)
    {
        this.prepaidAmount = prepaidAmount;
    }

    public PayableRoundingAmount getPayableRoundingAmount()
    {
        return payableRoundingAmount;
    }

    public void setPayableRoundingAmount(PayableRoundingAmount payableRoundingAmount)
    {
        this.payableRoundingAmount = payableRoundingAmount;
    }

    public PayableAmount getPayableAmount()
    {
        return payableAmount;
    }

    public void setPayableAmount(PayableAmount payableAmount)
    {
        this.payableAmount = payableAmount;
    }

    @Override
    public String toString()
    {
        return "LegalMonetaryTotal{" +
                "lineExtensionAmount='" + lineExtensionAmount + '\'' +
                ", taxExclusiveAmount='" + taxExclusiveAmount + '\'' +
                ", taxInclusiveAmount='" + taxInclusiveAmount + '\'' +
                ", allowanceTotalAmount='" + allowanceTotalAmount + '\'' +
                ", chargeTotalAmount='" + chargeTotalAmount + '\'' +
                ", prepaidAmount='" + prepaidAmount + '\'' +
                ", payableRoundingAmount='" + payableRoundingAmount + '\'' +
                ", payableAmount='" + payableAmount + '\'' +
                '}';
    }
}
