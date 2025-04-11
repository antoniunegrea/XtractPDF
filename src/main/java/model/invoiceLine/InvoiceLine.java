package model.invoiceLine;

import model.Allowance.AllowanceCharge;
import model.legalMonetary.LineExtensionAmount;
import model.legalMonetary.item.Item;
import model.legalMonetary.item.Price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceLine
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String note;

    @XmlElement(name = "InvoicedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private InvoicedQuantity invoicedQuantity;

    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private LineExtensionAmount lineExtensionAmount;

    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String accountingCost;

    @XmlElement(name = "InvoicePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private InvoicePeriod invoicePeriod;

    @XmlElement(name = "OrderLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private OrderLineReference orderLineReference;

    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private DocumentReference documentReference;

    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<AllowanceCharge> allowanceCharge;

    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private Item item;

    @XmlElement(name = "Price", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private Price price;

    public InvoiceLine()
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

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }

    public InvoicedQuantity getInvoicedQuantity()
    {
        return invoicedQuantity;
    }

    public void setInvoicedQuantity(InvoicedQuantity invoicedQuantity)
    {
        this.invoicedQuantity = invoicedQuantity;
    }

    public LineExtensionAmount getLineExtensionAmount()
    {
        return lineExtensionAmount;
    }

    public void setLineExtensionAmount(LineExtensionAmount lineExtensionAmount)
    {
        this.lineExtensionAmount = lineExtensionAmount;
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

    public OrderLineReference getOrderLineReference()
    {
        return orderLineReference;
    }

    public void setOrderLineReference(OrderLineReference orderLineReference)
    {
        this.orderLineReference = orderLineReference;
    }

    public DocumentReference getDocumentReference()
    {
        return documentReference;
    }

    public void setDocumentReference(DocumentReference documentReference)
    {
        this.documentReference = documentReference;
    }

    public List<AllowanceCharge> getAllowanceCharge()
    {
        return allowanceCharge;
    }

    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge)
    {
        this.allowanceCharge = allowanceCharge;
    }

    public Item getItem()
    {
        return item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    public Price getPrice()
    {
        return price;
    }

    public void setPrice(Price price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "InvoiceLine{" +
                "id='" + id + '\'' +
                ", note='" + note + '\'' +
                ", invoicedQuantity='" + invoicedQuantity + '\'' +
                ", lineExtensionAmount='" + lineExtensionAmount + '\'' +
                ", accountingCost='" + accountingCost + '\'' +
                ", invoicePeriod=" + invoicePeriod +
                ", orderLineReference=" + orderLineReference +
                ", documentReference=" + documentReference +
                ", allowanceCharge=" + allowanceCharge +
                ", item=" + item +
                ", price=" + price +
                '}';
    }
}

