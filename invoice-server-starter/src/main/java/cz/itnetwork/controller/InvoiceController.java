package cz.itnetwork.controller;

import cz.itnetwork.dto.InvoiceDTO;
import cz.itnetwork.entity.PersonEntity;
import cz.itnetwork.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/invoices")
    public InvoiceDTO addNewInvoice(@RequestBody InvoiceDTO invoiceDTO) {

        return invoiceService.addNewInvoice((invoiceDTO)); }

    @GetMapping("/invoices")
    public List<InvoiceDTO> getInvoices() {
        return invoiceService.getAll();
    }

    @DeleteMapping("/invoices/{invoiceId}")
    public void deleteInvoice(@PathVariable Long invoiceId) {
        invoiceService.removeInvoice(invoiceId);
    }

    @GetMapping("/invoices/{invoiceId}")
    public InvoiceDTO getInvoiceById(@PathVariable Long invoiceId) {
        return invoiceService.getInvoiceById(invoiceId);
    }

    @GetMapping("/persons/{personId}/purchases")
    public PersonEntity getPurchases(@PathVariable Long personId) {
        return invoiceService.getBuyerById(personId);
    }

    @GetMapping("/persons/{personId}/sales")
    public PersonEntity getSales(@PathVariable Long personId) {
        return invoiceService.getSellerById(personId);
    }
}

