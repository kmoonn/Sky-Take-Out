package fun.kmoon.controller.admin;

import fun.kmoon.entity.Employee;
import fun.kmoon.service.EmployeeService;
import fun.kmoon.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
@Tag(name = "员工管理")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询员工列表
     */
    @GetMapping("/list")
    public Result<List<Employee>> list(Employee employee) {
        List<Employee> employees = employeeService.list(employee);
        return Result.success(employees);
    }

    /**
     * 根据id查询员工
     */
    @Operation(summary = "查询员工", description = "根据id查询员工信息")
    @GetMapping("/{id}")
    public Result<Employee> getById(@PathVariable Long id) {
        Employee employee = employeeService.getById(id);
        return Result.success(employee);
    }

    /**
     * 新增员工
     */
    @PostMapping
    public Result<String> insert(@RequestBody Employee employee) {
        employeeService.insert(employee);
        return Result.success("新增成功");
    }

    /**
     * 更新员工
     */
    @PutMapping("/{id}")
    public Result<String> update(@PathVariable Long id, @RequestBody Employee employee) {
        employeeService.update(id, employee);
        return Result.success("更新成功");
    }

    /**
     * 删除员工
     */
    @DeleteMapping("/{id}")
    public Result<String> delete(@PathVariable Long id) {
        employeeService.delete(id);
        return Result.success("删除成功");
    }
}
