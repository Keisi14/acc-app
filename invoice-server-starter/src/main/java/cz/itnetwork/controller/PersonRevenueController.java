package cz.itnetwork.controller;

import cz.itnetwork.dto.PersonRevenueDTO;
import cz.itnetwork.service.PersonRevenueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person-revenue")
public class PersonRevenueController {

    private final PersonRevenueService personRevenueService;

    public PersonRevenueController(PersonRevenueService personRevenueService) {
        this.personRevenueService = personRevenueService;
    }

    @GetMapping
    public List<PersonRevenueDTO> getPersonRevenueList() {
        return personRevenueService.getPersonRevenueList();
    }
}