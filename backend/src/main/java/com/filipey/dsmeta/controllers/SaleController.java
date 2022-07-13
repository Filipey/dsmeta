package com.filipey.dsmeta.controllers;

import com.filipey.dsmeta.entities.Sale;
import com.filipey.dsmeta.services.SalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/sales")
public class SaleController {

    private final SalesService service;

    public SaleController(SalesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sale> findSales() {
        return service.findSales();
    }
}
