# For today's lab we will create and connect to our own DB instance. You will create a simple tables with appropriate entities, repositories. Them we will call them via services.

# Task 0
Setup a PostgreSQL DB on your machine. If you have problem you can use the following [guide](https://github.com/dreamix-fmi-course-2023/web-development-with-Java/blob/main/week09/postgresql.md)

(***NB***) you can use MySQL DB too or your preferable DB.

You can also use Docker (tutorial will be applied later)

# Task 1
Setup a connection from Dealership system to your newly created DB.

```
Abstract steps:
1. add necessary dependencies
2. add properties inside the application property file (.properties or .yml) for your DB connection (connection string, driver, dialect, etc)
```
For the configurations you can  use the example from [lecture week08](https://github.com/GeorgiMinkov/web-development-with-Java/tree/main/week08/demo/FMI_DB_JPA).

```
spring.datasource.url=jdbc:postgresql://localhost:5433/postgres
spring.datasource.username=postgres
spring.datasource.password=pgadmin
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.database=postgresql
spring.jpa.hibernate.ddl-auto=update
```

---
### *For the next steps we will use only Invoice and Dealership controller/service/repository/entity  as there is no relations for now*
---

# Task 2
Cleanup your entity model classes, for beginning we will remove all dependencies from the tables.

For simplicity lets have single invoice and dealership tables.

You can use spring property ddl-auto = update in order to create DB tables from code.

To create entity classes you will need the following annotations:

 - @Entity - annotation specifies that the class is an entity and is mapped to a database table. The @Table annotation specifies the name of the database table to be used for mapping
 - @Id - annotation specifies the primary key of an entity
 - @GeneratedValue(strategy = GenerationType.AUTO) - provides for the specification of generation strategies for the values of primary keys
 - @Column - annotation is used to specify the mapped column for a persistent property or field

Example:
```
@Data
@Entity
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

```


# Task 3
Modify your repository classes for Invoice and Dealership to use the real DB

# Task 4
Using REST APIs for Invoice and Dealership test your application via Postman.

To accomplish it change the necessary services.

# Task 5 - next time
By fully developed schema you will need to define relationship structure betweens entity.

