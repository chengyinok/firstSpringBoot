package com.study.first.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.study.first.user.dao.UserDao;
import com.study.first.user.entity.User;
import com.study.first.user.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements IUserService {
}
