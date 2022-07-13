package com.filipey.dsmeta.services.impl;

import com.filipey.dsmeta.entities.Sale;
import com.filipey.dsmeta.repositories.SaleRepository;
import com.filipey.dsmeta.services.SalesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    private final SaleRepository repository;

    public SalesServiceImpl(SaleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Sale> findSales() {
        return repository.findAll();
    }
}
