package bg.fmi.course.wdwj.dealership.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceId;

    @Column
    private String invoiceNumber;

    @Column
    private String customerName;

    @Column
    private LocalDate invoiceDate;

    @Column
    private BigDecimal basePrice;

    @Column
    private BigDecimal taxRate;

    @Column
    private BigDecimal totalPrice;
}
