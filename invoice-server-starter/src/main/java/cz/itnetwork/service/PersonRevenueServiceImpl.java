package cz.itnetwork.service;

import cz.itnetwork.dto.PersonRevenueDTO;
import cz.itnetwork.entity.PersonEntity;
import cz.itnetwork.entity.repository.InvoiceRepository;
import cz.itnetwork.entity.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonRevenueServiceImpl implements PersonRevenueService{

    private final InvoiceRepository invoiceRepository;
    private final PersonRepository personRepository;

    public PersonRevenueServiceImpl(InvoiceRepository invoiceRepository, PersonRepository personRepository) {
        this.invoiceRepository = invoiceRepository;
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonRevenueDTO> getPersonRevenueList() {
        List<PersonEntity> persons = personRepository.findAll();

        return persons.stream().map(person -> {
            BigDecimal revenue = invoiceRepository.findBySellerId(person.getId()).stream()
                    .map(InvoiceEntity::getPrice)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            return new PersonRevenueDTO(person.getId(), person.getName(), revenue);
        }).collect(Collectors.toList());
    }
}
