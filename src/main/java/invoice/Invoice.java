package invoice;

import model.accountingPartyComponents.AccountingCustomerParty;
import model.accountingPartyComponents.AccountingSupplierParty;
import model.accountingPartyComponents.PayeeParty;
import model.accountingPartyComponents.partyComponents.TaxRepresentativeParty;
import model.invoiceComponents.BillingReference;
import model.invoiceComponents.InvoicePeriod;
import model.invoiceComponents.*;

import javax.xml.bind.annotation.*;
import java.time.LocalDate;
import java.util.ArrayList;
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
    private LocalDate issueDate;

    @XmlElement(name = "DueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private LocalDate dueDate;

    @XmlElement(name = "InvoiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String invoiceTypeCode;

    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private List<String> note;

    @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private LocalDate taxPointDate;

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
    private List<InvoicePeriod> invoicePeriod;

    @XmlElement(name = "OrderReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private OrderReference orderReference;

    @XmlElement(name = "BillingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<BillingReference> billingReference;

    @XmlElement(name = "DespatchDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<DocumentReference> despatchDocumentReference;

    @XmlElement(name = "ReceiptDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<DocumentReference> receiptDocumentReference;

    @XmlElement(name = "OriginatorDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<DocumentReference> originatorDocumentReference;

    @XmlElement(name = "ContractDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<DocumentReference> contractDocumentReference;

    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<DocumentReference> additionalDocumentReference;

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
    private List<Delivery> delivery;

    @XmlElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<PaymentMeans> paymentMeans;

    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<PaymentTerms> paymentTerms;

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
        this.note = new ArrayList<>();
        this.invoicePeriod = new ArrayList<>();
        this.billingReference = new ArrayList<>();
        this.despatchDocumentReference = new ArrayList<>();
        this.receiptDocumentReference = new ArrayList<>();
        this.originatorDocumentReference = new ArrayList<>();
        this.contractDocumentReference = new ArrayList<>();
        this.additionalDocumentReference = new ArrayList<>();
        this.delivery = new ArrayList<>();
        this.paymentMeans = new ArrayList<>();
        this.paymentTerms = new ArrayList<>();
        this.allowanceCharge = new ArrayList<>();
        this.taxTotal = new ArrayList<>();
        this.invoiceLine = new ArrayList<>();
    }

    // Getters and Setters
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

    public LocalDate getIssueDate()
    {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate)
    {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate)
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

    public List<String> getNote()
    {
        return note;
    }

    public void setNote(List<String> note)
    {
        this.note = note;
    }

    public LocalDate getTaxPointDate()
    {
        return taxPointDate;
    }

    public void setTaxPointDate(LocalDate taxPointDate)
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

    public String getPricingCurrencyCode()
    {
        return pricingCurrencyCode;
    }

    public void setPricingCurrencyCode(String pricingCurrencyCode)
    {
        this.pricingCurrencyCode = pricingCurrencyCode;
    }

    public String getPaymentCurrencyCode()
    {
        return paymentCurrencyCode;
    }

    public void setPaymentCurrencyCode(String paymentCurrencyCode)
    {
        this.paymentCurrencyCode = paymentCurrencyCode;
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

    public List<InvoicePeriod> getInvoicePeriod()
    {
        return invoicePeriod;
    }

    public void setInvoicePeriod(List<InvoicePeriod> invoicePeriod)
    {
        this.invoicePeriod = invoicePeriod;
    }

    public OrderReference getOrderReference()
    {
        return orderReference;
    }

    public void setOrderReference(OrderReference orderReference)
    {
        this.orderReference = orderReference;
    }

    public List<BillingReference> getBillingReference()
    {
        return billingReference;
    }

    public void setBillingReference(List<BillingReference> billingReference)
    {
        this.billingReference = billingReference;
    }

    public List<DocumentReference> getDespatchDocumentReference()
    {
        return despatchDocumentReference;
    }

    public void setDespatchDocumentReference(List<DocumentReference> despatchDocumentReference)
    {
        this.despatchDocumentReference = despatchDocumentReference;
    }

    public List<DocumentReference> getReceiptDocumentReference()
    {
        return receiptDocumentReference;
    }

    public void setReceiptDocumentReference(List<DocumentReference> receiptDocumentReference)
    {
        this.receiptDocumentReference = receiptDocumentReference;
    }

    public List<DocumentReference> getOriginatorDocumentReference()
    {
        return originatorDocumentReference;
    }

    public void setOriginatorDocumentReference(List<DocumentReference> originatorDocumentReference)
    {
        this.originatorDocumentReference = originatorDocumentReference;
    }

    public List<DocumentReference> getContractDocumentReference()
    {
        return contractDocumentReference;
    }

    public void setContractDocumentReference(List<DocumentReference> contractDocumentReference)
    {
        this.contractDocumentReference = contractDocumentReference;
    }

    public List<DocumentReference> getAdditionalDocumentReference()
    {
        return additionalDocumentReference;
    }

    public void setAdditionalDocumentReference(List<DocumentReference> additionalDocumentReference)
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

    public List<Delivery> getDelivery()
    {
        return delivery;
    }

    public void setDelivery(List<Delivery> delivery)
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

    public List<PaymentTerms> getPaymentTerms()
    {
        return paymentTerms;
    }

    public void setPaymentTerms(List<PaymentTerms> paymentTerms)
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
                ", pricingCurrencyCode='" + pricingCurrencyCode + '\'' +
                ", paymentCurrencyCode='" + paymentCurrencyCode + '\'' +
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