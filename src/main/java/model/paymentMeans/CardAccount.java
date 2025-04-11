package model.paymentMeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CardAccount
{
    @XmlElement(name = "PrimaryAccountNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String primaryAccountNumberID;

    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String networkID;

    @XmlElement(name = "HolderName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String holderName;

    public CardAccount()
    {
    }


    public String getPrimaryAccountNumberID()
    {
        return primaryAccountNumberID;
    }

    public void setPrimaryAccountNumberID(String primaryAccountNumberID)
    {
        this.primaryAccountNumberID = primaryAccountNumberID;
    }

    public String getNetworkID()
    {
        return networkID;
    }

    public void setNetworkID(String networkID)
    {
        this.networkID = networkID;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }

    @Override
    public String toString()
    {
        return "CardAccount{" +
                "primaryAccountNumberID='" + primaryAccountNumberID + '\'' +
                ", networkID='" + networkID + '\'' +
                ", holderName='" + holderName + '\'' +
                '}';
    }
}
