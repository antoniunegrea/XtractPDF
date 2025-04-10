package model.accountingPartyComponents.partyComponents;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Contact
{
    @XmlElement(name = "PersonName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String personName;

    @XmlElement(name = "DepartmentName", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String departmentName;

    @XmlElement(name = "Telephone", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String telephone;

    @XmlElement(name = "ElectronicMail", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String electronicMail;


    public Contact()
    {
    }

    public Contact(String personName, String departmentName, String telephone, String electronicMail)
    {
        this.personName = personName;
        this.departmentName = departmentName;
        this.telephone = telephone;
        this.electronicMail = electronicMail;
    }

    public String getPersonName()
    {
        return personName;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public String getTelephone()
    {
        return telephone;
    }


    public String getElectronicMail()
    {
        return electronicMail;
    }


    @Override
    public String toString()
    {
        return "Contact{" +
                "personName='" + personName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", electronicMail='" + electronicMail + '\'' +
                '}';
    }
}
