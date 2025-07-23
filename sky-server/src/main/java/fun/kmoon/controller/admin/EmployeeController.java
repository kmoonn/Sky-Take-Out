package fun.kmoon.controller.admin;

import fun.kmoon.entity.Employee;
import fun.kmoon.result.Result;
import fun.kmoon.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/employees")
@Tag(name = "员工管理")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询员工列表
     */
    @Operation(summary = "查询员工列表", description = "根据条件查询员工列表")
    @GetMapping("/list")
    public Result<List<Employee>> list(Employee employee) {
        List<Employee> employees = employeeService.list(employee);
        return Result.success(employees);
    }

    /**
     * 根据id查询员工
     */
    @Operation(summary = "查询员工", description = "根据id查询员工信息")
    @GetMapping("/{employeeId}")
    public Result<Employee> getById(@PathVariable Long employeeId) {
        Employee employee = employeeService.getById(employeeId);
        return Result.success(employee);
    }

    /**
     * 新增员工
     */
    @Operation(summary = "新增员工", description = "根据员工信息新增员工")
    @PostMapping
    public Result<String> insert(@RequestBody Employee employee) {
        employeeService.insert(employee);
        return Result.success();
    }

    /**
     * 更新员工
     */
    @Operation(summary = "更新员工", description = "根据id和员工信息更新员工")
    @PutMapping("/{employeeId}")
    public Result<String> update(@PathVariable Long employeeId, @RequestBody Employee employee) {
        employeeService.update(employeeId, employee);
        return Result.success();
    }

    /**
     * 删除员工
     */
    @Operation(summary = "删除员工", description = "根据id删除员工")
    @DeleteMapping("/{employeeId}")
    public Result<String> delete(@PathVariable Long employeeId) {
        employeeService.delete(employeeId);
        return Result.success();
    }
}
