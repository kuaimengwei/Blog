package com.Blog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Users implements Serializable {

    @ApiModelProperty(value="用户id",name="userId")
    private Long userId;

    @ApiModelProperty(value="用户名",name="userName")
    private String userName;

    @ApiModelProperty(value="密码",name="pwd")
    private String pwd;

    @ApiModelProperty(value="用户昵称",name="")
    private String userNickname;

    @ApiModelProperty(value="用户邮箱",name="email")
    private String email;

    @ApiModelProperty(value="用户头像",name="avatar")
    private String avatar;

    @ApiModelProperty(value="用户生日",name="birthday")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date birthday;

    @ApiModelProperty(value="用户年龄",name="age")
    private String age;

    @ApiModelProperty(value="用户手机号",name="moblePhone")
    private String moblePhone;

    @ApiModelProperty(value="注册时间",name="createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}