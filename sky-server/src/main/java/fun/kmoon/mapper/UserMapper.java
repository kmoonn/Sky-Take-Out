package fun.kmoon.mapper;

import fun.kmoon.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(Long id);
}
