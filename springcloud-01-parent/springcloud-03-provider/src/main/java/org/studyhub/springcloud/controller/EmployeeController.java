package org.studyhub.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.studyhub.springcloud.entity.Employee;
import org.studyhub.springcloud.utils.ResultEntity;

/**
 * @author haoren
 * @create 2020-12-15 10:37
 */

@RestController
public class EmployeeController {

    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployee() {

        return new Employee(555, "tom555", 555.5);
    }

    @RequestMapping("/provider/get/employee/by/id")
    public Employee getEmployeeById(@RequestParam("empId") Integer empId) {
        return new Employee(empId, "tom999-", 999.99);
    }

    @HystrixCommand(fallbackMethod = "getEmpBackup")
    @RequestMapping("/provider/circuit/breaker/get/emp")
    public ResultEntity<Employee> getEmp(@RequestParam("signal") String signal) throws InterruptedException {
        //满足条件熔断
        if("bang".equals(signal)) {
            throw new RuntimeException();
        }
        //超时熔断
        if ("slow".equals(signal)) {
            Thread.sleep(3000);
        }
        return ResultEntity.successWithData(new Employee(666, "sam666", 666.66));
    }

    public ResultEntity<Employee> getEmpBackup(@RequestParam("signal") String signal) {
        return ResultEntity.failed("circuit break workded,with signal="+signal);
    }

}
