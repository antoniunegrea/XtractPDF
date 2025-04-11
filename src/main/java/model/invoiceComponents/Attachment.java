package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Attachment
{
    @XmlElement(name = "EmbeddedDocumentBinaryObject", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private EmbeddedDocumentBinaryObject embeddedDocumentBinaryObject;

    @XmlElement(name = "ExternalReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private ExternalReference externalReference;

    public Attachment()
    {
    }

    public EmbeddedDocumentBinaryObject getEmbeddedDocumentBinaryObject()
    {
        return embeddedDocumentBinaryObject;
    }

    public void setEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObject embeddedDocumentBinaryObject)
    {
        this.embeddedDocumentBinaryObject = embeddedDocumentBinaryObject;
    }

    public ExternalReference getExternalReference()
    {
        return externalReference;
    }

    public void setExternalReference(ExternalReference externalReference)
    {
        this.externalReference = externalReference;
    }

    @Override
    public String toString()
    {
        return "Attachment{" +
                "embeddedDocumentBinaryObject=" + embeddedDocumentBinaryObject +
                ", externalReference=" + externalReference +
                '}';
    }
}
