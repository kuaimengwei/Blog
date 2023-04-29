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

    @Override//插入
    public int insert(Users user) {
        logger.info("UserServiceImpl --> insert");
        //获取系统当前时间
        //TimeStamp timeStamp=new TimeStamp(new Date.getTime)
        Date date=new Date();
        user.setCreateTime(date);
        logger.info("UserServiceImpl --> user"+ user);
        return usersMapper.insert(user);
    }

    @Override//按示例计数
    public long countByExample(UsersExample example) {
        logger.info("UserServiceImpl --> countByExample");
        long countByExample = usersMapper.countByExample(example);
        logger.info("UserServiceImpl --> countByExample:"+ countByExample);
        return countByExample;
    }

    @Override//按示例删除
    public int deleteByExample(UsersExample example) {
        logger.info("UserServiceImpl --> deleteByExample");
        return usersMapper.deleteByExample(example);
    }


    @Override//选择性插入
    public int insertSelective(Users users) {
        logger.info("UserServiceImpl --> insertSelective");
        return usersMapper.insertSelective(users);
    }

    @Override//根据id查询
    public Users selectById(Integer userid) {
        logger.info("UserServiceImpl --> selectById -->userid:"+userid);
        Users users = usersMapper.selectById(userid);
        logger.info("usersMapper.selectById -->"+users);
        return users;
    }

    @Override//按示例选择性更新
    public int updateByExampleSelective(Users record, UsersExample example) {
        logger.info("UserServiceImpl --> updateByExampleSelective");
        return usersMapper.updateByExampleSelective(record,example);
    }

    @Override //按示例更新
    public int updateByExample(Users record, UsersExample example) {
        logger.info("UserServiceImpl --> updateByExample");
        return usersMapper.updateByExample(record,example);
    }
}
