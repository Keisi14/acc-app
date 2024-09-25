package cz.itnetwork.dto;

import java.math.BigDecimal;



public class SummaryDTO {

    private BigDecimal currentYearSum;

    private BigDecimal allTimeSum;

    private long invoicesCount;

    // Constructors, Getters, and Setters

    public SummaryDTO() {}

    public SummaryDTO(BigDecimal currentYearSum, BigDecimal allTimeSum, long invoicesCount) {
        this.currentYearSum = currentYearSum;
        this.allTimeSum = allTimeSum;
        this.invoicesCount = invoicesCount;
    }

    // Getters and Setters
    public BigDecimal getCurrentYearSum() {
        return currentYearSum;
    }

    public void setCurrentYearSum(BigDecimal currentYearSum) {
        this.currentYearSum = currentYearSum;
    }

    public BigDecimal getAllTimeSum() {
        return allTimeSum;
    }

    public void setAllTimeSum(BigDecimal allTimeSum) {
        this.allTimeSum = allTimeSum;
    }

    public long getInvoicesCount() {
        return invoicesCount;
    }

    public void setInvoicesCount(long invoicesCount) {
        this.invoicesCount = invoicesCount;
    }
}

