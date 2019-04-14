package com.funtl.spring.cloud.web.admin.feign.service;

import com.funtl.spring.cloud.web.admin.feign.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "ADMIN-SERVICE",fallback = AdminServiceHystrix.class)
public interface AdminService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String msg(@RequestParam("msg") String msg);
}
