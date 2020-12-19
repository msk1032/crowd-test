package org.studyhub.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.studyhub.springcloud.entity.Employee;

/**
 * @author haoren
 * @create 2020-12-15 10:42
 */

@RestController
public class HumanResourceController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/ribbon/get/employee")
    public Employee getEmployee() {

        String host = "http://localhost:8888";

        String url = "/provider/get/employee/remote";
        //使用微服务名称调用
        String applicationName = "http://org.studyhub.springcloud.spring-03-provider";

        return restTemplate.getForObject(applicationName+url, Employee.class);
    }
}
