package fun.kmoon.service.impl;

import fun.kmoon.constant.StatusConstant;
import fun.kmoon.entity.Category;
import fun.kmoon.mapper.CategoryMapper;
import fun.kmoon.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询分类列表
     */
    @Override
    public List<Category> list(Category category) {
        return categoryMapper.list(category);
    }
    
    /**
     * 分页查询分类列表
     */
    @Override
    public List<Category> list(Category category, Integer page, Integer pageSize) {
        return categoryMapper.listPage(category, page, pageSize);
    }

    /**
     * 根据id查询分类
     */
    @Override
    public Category getById(Long id) {
        return categoryMapper.getById(id);
    }

    /**
     * 新增分类
     */
    @Override
    public void insert(Category category) {
        category.setStatus(StatusConstant.ENABLE);
        category.setCreateUser(1L);
        categoryMapper.insert(category);
    }

    /**
     * 更新分类
     */
    @Override
    public void update(Long id, Category category) {
        category.setUpdateUser(1L);
        categoryMapper.update(id, category);
    }

    /**
     * 删除分类
     */
    @Override
    public void delete(Long id) {
        categoryMapper.delete(id);
    }
}
