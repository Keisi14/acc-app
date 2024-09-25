package cz.itnetwork.service;

import cz.itnetwork.dto.InvoiceDTO;
import cz.itnetwork.entity.PersonEntity;

import java.util.List;

public interface InvoiceService {

    /**
     *
     * @param invoiceDTO
     * @return
     */

    InvoiceDTO addNewInvoice(InvoiceDTO invoiceDTO);

    /**
     *
     * @param id
     */
    void removeInvoice(long id);

    /**
     *
     *
     * @return
     */

    List<InvoiceDTO> getAll();

    InvoiceDTO getInvoiceById(long id);



    PersonEntity getSellerById(Long personId);

    PersonEntity getBuyerById(Long personId);
}
