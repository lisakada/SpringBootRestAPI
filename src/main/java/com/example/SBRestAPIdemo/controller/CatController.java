package com.example.SBRestAPIdemo.controller;

import com.example.SBRestAPIdemo.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SBRestAPIdemo.repository.CatRepository;

@RestController
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("api/v1/test")
    public String test() {
        var c = new Cat(1, "test");
        catRepository.save(c);
        return "ok";
    }
}