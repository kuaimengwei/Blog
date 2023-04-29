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
        logger.info("UsersController/insert --> user"+ user);
        return userService.insert(user);
    }

    @GetMapping("/selectById")
    @ApiOperation("示例查询")
    public Users selectById(Integer userid){
        if (userid != null){
            logger.info("UsersController/selectById -->userid"+userid);
            return userService.selectById(userid);
        }
        else {
            logger.info("UsersController/selectById -->userid为空");
            return null;
        }
    }

    @GetMapping("/countByExample")
    @ApiOperation("示例计数")
    public long countByExample(UsersExample example){
        return userService.countByExample(example);
    }

    @DeleteMapping("/deleteByExample")
    @ApiOperation("示例删除")
    public int deleteByExample(UsersExample example){
        return userService.deleteByExample(example);
    }


    @GetMapping("/insertSelective")
    @ApiOperation("示例插入")
    public int insertSelective(Users record){
        return userService.insertSelective(record);
    }


    @PutMapping("/updateByExampleSelective")
    @ApiOperation("示例更新条件")
    public int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example){
        return userService.updateByExampleSelective(record,example);
    }

    @PutMapping("/updateByExample")
    @ApiOperation("示例更新")
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example){
        return userService.updateByExample(record,example);
    }
}
