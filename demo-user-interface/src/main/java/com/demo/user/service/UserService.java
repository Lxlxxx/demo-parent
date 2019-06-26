package com.demo.user.service;
import com.demo.pojo.TbUser;
import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    public List<TbUser> findUserList();

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    public TbUser findUser(String username);

    /**
     * 通过年龄段查询用户
     * @param start
     * @param end
     * @return
     */
    public List<TbUser> findUsersByAge(Integer start,Integer end);
}
