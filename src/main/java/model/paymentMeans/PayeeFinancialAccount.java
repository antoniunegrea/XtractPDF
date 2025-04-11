package model.paymentMeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PayeeFinancialAccount
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String name;
    @XmlElement(name = "FinancialInstitutionBranch", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private FinancialInstitutionBranch financialInstitutionBranch;

    public PayeeFinancialAccount()
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public FinancialInstitutionBranch getFinancialInstitutionBranch()
    {
        return financialInstitutionBranch;
    }

    public void setFinancialInstitutionBranch(FinancialInstitutionBranch financialInstitutionBranch)
    {
        this.financialInstitutionBranch = financialInstitutionBranch;
    }

    @Override
    public String toString()
    {
        return "PayeeFinancialAccount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", financialInstitutionBranch=" + financialInstitutionBranch +
                '}';
    }
}
