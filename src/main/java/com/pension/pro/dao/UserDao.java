package com.pension.pro.dao;

import com.pension.pro.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YU
 * @since 2022-04-25
 */
public interface UserDao extends BaseMapper<User> {

    public User findUserId (Integer id);

    @Select("select * from p_user where user_name=#{uname} and user_age=#{upwd}")
    public User login(@Param("uname")String uname,@Param("upwd") String upwd);

}
