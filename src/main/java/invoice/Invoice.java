package invoice;

import model.Allowance.AllowanceCharge;
import model.delivery.Delivery;
import model.invoiceLine.InvoiceLine;
import model.legalMonetary.LegalMonetaryTotal;
import model.parties.AccountingCustomerParty;
import model.parties.AccountingSupplierParty;
import model.parties.PayeeParty;
import model.parties.TaxRepresentativeParty;
import model.documentReferences.*;
import model.invoiceComponents.BillingReference;
import model.invoiceLine.InvoicePeriod;
import model.invoiceComponents.*;
import model.paymentMeans.PaymentMeans;
import model.paymentTerms.PaymentTerms;
import model.tax.TaxTotal;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Invoice", namespace = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Invoice
{
    @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String ublVersionID;

    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String customizationID;

    @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String profileID;

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String issueDate;

    @XmlElement(name = "DueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String dueDate;

    @XmlElement(name = "InvoiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String invoiceTypeCode;

    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String note;

    @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String taxPointDate;

    @XmlElement(name = "DocumentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String documentCurrencyCode;

    @XmlElement(name = "TaxCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String taxCurrencyCode;

    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String accountingCost;

    @XmlElement(name = "BuyerReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String buyerReference;

    @XmlElement(name = "InvoicePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private InvoicePeriod invoicePeriod;

    @XmlElement(name = "OrderReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private OrderReference orderReference;

    @XmlElement(name = "BillingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<BillingReference> billingReference;

    @XmlElement(name = "DespatchDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private InvoiceDocumentReference despatchDocumentReference;

    @XmlElement(name = "ReceiptDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private DespatchDocumentReference receiptDocumentReference;

    @XmlElement(name = "OriginatorDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private OriginatorDocumentReference originatorDocumentReference;

    @XmlElement(name = "ContractDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private ContractDocumentReference contractDocumentReference;

    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<AdditionalDocumentReference> additionalDocumentReference;

    @XmlElement(name = "ProjectReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private ProjectReference projectReference;

    @XmlElement(name = "AccountingSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private AccountingSupplierParty accountingSupplierParty;

    @XmlElement(name = "AccountingCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private AccountingCustomerParty accountingCustomerParty;

    @XmlElement(name = "PayeeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PayeeParty payeeParty;

    @XmlElement(name = "TaxRepresentativeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private TaxRepresentativeParty taxRepresentativeParty;

    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private Delivery delivery;

    @XmlElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<PaymentMeans> paymentMeans;

    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private PaymentTerms paymentTerms;

    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<AllowanceCharge> allowanceCharge;

    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<TaxTotal> taxTotal;

    @XmlElement(name = "LegalMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private LegalMonetaryTotal legalMonetaryTotal;

    @XmlElement(name = "InvoiceLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<InvoiceLine> invoiceLine;

    public Invoice()
    {
    }

    public String getUblVersionID()
    {
        return ublVersionID;
    }

    public void setUblVersionID(String ublVersionID)
    {
        this.ublVersionID = ublVersionID;
    }

    public String getCustomizationID()
    {
        return customizationID;
    }

    public void setCustomizationID(String customizationID)
    {
        this.customizationID = customizationID;
    }

    public String getProfileID()
    {
        return profileID;
    }

    public void setProfileID(String profileID)
    {
        this.profileID = profileID;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getIssueDate()
    {
        return issueDate;
    }

    public void setIssueDate(String issueDate)
    {
        this.issueDate = issueDate;
    }

    public String getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }

    public String getInvoiceTypeCode()
    {
        return invoiceTypeCode;
    }

    public void setInvoiceTypeCode(String invoiceTypeCode)
    {
        this.invoiceTypeCode = invoiceTypeCode;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }

    public String getTaxPointDate()
    {
        return taxPointDate;
    }

    public void setTaxPointDate(String taxPointDate)
    {
        this.taxPointDate = taxPointDate;
    }

    public String getDocumentCurrencyCode()
    {
        return documentCurrencyCode;
    }

    public void setDocumentCurrencyCode(String documentCurrencyCode)
    {
        this.documentCurrencyCode = documentCurrencyCode;
    }

    public String getTaxCurrencyCode()
    {
        return taxCurrencyCode;
    }

    public void setTaxCurrencyCode(String taxCurrencyCode)
    {
        this.taxCurrencyCode = taxCurrencyCode;
    }


    public String getBuyerReference()
    {
        return buyerReference;
    }

    public void setBuyerReference(String buyerReference)
    {
        this.buyerReference = buyerReference;
    }

    public String getAccountingCost()
    {
        return accountingCost;
    }

    public void setAccountingCost(String accountingCost)
    {
        this.accountingCost = accountingCost;
    }


    public InvoicePeriod getInvoicePeriod()
    {
        return invoicePeriod;
    }

    public void setInvoicePeriod(InvoicePeriod invoicePeriod)
    {
        this.invoicePeriod = invoicePeriod;
    }

    public List<BillingReference> getBillingReference()
    {
        return billingReference;
    }

    public void setBillingReference(List<BillingReference> billingReference)
    {
        this.billingReference = billingReference;
    }

    public OrderReference getOrderReference()
    {
        return orderReference;
    }

    public void setOrderReference(OrderReference orderReference)
    {
        this.orderReference = orderReference;
    }

    public InvoiceDocumentReference getDespatchDocumentReference()
    {
        return despatchDocumentReference;
    }

    public void setDespatchDocumentReference(InvoiceDocumentReference despatchDocumentReference)
    {
        this.despatchDocumentReference = despatchDocumentReference;
    }

    public DespatchDocumentReference getReceiptDocumentReference()
    {
        return receiptDocumentReference;
    }

    public void setReceiptDocumentReference(DespatchDocumentReference receiptDocumentReference)
    {
        this.receiptDocumentReference = receiptDocumentReference;
    }

    public OriginatorDocumentReference getOriginatorDocumentReference()
    {
        return originatorDocumentReference;
    }

    public void setOriginatorDocumentReference(OriginatorDocumentReference originatorDocumentReference)
    {
        this.originatorDocumentReference = originatorDocumentReference;
    }

    public ContractDocumentReference getContractDocumentReference()
    {
        return contractDocumentReference;
    }

    public void setContractDocumentReference(ContractDocumentReference contractDocumentReference)
    {
        this.contractDocumentReference = contractDocumentReference;
    }

    public List<AdditionalDocumentReference> getAdditionalDocumentReference()
    {
        return additionalDocumentReference;
    }

    public void setAdditionalDocumentReference(List<AdditionalDocumentReference> additionalDocumentReference)
    {
        this.additionalDocumentReference = additionalDocumentReference;
    }

    public ProjectReference getProjectReference()
    {
        return projectReference;
    }

    public void setProjectReference(ProjectReference projectReference)
    {
        this.projectReference = projectReference;
    }

    public AccountingSupplierParty getAccountingSupplierParty()
    {
        return accountingSupplierParty;
    }

    public void setAccountingSupplierParty(AccountingSupplierParty accountingSupplierParty)
    {
        this.accountingSupplierParty = accountingSupplierParty;
    }

    public AccountingCustomerParty getAccountingCustomerParty()
    {
        return accountingCustomerParty;
    }

    public void setAccountingCustomerParty(AccountingCustomerParty accountingCustomerParty)
    {
        this.accountingCustomerParty = accountingCustomerParty;
    }

    public PayeeParty getPayeeParty()
    {
        return payeeParty;
    }

    public void setPayeeParty(PayeeParty payeeParty)
    {
        this.payeeParty = payeeParty;
    }

    public TaxRepresentativeParty getTaxRepresentativeParty()
    {
        return taxRepresentativeParty;
    }

    public void setTaxRepresentativeParty(TaxRepresentativeParty taxRepresentativeParty)
    {
        this.taxRepresentativeParty = taxRepresentativeParty;
    }

    public Delivery getDelivery()
    {
        return delivery;
    }

    public void setDelivery(Delivery delivery)
    {
        this.delivery = delivery;
    }

    public List<PaymentMeans> getPaymentMeans()
    {
        return paymentMeans;
    }

    public void setPaymentMeans(List<PaymentMeans> paymentMeans)
    {
        this.paymentMeans = paymentMeans;
    }

    public PaymentTerms getPaymentTerms()
    {
        return paymentTerms;
    }

    public void setPaymentTerms(PaymentTerms paymentTerms)
    {
        this.paymentTerms = paymentTerms;
    }

    public List<AllowanceCharge> getAllowanceCharge()
    {
        return allowanceCharge;
    }

    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge)
    {
        this.allowanceCharge = allowanceCharge;
    }

    public List<TaxTotal> getTaxTotal()
    {
        return taxTotal;
    }

    public void setTaxTotal(List<TaxTotal> taxTotal)
    {
        this.taxTotal = taxTotal;
    }

    public LegalMonetaryTotal getLegalMonetaryTotal()
    {
        return legalMonetaryTotal;
    }

    public void setLegalMonetaryTotal(LegalMonetaryTotal legalMonetaryTotal)
    {
        this.legalMonetaryTotal = legalMonetaryTotal;
    }

    public List<InvoiceLine> getInvoiceLine()
    {
        return invoiceLine;
    }

    public void setInvoiceLine(List<InvoiceLine> invoiceLine)
    {
        this.invoiceLine = invoiceLine;
    }

    @Override
    public String toString()
    {
        return "Invoice{" +
                "ublVersionID='" + ublVersionID + '\'' +
                ", customizationID='" + customizationID + '\'' +
                ", profileID='" + profileID + '\'' +
                ", id='" + id + '\'' +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", invoiceTypeCode='" + invoiceTypeCode + '\'' +
                ", note=" + note +
                ", taxPointDate=" + taxPointDate +
                ", documentCurrencyCode='" + documentCurrencyCode + '\'' +
                ", taxCurrencyCode='" + taxCurrencyCode + '\'' +
                ", buyerReference='" + buyerReference + '\'' +
                ", accountingCost='" + accountingCost + '\'' +
                ", invoicePeriod=" + invoicePeriod +
                ", orderReference=" + orderReference +
                ", billingReference=" + billingReference +
                ", despatchDocumentReference=" + despatchDocumentReference +
                ", receiptDocumentReference=" + receiptDocumentReference +
                ", originatorDocumentReference=" + originatorDocumentReference +
                ", contractDocumentReference=" + contractDocumentReference +
                ", additionalDocumentReference=" + additionalDocumentReference +
                ", projectReference=" + projectReference +
                ", accountingSupplierParty=" + accountingSupplierParty +
                ", accountingCustomerParty=" + accountingCustomerParty +
                ", payeeParty=" + payeeParty +
                ", taxRepresentativeParty=" + taxRepresentativeParty +
                ", delivery=" + delivery +
                ", paymentMeans=" + paymentMeans +
                ", paymentTerms=" + paymentTerms +
                ", allowanceCharge=" + allowanceCharge +
                ", taxTotal=" + taxTotal +
                ", legalMonetaryTotal=" + legalMonetaryTotal +
                ", invoiceLine=" + invoiceLine +
                "}";
    }
}