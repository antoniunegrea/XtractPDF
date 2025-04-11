package model.accountingPartyComponents.partyComponents;

import javax.xml.bind.annotation.XmlElement;

public class AddressLine
{
    @XmlElement(name = "Line", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String line;

    public AddressLine()
    {
    }


    public String getLine()
    {
        return line;
    }

    public void setLine(String line)
    {
        this.line = line;
    }

    @Override
    public String toString()
    {
        return "AddressLine{" +
                "line='" + line + '\'' +
                '}';
    }
}
