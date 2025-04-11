package model.invoiceLine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentReference
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String documentTypeCode;

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

    public String getDocumentTypeCode()
    {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode)
    {
        this.documentTypeCode = documentTypeCode;
    }

    @Override
    public String toString()
    {
        return "DocumentReference{" +
                "id='" + id + '\'' +
                ", documentTypeCode='" + documentTypeCode + '\'' +
                '}';
    }

}
