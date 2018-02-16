package com.steven.mall.dao;

import com.steven.mall.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    // 下面的方法，不是自动生成的
    // 检查用户是否存在
    int checkUsername(String username);

    //检查Email是否存在
    int checkEmail(String email);
}