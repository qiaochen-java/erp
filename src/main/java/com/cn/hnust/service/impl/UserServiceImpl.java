package com.cn.hnust.service.impl;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service;  
  

import com.cn.hnust.IDao.UserMapper;
import com.cn.hnust.domain.User;
import com.cn.hnust.service.IUserService;  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  