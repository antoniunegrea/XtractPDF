package model.invoiceComponents;

import model.documentReferences.InvoiceDocumentReference;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class BillingReference
{
    @XmlElement(name = "InvoiceDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private InvoiceDocumentReference invoiceDocumentReference;

    public BillingReference()
    {
    }

    public InvoiceDocumentReference getInvoiceDocumentReference()
    {
        return invoiceDocumentReference;
    }

    public void setInvoiceDocumentReference(InvoiceDocumentReference invoiceDocumentReference)
    {
        this.invoiceDocumentReference = invoiceDocumentReference;
    }

    @Override
    public String toString()
    {
        return "BillingReference{invoiceDocumentReference=" + invoiceDocumentReference + "}";
    }
}