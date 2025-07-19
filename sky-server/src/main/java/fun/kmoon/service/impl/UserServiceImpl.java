package fun.kmoon.service.impl;

import fun.kmoon.entity.User;
import fun.kmoon.mapper.UserMapper;
import fun.kmoon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
