package model.documentReferences;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ContractDocumentReference
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    public ContractDocumentReference()
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

    @Override
    public String toString()
    {
        return "ContractDocumentReference{" +
                "id='" + id + '\'' +
                '}';
    }
}
