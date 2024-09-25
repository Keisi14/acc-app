package cz.itnetwork.dto;

import java.math.BigDecimal;

public class PersonRevenueDTO {   private Long personId;
    private String personName;
    private BigDecimal revenue;

    // Constructors, Getters, and Setters

    public PersonRevenueDTO() {}

    public PersonRevenueDTO(Long personId, String personName, BigDecimal revenue) {
        this.personId = personId;
        this.personName = personName;
        this.revenue = revenue;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }
}
