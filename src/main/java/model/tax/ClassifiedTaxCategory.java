package model.tax;

import model.parties.partyComponents.TaxScheme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ClassifiedTaxCategory
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String percent;
    @XmlElement(name = "TaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private TaxScheme taxScheme;

    public ClassifiedTaxCategory()
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

    @Override
    public String toString()
    {
        return "ClassifiedTaxCategory{" +
                "id='" + id + '\'' +
                ", percent='" + percent + '\'' +
                ", taxScheme=" + taxScheme +
                '}';
    }
}
