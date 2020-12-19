package org.studyhub.springcloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.studyhub.springcloud.entity.Employee;
import org.studyhub.springcloud.factory.MyFallBackFactory;
import org.studyhub.springcloud.utils.ResultEntity;

/**
 *
 * @author haoren
 * @create 2020-12-15 13:13
 */
//@FeignClient注解表示当前接口和一个Provider对应
//注解中value属性指定要调用的Provider的微服务名称
@FeignClient(value = "org.studyhub.springcloud.spring-03-provider",
            //fallbackFactory属性指定Provider不可用时提供备用方案的工厂类型
            fallbackFactory = MyFallBackFactory.class)
public interface EmployeeRemoteService {

    @RequestMapping("/provider/get/employee/remote")
    Employee getEmployeeRemote();

    @RequestMapping("/provider/get/employee/by/id")
    Employee getEmployeeById(@RequestParam("empId") Integer empId);

    @RequestMapping("/provider/circuit/breaker/get/emp")
    ResultEntity<Employee> getEmp(@RequestParam("signal") String signal);
}
