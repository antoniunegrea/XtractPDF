package model.legalMonetary.item;

import model.invoiceComponents.*;
import model.tax.ClassifiedTaxCategory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item
{
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String description;

    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String name;

    @XmlElement(name = "BuyersItemIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private BuyersItemIdentification buyersItemIdentification;

    @XmlElement(name = "SellersItemIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private SellersItemIdentification sellersItemIdentification;

    @XmlElement(name = "StandardItemIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private StandardItemIdentification standardItemIdentification;

    @XmlElement(name = "OriginCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private OriginCountry originCountry;

    @XmlElement(name = "CommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<CommodityClassification> commodityClassification;

    @XmlElement(name = "ClassifiedTaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private ClassifiedTaxCategory classifiedTaxCategory;

    @XmlElement(name = "AdditionalItemProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonAggregateComponents-2")
    private List<AdditionalItemProperty> additionalItemProperty;

    public Item()
    {
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public BuyersItemIdentification getBuyersItemIdentification()
    {
        return buyersItemIdentification;
    }

    public void setBuyersItemIdentification(BuyersItemIdentification buyersItemIdentification)
    {
        this.buyersItemIdentification = buyersItemIdentification;
    }

    public SellersItemIdentification getSellersItemIdentification()
    {
        return sellersItemIdentification;
    }

    public void setSellersItemIdentification(SellersItemIdentification sellersItemIdentification)
    {
        this.sellersItemIdentification = sellersItemIdentification;
    }

    public StandardItemIdentification getStandardItemIdentification()
    {
        return standardItemIdentification;
    }

    public void setStandardItemIdentification(StandardItemIdentification standardItemIdentification)
    {
        this.standardItemIdentification = standardItemIdentification;
    }

    public OriginCountry getOriginCountry()
    {
        return originCountry;
    }

    public void setOriginCountry(OriginCountry originCountry)
    {
        this.originCountry = originCountry;
    }

    public List<CommodityClassification> getCommodityClassification()
    {
        return commodityClassification;
    }

    public void setCommodityClassification(List<CommodityClassification> commodityClassification)
    {
        this.commodityClassification = commodityClassification;
    }

    public ClassifiedTaxCategory getClassifiedTaxCategory()
    {
        return classifiedTaxCategory;
    }

    public void setClassifiedTaxCategory(ClassifiedTaxCategory classifiedTaxCategory)
    {
        this.classifiedTaxCategory = classifiedTaxCategory;
    }

    public List<AdditionalItemProperty> getAdditionalItemProperty()
    {
        return additionalItemProperty;
    }

    public void setAdditionalItemProperty(List<AdditionalItemProperty> additionalItemProperty)
    {
        this.additionalItemProperty = additionalItemProperty;
    }

    @Override
    public String toString()
    {
        return "Item{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", buyersItemIdentification=" + buyersItemIdentification +
                ", sellersItemIdentification=" + sellersItemIdentification +
                ", standardItemIdentification=" + standardItemIdentification +
                ", originCountry=" + originCountry +
                ", comodityClassification=" + commodityClassification +
                ", classifiedTaxCategory=" + classifiedTaxCategory +
                ", additionalItemProperty=" + additionalItemProperty +
                '}';
    }

}
