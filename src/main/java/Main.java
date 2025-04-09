import invoice.Invoice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main
{
    public Invoice readInvoice(String filePath)
    {
        try
        {
            // Create JAXB context for Invoice class
            JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Read the XML file
            File xmlFile = new File(filePath);
            Invoice invoice = (Invoice) unmarshaller.unmarshal(xmlFile);

            return invoice;
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        Invoice invoice = main.readInvoice("src/xaml_inputs/F_3610940565_C101_15-07-2024.xml");
        if (invoice != null)
        {
            // Print the entire object
            System.out.println(invoice);

            // Print individual fields for clarity
            System.out.println("\nDetailed Information:");
            System.out.println("UBL Version ID: " + invoice.getUblVersionID());
            System.out.println("Customization ID: " + invoice.getCustomizationID());
            System.out.println("Invoice ID: " + invoice.getId());
            System.out.println("Issue Date: " + invoice.getIssueDate());
            System.out.println("Due Date: " + invoice.getDueDate());
            System.out.println("Invoice Type Code: " + invoice.getInvoiceTypeCode());
            System.out.println("Document Currency Code: " + invoice.getDocumentCurrencyCode());
            System.out.println("Tax Currency Code: " + invoice.getTaxCurrencyCode());
        }
    }

}