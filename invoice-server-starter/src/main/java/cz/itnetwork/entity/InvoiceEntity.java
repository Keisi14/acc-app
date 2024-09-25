package cz.itnetwork.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import java.util.Date;

@Entity(name = "invoice")
@Getter
@Setter
public class InvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer invoiceNumber;

    @Column(nullable = false)
    private Date issued;

    @Column(nullable = false)
    private Date dueDate;

    @Column(nullable = false)

    private String product;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private Integer vat;

    private String note;

    @OneToMany(mappedBy = "purchases")
    private PersonEntity buyer;

    @OneToMany(mappedBy = "sales")
    private PersonEntity seller;
}
