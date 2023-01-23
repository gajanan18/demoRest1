package com.resttemplate.demo.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resttemplate.demo.data.Data;
import com.resttemplate.demo.respository.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class ServiceClass {

    @Autowired
    private final RestTemplate restTemplate;

    public ServiceClass(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Autowired
    private DataRepo dataRepo;

    public List<Data> getList() throws JsonProcessingException {

        String url = "https://api.thecatapi.com/v1/votes/";
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-api-key", "");

        HttpEntity entity = new HttpEntity<>(headers);

        String output = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Data> userList = objectMapper.readValue(output, new TypeReference<List<Data>>() {});
        return userList;
    }
}
