package fun.kmoon.service;

import fun.kmoon.entity.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 查询分类列表
     */
    List<Category> list(Category category);

    /**
     * 根据id查询分类
     */
    Category getById(Long id);

    /**
     * 新增分类
     */
    void insert(Category category);

    /**
     * 更新分类
     */
    void update(Long id, Category category);

    /**
     * 删除分类
     */
    void delete(Long id);
}
