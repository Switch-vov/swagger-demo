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

    /**
     * 创建用户
     *
     * @param user 用户对象
     * @return 保存后的用户对象
     */
    User createUser(User user);
}
