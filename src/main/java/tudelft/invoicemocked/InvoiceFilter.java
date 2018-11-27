package tudelft.invoicemocked;

import java.util.List;
import java.util.stream.Collectors;

public class InvoiceFilter {

    private InvoiceDao dao;

    public InvoiceFilter(InvoiceDao dao) {
        this.dao = dao;
    }

    public List<Invoice> filter() {

        List<Invoice> allInvoices = dao.all();
        return allInvoices.stream()
                .filter(invoice -> invoice.getValue() < 100)
                .collect(Collectors.toList());
    }
}