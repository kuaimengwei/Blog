package com.Blog.controller;

import com.Blog.pojo.Users;
import com.Blog.pojo.UsersExample;
import com.Blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.apache.log4j.Logger;


/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2023/2/7
 */

@Api(tags = "用户接口")
@RequestMapping("/users")
@RestController
public class UsersController {
    private static Logger logger = Logger.getLogger(UsersController.class);
    private final UserService userService;
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/insert")
    @ApiOperation("添加用户")
    public int insert(Users user){
        logger.info("UsersController --> user"+ user);
        return userService.insert(user);
    }

    @GetMapping("/selectByExample")
    @ApiOperation("示例查询")
    public List<Users> selectByExample(UsersExample example){
        return userService.selectByExample(example);
    }

    @GetMapping("/countByExample")
    @ApiOperation("示例计数")
    public long countByExample(UsersExample example){
        return 0;
    }

    @DeleteMapping("/deleteByExample")
    @ApiOperation("示例删除")
    public int deleteByExample(UsersExample example){
        return 0;
    }


    @GetMapping("/insertSelective")
    @ApiOperation("示例插入")
    public int insertSelective(Users record){
        return 0;
    }


    @PutMapping("/updateByExampleSelective")
    @ApiOperation("示例更新条件")
    public int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example){
        return 0;
    }

    @PutMapping("/updateByExample")
    @ApiOperation("示例更新")
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example){
        return 0;
    }
}
