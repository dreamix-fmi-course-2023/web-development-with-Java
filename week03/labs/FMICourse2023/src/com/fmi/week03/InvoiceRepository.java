package com.fmi.week03;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {
    private List<Invoice> invoiceHistory = new ArrayList<>();

    public void addInvoice(Invoice invoice) {
        invoiceHistory.add(invoice);
    }

    public List<Invoice> getInvoiceHistory() {
        return invoiceHistory;
    }
}
