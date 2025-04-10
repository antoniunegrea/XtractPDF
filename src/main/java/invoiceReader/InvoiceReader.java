package invoiceReader;

import invoice.Invoice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class InvoiceReader
{
    public Invoice readInvoice(String filePath)
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            File xmlFile = new File(filePath);
            return (Invoice) unmarshaller.unmarshal(xmlFile);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
