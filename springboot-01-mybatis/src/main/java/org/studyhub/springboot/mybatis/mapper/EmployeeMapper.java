package org.studyhub.springboot.mybatis.mapper;

import org.springframework.stereotype.Repository;
import org.studyhub.springboot.mybatis.entity.Employee;

import java.util.List;

/**
 * @author haoren
 * @create 2020-12-14 17:03
 */

@Repository
public interface EmployeeMapper {

    List<Employee> getAllEmp();
}
