package com.switchvov.swagger.demo.repository.dao;

import com.switchvov.swagger.demo.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户仓库
 *
 * @author Switch
 * @date 2018-04-04
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
