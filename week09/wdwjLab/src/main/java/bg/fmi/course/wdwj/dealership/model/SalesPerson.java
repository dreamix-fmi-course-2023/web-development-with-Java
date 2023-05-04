package bg.fmi.course.wdwj.dealership.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class SalesPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEALERSHIP_ID")
    private Dealership dealership;

    @OneToMany(mappedBy = "salesPerson")
    private List<Sale> sales;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phoneNumber;

    // constructors, getters and setters
}
