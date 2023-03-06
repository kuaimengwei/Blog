package com.Blog.service.impl;

import com.Blog.dao.UsersMapper;
import com.Blog.pojo.Users;
import com.Blog.pojo.UsersExample;
import com.Blog.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2023/2/7
 */
@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class);
    //构造器注入UserMapper
    private final UsersMapper usersMapper;
    public UserServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(Users user) {
        //获取系统当前时间
        //TimeStamp timeStamp=new TimeStamp(new Date.getTime)
        Date date=new Date();
        user.setCreateTime(date);
        logger.info("UserServiceImpl --> user"+ user);
        return usersMapper.insert(user);
    }

    @Override
    public long countByExample(UsersExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UsersExample example) {
        return 0;
    }


    @Override
    public int insertSelective(Users record) {
        return 0;
    }

    @Override
    public Users selectById(Integer userid) {
        logger.info("UserServiceImpl/selectById -->userid:"+userid);
        Users users = usersMapper.selectById(userid);
        logger.info("usersMapper.selectById -->"+users);
        return users;
    }

    @Override
    public int updateByExampleSelective(Users record, UsersExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Users record, UsersExample example) {
        return 0;
    }
}
