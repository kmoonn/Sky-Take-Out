package fun.kmoon.controller.admin;

import fun.kmoon.entity.Category;
import fun.kmoon.result.Result;
import fun.kmoon.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询分类列表
     */
    @GetMapping("/list")
    public Result<List<Category>> list(Category category) {
        List<Category> categories = categoryService.list(category);
        return Result.success(categories);
    }

    /**
     * 根据id查询分类
     */
    @Operation(summary = "查询分类", description = "根据id查询分类信息")
    @GetMapping("/{id}")
    public Result<Category> getById(@PathVariable Long id) {
        Category category = categoryService.getById(id);
        return Result.success(category);
    }

    /**
     * 新增分类
     */
    @PostMapping
    public Result<String> insert(@RequestBody Category category) {
        categoryService.insert(category);
        return Result.success("新增成功");
    }

    /**
     * 更新分类
     */
    @PutMapping("/{id}")
    public Result<String> update(@PathVariable Long id, @RequestBody Category category) {
        categoryService.update(id, category);
        return Result.success("更新成功");
    }

    /**
     * 删除分类
     */
    @DeleteMapping("/{id}")
    public Result<String> delete(@PathVariable Long id) {
        categoryService.delete(id);
        return Result.success("删除成功");
    }
}
