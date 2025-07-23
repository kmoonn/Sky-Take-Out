package fun.kmoon.controller.admin;

import fun.kmoon.entity.Category;
import fun.kmoon.result.Result;
import fun.kmoon.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/categories")
@Tag(name = "分类管理")
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询分类列表
     */
    @Operation(summary = "查询分类列表", description = "根据条件查询分类列表")
    @GetMapping("/list")
    public Result<List<Category>> list(Category category) {
        List<Category> categories = categoryService.list(category);
        return Result.success(categories);
    }

    /**
     * 分页查询分类列表
     */
    @Operation(summary = "分页查询分类列表", description = "根据条件分页查询分类列表")
    @GetMapping("/list/page")
    public Result<List<Category>> list(Category category,
                                       @RequestParam(defaultValue = "1") Integer page,
                                       @RequestParam(defaultValue = "10") Integer pageSize) {
        List<Category> categories = categoryService.list(category, page, pageSize);
        return Result.success(categories);
    }

    /**
     * 根据id查询分类
     */
    @Operation(summary = "查询分类", description = "根据id查询分类信息")
    @GetMapping("/{categoryId}")
    public Result<Category> getById(@PathVariable Long categoryId) {
        Category category = categoryService.getById(categoryId);
        return Result.success(category);
    }

    /**
     * 新增分类
     */
    @Operation(summary = "新增分类", description = "根据分类信息新增分类")
    @PostMapping
    public Result<String> insert(@RequestBody Category category) {
        categoryService.insert(category);
        return Result.success();
    }

    /**
     * 更新分类
     */
    @Operation(summary = "更新分类", description = "根据id和分类信息更新分类")
    @PutMapping("/{categoryId}")
    public Result<String> update(@PathVariable Long categoryId, @RequestBody Category category) {
        categoryService.update(categoryId, category);
        return Result.success();
    }

    /**
     * 删除分类
     */
    @Operation(summary = "删除分类", description = "根据id删除分类")
    @DeleteMapping("/{categoryId}")
    public Result<String> delete(@PathVariable Long categoryId) {
        categoryService.delete(categoryId);
        return Result.success();
    }
}
