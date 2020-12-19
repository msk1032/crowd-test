package org.studyhub.springboot.mybatis.test;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.studyhub.springboot.mybatis.entity.Employee;
import org.studyhub.springboot.mybatis.mapper.EmployeeMapper;

import java.util.List;

@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    private Logger logger  = LoggerFactory.getLogger(MybatisApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelect() {

        List<Employee> allEmp = employeeMapper.getAllEmp();

        for (Employee employee : allEmp) {
            logger.debug(employee.toString());
        }
    }

}
