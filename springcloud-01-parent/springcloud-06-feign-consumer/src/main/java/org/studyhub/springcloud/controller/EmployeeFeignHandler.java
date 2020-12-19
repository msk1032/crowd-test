package org.studyhub.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.studyhub.springcloud.api.EmployeeRemoteService;
import org.studyhub.springcloud.entity.Employee;
import org.studyhub.springcloud.utils.ResultEntity;

/**
 * @author haoren
 * @create 2020-12-15 13:27
 */

@RestController
public class EmployeeFeignHandler {
    @Autowired
    private EmployeeRemoteService employeeRemoteService;

    @RequestMapping("/feign/consumer/get/emp")
    public Employee getEmployeeRemote() {
        return employeeRemoteService.getEmployeeRemote();
    }

    @RequestMapping("/feign/consumer/search/emp")
    public Employee searchEmpById(@RequestParam("empId")Integer empId) {
        return employeeRemoteService.getEmployeeById(empId);
    }

    @RequestMapping("/feign/consumer/test/fallback")
    public ResultEntity<Employee> testFallback(@RequestParam("signal")String signal) {

        return employeeRemoteService.getEmp(signal);

    }

}
