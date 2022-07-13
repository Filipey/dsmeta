package com.filipey.dsmeta.controllers;

import com.filipey.dsmeta.entities.Sale;
import com.filipey.dsmeta.services.SalesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/sales")
public class SaleController {

    private final SalesService service;

    public SaleController(SalesService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "")String maxDate,
            Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }
}
