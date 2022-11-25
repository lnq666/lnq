package com.lnq.service.impl;

import com.lnq.entity.User;
import com.lnq.mapper.UserMapper;
import com.lnq.service.UserService;
import com.lnq.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

public class UserServiceImpl implements UserService {

    /**
     * 用户登录
     * @param user
     * @return
     * @throws IOException
     */
    public User login(User user) throws IOException {
        //1 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //4 调用方法
        User user1 = userMapper.findByNameAndPwd(user);
        return user1;

    }
}
