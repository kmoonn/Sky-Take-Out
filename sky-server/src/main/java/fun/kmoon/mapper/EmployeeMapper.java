package fun.kmoon.mapper;

import fun.kmoon.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 查询员工列表
     */
    List<Employee> list(Employee employee);

    /**
     * 根据id查询员工
     */
    Employee getById(Long id);

    /**
     * 新增员工
     */
    void insert(Employee employee);

    /**
     * 更新员工
     */
    void update(@Param("id") Long id, @Param("employee") Employee employee);

    /**
     * 删除员工
     */
    void delete(Long id);
}
