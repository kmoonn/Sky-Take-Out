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
     * 查询员工列表
     */
    @Override
    public List<Category> list(Category category) {
        return categoryMapper.list(category);
    }

    /**
     * 根据id查询员工
     */
    @Override
    public Category getById(Long id) {
        return categoryMapper.getById(id);
    }

    /**
     * 新增员工
     */
    @Override
    public void insert(Category category) {
        category.setStatus(StatusConstant.ENABLE);
        category.setCreateUser(1L);
        categoryMapper.insert(category);
    }

    /**
     * 更新员工
     */
    @Override
    public void update(Long id, Category category) {
        category.setUpdateUser(1L);
        categoryMapper.update(id, category);
    }

    /**
     * 删除员工
     */
    @Override
    public void delete(Long id) {
        categoryMapper.delete(id);
    }
}
