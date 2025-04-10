package model.accountingPartyComponents.partyComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class TaxScheme
{

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "TaxTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents" +
            "-2")
    private String taxTypeCode;

    public TaxScheme()
    {
    }

    public TaxScheme(String id, String taxTypeCode)
    {
        this.id = id;
        this.taxTypeCode = taxTypeCode;
    }

    public String getId()
    {
        return id;
    }

    public String getTaxTypeCode()
    {
        return taxTypeCode;
    }

    @Override
    public String toString()
    {
        return "TaxScheme{id='" + id + "', taxTypeCode='" + taxTypeCode + "'}";
    }
}
