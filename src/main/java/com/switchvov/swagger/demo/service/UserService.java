package com.switchvov.swagger.demo.service;

import com.switchvov.swagger.demo.repository.entity.User;

/**
 * 用户Service接口
 *
 * @author Switch
 * @date 2018-04-04
 */
public interface UserService {
    /**
     * 通过ID获取用户对象
     *
     * @param id 用户ID
     * @return 用户对象
     */
    User getById(Integer id);

    User createUser(User user);
}
