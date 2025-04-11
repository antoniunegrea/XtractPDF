package model.paymentMeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentMeans
{
    @XmlElement(name = "PaymentMeansCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String paymentMeansCode;

    @XmlElement(name = "PaymentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String paymentID;

    @XmlElement(name = "CardAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private CardAccount cardAccount;

    @XmlElement(name = "PayeeFinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private PayeeFinancialAccount payeeFinancialAccount;

    @XmlElement(name = "PaymentMandate", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private PaymentMandate paymentMandate;

    public PaymentMeans()
    {
    }

    public String getPaymentMeansCode()
    {
        return paymentMeansCode;
    }

    public void setPaymentMeansCode(String paymentMeansCode)
    {
        this.paymentMeansCode = paymentMeansCode;
    }

    public String getPaymentID()
    {
        return paymentID;
    }

    public void setPaymentID(String paymentID)
    {
        this.paymentID = paymentID;
    }

    public CardAccount getCardAccount()
    {
        return cardAccount;
    }

    public void setCardAccount(CardAccount cardAccount)
    {
        this.cardAccount = cardAccount;
    }

    public PayeeFinancialAccount getPayeeFinancialAccount()
    {
        return payeeFinancialAccount;
    }

    public void setPayeeFinancialAccount(PayeeFinancialAccount payeeFinancialAccount)
    {
        this.payeeFinancialAccount = payeeFinancialAccount;
    }

    public PaymentMandate getPaymentMandate()
    {
        return paymentMandate;
    }

    public void setPaymentMandate(PaymentMandate paymentMandate)
    {
        this.paymentMandate = paymentMandate;
    }

    @Override
    public String toString()
    {
        return "PaymentMeans{" +
                "paymentMeansCode='" + paymentMeansCode + '\'' +
                ", paymentID='" + paymentID + '\'' +
                ", cardAccount=" + cardAccount +
                ", payeeFinancialAccount=" + payeeFinancialAccount +
                ", paymentMandate=" + paymentMandate +
                '}';
    }


}
