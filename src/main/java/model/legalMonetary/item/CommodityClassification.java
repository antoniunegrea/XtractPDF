package model.legalMonetary.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CommodityClassification
{
    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String itemClassificationCode;

    public CommodityClassification()
    {
    }

    public String getItemClassificationCode()
    {
        return itemClassificationCode;
    }

    public void setItemClassificationCode(String itemClassificationCode)
    {
        this.itemClassificationCode = itemClassificationCode;
    }

    @Override
    public String toString()
    {
        return "CommodityClassification{" +
                "itemClassificationCode='" + itemClassificationCode + '\'' +
                '}';
    }
}
