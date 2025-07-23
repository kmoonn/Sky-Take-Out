package fun.kmoon.mapper;

import fun.kmoon.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {

    /**
     * 查询分类列表
     */
    List<Category> list(Category category);

    /**
     * 分页查询分类列表
     */
    List<Category> listPage(@Param("category") Category category, @Param("page") Integer page, @Param("pageSize") Integer pageSize);

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
    void update(@Param("categoryId") Long categoryId, @Param("category") Category category);

    /**
     * 删除分类
     */
    void delete(Long id);
}
