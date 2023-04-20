package bg.fmi.course.wdwj.dealership.service;

import bg.fmi.course.wdwj.dealership.model.Invoice;
import bg.fmi.course.wdwj.dealership.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void addInvoice(Invoice invoice) {
        invoiceRepository.addInvoice(invoice);
    }

    public List<Invoice> getInvoiceHistory() {
        return invoiceRepository.getInvoiceHistory();
    }

    public BigDecimal calculateTotalPrice(Invoice invoice) {
        BigDecimal totalPrice = invoice.getSalesPrice();

        // Add tax to the total price
        BigDecimal tax = totalPrice.multiply(invoice.getTaxRate());
        totalPrice = totalPrice.add(tax);

        return totalPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public void printInvoice(Invoice invoice) {
        System.out.println(invoice.toString());
    }

    public double getTotalRevenue() {
        List<Invoice> invoices = getInvoiceHistory();
        double totalRevenue = 0;
        for (Invoice invoice : invoices) {
            totalRevenue += invoice.getTotalPrice().doubleValue();
        }
        return totalRevenue;
    }
}

