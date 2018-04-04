package com.switchvov.swagger.demo.environment;

import com.switchvov.swagger.demo.repository.dao.UserRepository;
import com.switchvov.swagger.demo.repository.entity.User;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore
public class H2DatabaseTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUser() {
        User user = userRepository.findOne(1);
        Assert.assertEquals("zhangsan", user.getUsername());
    }
}
