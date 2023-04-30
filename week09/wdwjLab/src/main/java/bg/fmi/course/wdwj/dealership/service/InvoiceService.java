package bg.fmi.course.wdwj.dealership.service;

import bg.fmi.course.wdwj.dealership.model.Invoice;
import bg.fmi.course.wdwj.dealership.repository.InvoiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getInvoices() {
        log.info("Get all invoices from DB");
        return invoiceRepository.findAll();
    }

    public List<Invoice> getInvoicesLessThen(BigDecimal totalPrice) {
        log.info("Get all invoices with total price less then {}", totalPrice);
        return invoiceRepository.findInvoicesByTotalPriceLessThan(totalPrice);
    }

    public Long createInvoice(Invoice invoice) {
        log.info("Create invoice, source = {}", invoice);
        return invoiceRepository.save(invoice).getInvoiceId();
    }
}

