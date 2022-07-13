package com.filipey.dsmeta.services.impl;

import com.filipey.dsmeta.entities.Sale;
import com.filipey.dsmeta.repositories.SaleRepository;
import com.filipey.dsmeta.services.SalesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class SalesServiceImpl implements SalesService {

    private final SaleRepository repository;

    public SalesServiceImpl(SaleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());


        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return repository.findSales(min, max, pageable);
    }
}
