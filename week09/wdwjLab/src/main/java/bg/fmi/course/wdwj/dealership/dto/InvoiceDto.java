package bg.fmi.course.wdwj.dealership.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class InvoiceDto {
    private String invoiceNumber;

    private String customerName;
    
    private LocalDate invoiceDate;

    private BigDecimal basePrice;

    private BigDecimal taxRate;

    private BigDecimal totalPrice;
}
