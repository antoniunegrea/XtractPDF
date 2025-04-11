package model.invoiceComponents;

import javax.xml.bind.annotation.*;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoicePeriod
{
    @XmlElement(name = "StartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private LocalDate startDate;

    @XmlElement(name = "EndDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private LocalDate endDate;

    @XmlElement(name = "DescriptionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd" +
            ":CommonBasicComponents-2")
    private String descriptionCode;

    public InvoicePeriod()
    {
    }


    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public String getDescriptionCode()
    {
        return descriptionCode;
    }

    public void setDescriptionCode(String descriptionCode)
    {
        this.descriptionCode = descriptionCode;
    }

    @Override
    public String toString()
    {
        return "InvoicePeriod{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", descriptionCode='" + descriptionCode + '\'' +
                '}';
    }
}
