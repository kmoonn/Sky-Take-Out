package fun.kmoon.service;

import fun.kmoon.dto.EmployeeLoginDTO;
import fun.kmoon.entity.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询员工列表
     */
    List<Employee> list(Employee employee);

    /**
     * 根据id查询员工
     */
    Employee getById(Long id);

    /**
     * 条件查询员工
     */
    Employee select(Employee employee);

    /**
     * 新增员工
     */
    void insert(Employee employee);

    /**
     * 更新员工
     */
    void update(Long id, Employee employee);

    /**
     * 删除员工
     */
    void delete(Long id);
}
