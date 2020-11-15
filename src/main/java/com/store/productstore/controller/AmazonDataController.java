package com.store.productstore.controller;

import com.store.productstore.entity.AmazonData;
import com.store.productstore.exceptions.ProductDataNotFoundException;
import com.store.productstore.repo.AmazonRepo;
import com.store.productstore.services.AmazonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.List;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/amazon")
public class AmazonDataController {

    AmazonDataService amazondataservice;
    @Autowired
    public AmazonDataController (AmazonDataService amazondataservice ) {
        this.amazondataservice=amazondataservice;
    }

    @GetMapping("/getalldata")
    public List<AmazonData> getAllData(){
        return amazondataservice.getAllData();
    }

    @PostMapping("/save")
    public AmazonData addData (@Valid @RequestBody AmazonData amazondata) {
        return amazondataservice.save(amazondata);
    }

    @GetMapping("/{id}")
    public AmazonData getById(@PathVariable("id") @Min(1) int id) {
        AmazonData std = amazondataservice.findById(id)
                .orElseThrow(()->new ProductDataNotFoundException("Data with "+id+" is Not Found!"));
        return std;
    }

}
