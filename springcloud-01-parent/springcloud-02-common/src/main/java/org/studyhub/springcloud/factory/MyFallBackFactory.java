package org.studyhub.springcloud.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.studyhub.springcloud.api.EmployeeRemoteService;
import org.studyhub.springcloud.entity.Employee;
import org.studyhub.springcloud.utils.ResultEntity;

/**
 * 实现consumer端降级功能
 * 实现FallbackFactory接口时要传入@FeignClient注解标记的接口类型
 * @author haoren
 * @create 2020-12-15 20:05
 */
//这个类必须使用@Component注解将当前类的对象加入IOC容器，当然当前类必须能够被扫描到
@Component
public class MyFallBackFactory implements FallbackFactory<EmployeeRemoteService> {
    @Override
    public EmployeeRemoteService create(Throwable throwable) {
        return new EmployeeRemoteService() {
            @Override
            public Employee getEmployeeRemote() {
                return new Employee(null, "consumer降级",99999999.9);
            }

            @Override
            public Employee getEmployeeById(Integer empId) {
                return null;
            }

            @Override
            public ResultEntity<Employee> getEmp(String signal) {
                return ResultEntity.failed("降级机制生效：" + throwable.getMessage());
            }
        };
    }
}
