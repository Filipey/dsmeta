package com.filipey.dsmeta.services;

import com.filipey.dsmeta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SalesService {

    Page<Sale> findSales(String minDate, String maxDate, Pageable pageable);
}
