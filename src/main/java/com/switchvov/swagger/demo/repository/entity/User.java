package com.switchvov.swagger.demo.repository.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Null;

/**
 * 用户类
 *
 * @author Switch
 * @date 2018-04-04
 */
@Data
@Entity(name = "users")
@ApiModel(description = "用户Model")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Null(message = "id必须为空")
    @ApiModelProperty(value = "用户ID", name = "id")
    private Integer id;

    @Column
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", name = "username", required = true, example = "zhaoliu")
    private String username;

    @Column
    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(value = "密码", name = "password", required = true, example = "123456")
    private String password;

}
