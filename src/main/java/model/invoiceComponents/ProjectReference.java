package model.invoiceComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectReference
{
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String id;

    public ProjectReference()
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
        return "ProjectReference{id='" + id + "'}";
    }
}