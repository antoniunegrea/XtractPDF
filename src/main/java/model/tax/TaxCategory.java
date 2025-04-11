package model.tax;

import model.parties.partyComponents.TaxScheme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxCategory
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String percent;

    @XmlElement(name = "TaxExemptionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String taxExemptionReasonCode;

    @XmlElement(name = "TaxExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String taxExemptionReason;

    @XmlElement(name = "TaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private TaxScheme taxScheme;

    public TaxCategory()
    {
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPercent()
    {
        return percent;
    }

    public void setPercent(String percent)
    {
        this.percent = percent;
    }

    public TaxScheme getTaxScheme()
    {
        return taxScheme;
    }

    public void setTaxScheme(TaxScheme taxScheme)
    {
        this.taxScheme = taxScheme;
    }

    public String getTaxExemptionReasonCode()
    {
        return taxExemptionReasonCode;
    }

    public void setTaxExemptionReasonCode(String taxExemptionReasonCode)
    {
        this.taxExemptionReasonCode = taxExemptionReasonCode;
    }

    public String getTaxExemptionReason()
    {
        return taxExemptionReason;
    }

    public void setTaxExemptionReason(String taxExemptionReason)
    {
        this.taxExemptionReason = taxExemptionReason;
    }

    @Override
    public String toString()
    {
        return "TaxCategory{" +
                "id='" + id + '\'' +
                ", percent='" + percent + '\'' +
                ", taxExemptionReasonCode='" + taxExemptionReasonCode + '\'' +
                ", taxExemptionReason='" + taxExemptionReason + '\'' +
                ", taxScheme=" + taxScheme +
                '}';
    }
}
