package cz.itnetwork.controller;

import cz.itnetwork.dto.SummaryDTO;
import cz.itnetwork.service.SummaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class SummaryController {

    private final SummaryService summaryService;

    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping("/summary")
    public SummaryDTO getInvoiceSummary() {
        return summaryService.getInvoiceSummary();
    }
}
