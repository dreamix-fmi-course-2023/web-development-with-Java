package bg.fmi.course.wdwj.dealership.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_person_id")
    private SalesPerson salesPerson;

    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @Column
    private LocalDate saleDate;

    @Column
    private BigDecimal totalPrice;

    // constructors, getters and setters
}

