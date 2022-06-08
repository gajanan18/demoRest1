package com.resttemplate.demo.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.resttemplate.demo.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private ServiceClass serviceClass;

    @GetMapping("/all")
    public ResponseEntity<?> getAllData() throws JsonProcessingException {
        return  new ResponseEntity<>(serviceClass.getList(), HttpStatus.OK);
    }

}



