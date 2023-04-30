package bg.fmi.course.wdwj.dealership.controller;

import bg.fmi.course.wdwj.dealership.dto.InvoiceDto;
import bg.fmi.course.wdwj.dealership.mapper.InvoiceMapper;
import bg.fmi.course.wdwj.dealership.service.InvoiceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("invoices")
public class InvoiceController {
    private final InvoiceService invoiceService;

    private final InvoiceMapper invoiceMapper;

    @Autowired
    public InvoiceController(InvoiceService invoiceService, InvoiceMapper invoiceMapper) {
        this.invoiceService = invoiceService;
        this.invoiceMapper = invoiceMapper;
    }

    @PostMapping
    public Long createInvoice(@RequestBody InvoiceDto invoiceDto) {
        return invoiceService.createInvoice(invoiceMapper.toEntity(invoiceDto));
    }

    @GetMapping
    public List<InvoiceDto> getInvoices(@RequestParam(required = false) BigDecimal totalPrice) {
        return totalPrice == null
                ? invoiceMapper.toDtoCollection(invoiceService.getInvoices())
                : invoiceMapper.toDtoCollection(invoiceService.getInvoicesLessThen(totalPrice));
    }
}
