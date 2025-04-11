package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class BillingReference
{
    @XmlElement(name = "InvoiceDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private DocumentReference invoiceDocumentReference;

    public BillingReference()
    {
    }

    public DocumentReference getInvoiceDocumentReference()
    {
        return invoiceDocumentReference;
    }

    public void setInvoiceDocumentReference(DocumentReference invoiceDocumentReference)
    {
        this.invoiceDocumentReference = invoiceDocumentReference;
    }

    @Override
    public String toString()
    {
        return "BillingReference{invoiceDocumentReference=" + invoiceDocumentReference + "}";
    }
}