package fun.kmoon.service.impl;

import fun.kmoon.dto.EmployeeDTO;
import fun.kmoon.entity.Employee;
import fun.kmoon.mapper.EmployeeMapper;
import fun.kmoon.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void insert(EmployeeDTO employeeDTO) {
        employeeMapper.insert(employeeDTO);
    }

    /**
     * 更新员工
     */
    @Override
    public void update(Long id, EmployeeDTO employeeDTO) {
        employeeMapper.update(id, employeeDTO);
    }

    /**
     * 删除员工
     */
    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
    }
}
