package model.documentReferences;

import model.invoiceComponents.Attachment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AdditionalDocumentReference
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String documentTypeCode;

    @XmlElement(name = "DocumentDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String documentDescription;

    @XmlElement(name = "Attachment", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private Attachment attachment;

    public AdditionalDocumentReference()
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

    public String getDocumentTypeCode()
    {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode)
    {
        this.documentTypeCode = documentTypeCode;
    }

    public String getDocumentDescription()
    {
        return documentDescription;
    }

    public void setDocumentDescription(String documentDescription)
    {
        this.documentDescription = documentDescription;
    }

    public Attachment getAttachment()
    {
        return attachment;
    }

    public void setAttachment(Attachment attachment)
    {
        this.attachment = attachment;
    }

    @Override
    public String toString()
    {
        return "AdditionalDocumentReference{" +
                "id='" + id + '\'' +
                ", documentTypeCode='" + documentTypeCode + '\'' +
                ", documentDescription='" + documentDescription + '\'' +
                ", attachment=" + attachment +
                '}';
    }
}
