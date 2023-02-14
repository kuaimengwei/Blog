package com.Blog.service;

import com.Blog.pojo.Users;
import com.Blog.pojo.UsersExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int insert(Users user);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

}
