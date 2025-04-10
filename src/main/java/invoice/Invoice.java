package invoice;

import model.accountingPartyComponents.AccountingCustomerParty;
import model.accountingPartyComponents.AccountingSupplierParty;

import javax.xml.bind.annotation.*;

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

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String issueDate;

    @XmlElement(name = "DueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String dueDate;

    @XmlElement(name = "InvoiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String invoiceTypeCode;

    @XmlElement(name = "DocumentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String documentCurrencyCode;

    @XmlElement(name = "TaxCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String taxCurrencyCode;

    @XmlElement(name = "AccountingSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private AccountingSupplierParty accountingSupplierParty;

    @XmlElement(name = "AccountingCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private AccountingCustomerParty accountingCustomerParty;

    public Invoice()
    {
    }

    public Invoice(String ublVersionID, String customizationID, String id, String issueDate,
            String dueDate, String invoiceTypeCode, String documentCurrencyCode,
            String taxCurrencyCode, AccountingSupplierParty accountingSupplierParty,
            AccountingCustomerParty accountingCustomerParty)
    {
        this.ublVersionID = ublVersionID;
        this.customizationID = customizationID;
        this.id = id;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.invoiceTypeCode = invoiceTypeCode;
        this.documentCurrencyCode = documentCurrencyCode;
        this.taxCurrencyCode = taxCurrencyCode;
        this.accountingSupplierParty = accountingSupplierParty;
        this.accountingCustomerParty = accountingCustomerParty;
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

    @Override
    public String toString()
    {
        return "Invoice{" +
                "ublVersionID='" + ublVersionID + '\'' +
                ", customizationID='" + customizationID + '\'' +
                ", id='" + id + '\'' +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", invoiceTypeCode='" + invoiceTypeCode + '\'' +
                ", documentCurrencyCode='" + documentCurrencyCode + '\'' +
                ", taxCurrencyCode='" + taxCurrencyCode + '\'' +
                ", accountingSupplierParty=" + accountingSupplierParty +
                ", accountingCustomerParty=" + accountingCustomerParty +
                "}";
    }
}