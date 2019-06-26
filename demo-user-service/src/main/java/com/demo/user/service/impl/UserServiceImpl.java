package com.demo.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.mapper.TbUserMapper;
import com.demo.pojo.TbUser;
import com.demo.pojo.TbUserExample;
import com.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  TbUserMapper userMapper;
    @Override
    public List<TbUser> findUserList() {
        //传null就是查询所有
        List<TbUser> userList = userMapper.selectByExample(null);
        return userList;
    }
    @Override
    public TbUser findUser(String username) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<TbUser> userList = userMapper.selectByExample(example);
        //根据用户名查询出来肯定只有一条记录
        return userList.get(0);
    }
    @Override
    public List<TbUser> findUsersByAge(Integer start, Integer end) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        //添加年龄查询条件
        criteria.andAgeBetween(start,end);
        List<TbUser> userList = userMapper.selectByExample(example);
        return userList;
    }
}
