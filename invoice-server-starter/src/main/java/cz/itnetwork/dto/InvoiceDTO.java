package cz.itnetwork.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.itnetwork.entity.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDTO {

    @JsonProperty("_id")
    private Long id;

    private Integer invoiceNumber;

    private Date issued;

    private Date dueDate;

    private String product;

    private Long price;

    private Integer vat;

    private String note;

    private PersonEntity buyer;

    private PersonEntity seller;

}
