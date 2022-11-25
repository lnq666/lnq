package com.lnq.service;

import com.lnq.entity.User;

import java.io.IOException;

public interface UserService {
    /**
     * 用户登录
     * @param user
     * @return
     * @throws IOException
     */
    User login(User user) throws IOException;
}
