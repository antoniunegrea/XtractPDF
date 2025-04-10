import invoice.Invoice;
import invoiceReader.InvoiceReader;

public class Main
{

    public static void main(String[] args)
    {
        InvoiceReader invoiceReader = new InvoiceReader();
        Invoice invoice = invoiceReader.readInvoice("src/xaml_inputs/F_3610940565_C101_15-07-2024.xml");
        if (invoice != null)
        {
            // Print the entire object
            System.out.println(invoice);
        }
    }

}