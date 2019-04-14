package com.funtl.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    public String msg(String msg){
        return restTemplate.getForObject("http://ADMIN-SERVICE/hi?msg="+msg,String.class);
    }
}
