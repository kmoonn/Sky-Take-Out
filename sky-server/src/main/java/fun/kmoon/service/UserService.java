package fun.kmoon.service;

import fun.kmoon.entity.User;

public interface UserService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getById(Long id);
}
