package com.basha.uk.uk.controller;

import com.basha.uk.uk.entity.ProductMasterDataDAO;
import com.basha.uk.uk.implementation.ProductMasterDataImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class controller {

    @Autowired
    private ProductMasterDataImpl ProductMasterDataImpl;

    @GetMapping("/message")
    public String test() throws IOException, InterruptedException {
        return "First Test Message - UPDATED BASHA";
    }

    @PostMapping("/insertProductMasterData")
    public Boolean insertProductMasterData(@RequestBody List<ProductMasterDataDAO> ProductMasterDataDAOList) throws IOException, InterruptedException {
        ProductMasterDataImpl.insertProductMasterData(ProductMasterDataDAOList);
        return true;
    }
}
