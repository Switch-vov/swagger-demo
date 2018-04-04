package com.switchvov.swagger.demo.controller;

import com.switchvov.swagger.demo.repository.entity.User;
import com.switchvov.swagger.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 *
 * @author Switch
 * @date 2018-04-04
 */
@RestController
@RequestMapping(value = "/user", produces = "application/json")
@Api(value = "User", tags = {"User"}, description = "用户相关")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ApiOperation(value = "使用ID查询用户", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数有误"),
            @ApiResponse(code = 401, message = "未授权"),
            @ApiResponse(code = 403, message = "禁止访问"),
            @ApiResponse(code = 404, message = "请求路径不存在"),
            @ApiResponse(code = 500, message = "服务器内部错误")
    })
    public User getById(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @PostMapping("/")
    public User createUser(@Validated User user) {
        return userService.createUser(user);
    }
}
