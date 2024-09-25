package cz.itnetwork.service;

import cz.itnetwork.dto.SummaryDTO;
import cz.itnetwork.entity.InvoiceEntity;
import cz.itnetwork.entity.repository.InvoiceRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class SummaryServiceImpl implements  SummaryService{
    private final InvoiceRepository invoiceRepository;

    public SummaryServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public SummaryDTO getInvoiceSummary() {
        List<InvoiceEntity> allInvoices = invoiceRepository.findAll();
        BigDecimal allTimeSum = allInvoices.stream()
                .map(InvoiceEntity::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        LocalDate startOfYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
        BigDecimal currentYearSum = allInvoices.stream()
                .filter(invoice -> {
                    boolean b = !invoice.getIssued().before(startOfYear)
                            .map(InvoiceEntity::getPrice)
                            .reduce(BigDecimal.ZERO,
                                    BigDecimal::add);
                    return b;
                };
        long invoicesCount = allInvoices.size();

        return new SummaryDTO(currentYearSum, allTimeSum, invoicesCount);
    }
}
