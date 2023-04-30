package bg.fmi.course.wdwj.dealership.mapper;

import bg.fmi.course.wdwj.dealership.dto.InvoiceDto;
import bg.fmi.course.wdwj.dealership.model.Invoice;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InvoiceMapper {

    public Invoice toEntity(InvoiceDto invoiceDto) {
        if (invoiceDto == null) {
            return null;
        }

        return Invoice.builder()
                .invoiceNumber(invoiceDto.getInvoiceNumber())
                .invoiceDate(invoiceDto.getInvoiceDate())
                .basePrice(invoiceDto.getBasePrice())
                .customerName(invoiceDto.getCustomerName())
                .taxRate(invoiceDto.getTaxRate())
                .totalPrice(invoiceDto.getTotalPrice())
                .build();
    }

    public InvoiceDto toDto(Invoice invoice) {
        if (invoice == null) {
            return null;
        }

        return InvoiceDto.builder()
                .invoiceNumber(invoice.getInvoiceNumber())
                .invoiceDate(invoice.getInvoiceDate())
                .basePrice(invoice.getBasePrice())
                .customerName(invoice.getCustomerName())
                .taxRate(invoice.getTaxRate())
                .totalPrice(invoice.getTotalPrice())
                .build();
    }

    public List<InvoiceDto> toDtoCollection(Collection<Invoice> invoices) {
        return invoices.stream()
                .map(el -> toDto(el))
                .collect(Collectors.toList());
    }
}
