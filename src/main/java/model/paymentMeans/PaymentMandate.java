package model.paymentMeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentMandate
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "PayerFinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private PayerFinancialAccount payerFinancialAccount;

    public PaymentMandate()
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

    public PayerFinancialAccount getPayerFinancialAccount()
    {
        return payerFinancialAccount;
    }

    public void setPayerFinancialAccount(PayerFinancialAccount payerFinancialAccount)
    {
        this.payerFinancialAccount = payerFinancialAccount;
    }

    @Override
    public String toString()
    {
        return "PaymentMandate{id='" + id + "', payerFinancialAccount=" + payerFinancialAccount + "}";
    }
}
