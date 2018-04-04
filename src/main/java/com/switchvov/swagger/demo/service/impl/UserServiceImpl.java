package com.switchvov.swagger.demo.service.impl;

import com.switchvov.swagger.demo.repository.dao.UserRepository;
import com.switchvov.swagger.demo.repository.entity.User;
import com.switchvov.swagger.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service实现类
 *
 * @author Switch
 * @date 2018-04-04
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Integer id) {
        User user = userRepository.findOne(id);
        LOGGER.debug("ID为：{}，查询用户结果为：{}", id, user);
        return user;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
