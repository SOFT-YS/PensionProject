package com.pension.pro.service;

import com.pension.pro.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pension.pro.utils.MassageJson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YU
 * @since 2022-04-25
 */
public interface UserService extends IService<User> {
    /**
     * 通过id获得用户信息
     * @param id
     * @return
     */
    public User findUserId (Integer id);


    /**
     * 翻页查询信息
     * @param curr_page
     * @param page_size
     * @param user_name
     * @param user_phone
     * @return
     */
    public List<User> findUserList(
            Integer curr_page, Integer page_size, String user_name, String user_phone
    );


    /**
     * 获得总条数
     * @param user_name
     * @param user_phone
     * @return
     */
    public Integer findUserListCount(String user_name,String user_phone);





    public MassageJson<String> login(String uname, String upwd);
}
