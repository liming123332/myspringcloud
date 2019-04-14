package com.funtl.spring.cloud.web.admin.feign.hystrix;

import com.funtl.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String msg(String msg) {
        return "your message is "+msg+" but request bad";
    }
}
