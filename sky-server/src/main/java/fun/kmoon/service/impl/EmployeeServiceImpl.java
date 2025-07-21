package fun.kmoon.service.impl;

import fun.kmoon.constant.StatusConstant;
import fun.kmoon.entity.Employee;
import fun.kmoon.mapper.EmployeeMapper;
import fun.kmoon.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询员工列表
     */
    @Override
    public List<Employee> list(Employee employee) {
        return employeeMapper.list(employee);
    }

    /**
     * 根据id查询员工
     */
    @Override
    public Employee getById(Long id) {
        return employeeMapper.getById(id);
    }

    /**
     * 新增员工
     */
    @Override
    public void insert(Employee employee) {
        employee.setStatus(StatusConstant.ENABLE);
        employee.setCreateUser(1L);
        employeeMapper.insert(employee);
    }

    /**
     * 更新员工
     */
    @Override
    public void update(Long id, Employee employee) {
        employee.setUpdateUser(1L);
        employeeMapper.update(id, employee);
    }

    /**
     * 删除员工
     */
    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
    }
}
