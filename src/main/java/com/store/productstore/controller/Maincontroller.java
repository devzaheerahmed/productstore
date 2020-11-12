package com.store.productstore.controller;

import com.store.productstore.entity.AmazonData;
import com.store.productstore.repo.AmazonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
 public class Maincontroller {
    @Autowired
    private AmazonRepo amazonRepo;
    @RequestMapping("/")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("thymeleaf/index");
        return modelAndView;
    }

    @GetMapping("/j")
    public ModelAndView jsp () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jsppage");
        return modelAndView;
    }
    @GetMapping("/h")
    public ModelAndView html () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("thymeleaf/try");
        return modelAndView;
    }
    @PostMapping("/add")
    public @ResponseBody String addNewProduct (@RequestParam String title, @RequestParam int size , @RequestParam Long price , @RequestParam String model ) {
        AmazonData amazondata = new AmazonData();
        amazondata.setProductTitle(title);
        amazondata.setProductSize(size);
        amazondata.setProductPrice(price);
        amazondata.setProductModel(model);
        amazonRepo.save(amazondata);
        return "Saved";
    }

}
