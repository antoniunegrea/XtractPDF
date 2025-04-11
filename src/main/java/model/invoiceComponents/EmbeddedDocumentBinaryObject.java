package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class EmbeddedDocumentBinaryObject
{
    @XmlAttribute(name = "mimeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String mimeCode;

    @XmlAttribute(name = "filename", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String filename;

    public EmbeddedDocumentBinaryObject()
    {
    }

    public String getMimeCode()
    {
        return mimeCode;
    }

    public void setMimeCode(String mimeCode)
    {
        this.mimeCode = mimeCode;
    }

    public String getFilename()
    {
        return filename;
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    @Override
    public String toString()
    {
        return "EmbeddedDocumentBinaryObject{" +
                "mimeCode='" + mimeCode + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}
