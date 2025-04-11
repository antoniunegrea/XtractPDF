package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ExternalReference
{
    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String uri;

    public ExternalReference()
    {
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    @Override
    public String toString()
    {
        return "ExternalReference{" +
                "uri='" + uri + '\'' +
                '}';
    }


}
