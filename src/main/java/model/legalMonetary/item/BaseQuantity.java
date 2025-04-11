package model.legalMonetary.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BaseQuantity
{
    @XmlElement(name = "BaseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String baseQuantity;

    @XmlAttribute(name = "unitCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String unitCode;

    public BaseQuantity()
    {
    }

    public BaseQuantity(String baseQuantity, String unitCode)
    {
        this.baseQuantity = baseQuantity;
        this.unitCode = unitCode;
    }

    public String getBaseQuantity()
    {
        return baseQuantity;
    }

    public void setBaseQuantity(String baseQuantity)
    {
        this.baseQuantity = baseQuantity;
    }

    public String getUnitCode()
    {
        return unitCode;
    }

    public void setUnitCode(String unitCode)
    {
        this.unitCode = unitCode;
    }

    @Override
    public String toString()
    {
        return "BaseQuantity{" +
                "baseQuantity='" + baseQuantity + '\'' +
                ", unitCode='" + unitCode + '\'' +
                '}';
    }
}
