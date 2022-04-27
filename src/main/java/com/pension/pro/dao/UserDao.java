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



    @Select("select * from p_user where user_name=#{uname} and user_age=#{upwd}")
    public User login(@Param("uname")String uname,@Param("upwd") String upwd);


    /**
     * 翻译查询用户信息
     * @param pyl
     * @param page_size
     * @param user_name
     * @param user_phone
     * @return
     */
    public List<User> findUserList(
            @Param("pyl") Integer pyl,
            @Param("page_size") Integer page_size,
            @Param("user_name")String user_name,
            @Param("user_phone")String user_phone
    );

    /**
     * 获得总条数
     * @param user_name
     * @param user_phone
     * @return
     */
    public Integer findUserListCount(
            @Param("user_name")String user_name,
            @Param("user_phone")String user_phone
    );

    /**
     * 通过ID获得用户信息
     * @param id
     * @return
     */
    public User findUserId (Integer id);




}
