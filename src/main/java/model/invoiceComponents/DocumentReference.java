package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentReference
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String issueDate;

    public DocumentReference()
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

    public String getIssueDate()
    {
        return issueDate;
    }

    public void setIssueDate(String issueDate)
    {
        this.issueDate = issueDate;
    }

    @Override
    public String toString()
    {
        return "DocumentReference{" +
                "id='" + id + '\'' +
                ", issueDate='" + issueDate + '\'' +
                '}';
    }
}