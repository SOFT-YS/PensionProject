package com.pension.pro.service.impl;

import com.pension.pro.entity.User;
import com.pension.pro.dao.UserDao;
import com.pension.pro.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pension.pro.utils.MassageJson;
import com.pension.pro.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YU
 * @since 2022-04-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {


    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public User findUserId(Integer id) {
        return userDao.findUserId(id);
    }

    @Override
    public List<User> findUserList(Integer curr_page, Integer page_size, String user_name, String user_phone) {
        //计算偏移量 = (当前页-1)*每页显示条数
        Integer pyl = (curr_page-1)*page_size;
        return userDao.findUserList(pyl,page_size,user_name,user_phone);
    }

    @Override
    public Integer findUserListCount(String user_name, String user_phone) {
        return userDao.findUserListCount(user_name,user_phone);
    }

    @Override
    public MassageJson<String> login(String uname, String upwd) {

        /*   String pwd = "";
        try {
            pwd =  MD5.getEncryptedPwd(upwd);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        //调用dao层  获得登录对象
        User user = userDao.login(uname,upwd);

        if(user!=null){
            /*
                1. 获得时间戳
                2. UUID
                3.JWT

                4.sha256   md5    123456
                5.加密+加盐
             */
            String token = UUID.randomUUID().toString().replace("-","");
            redisUtil.setStrJson("login:"+token,user,null);

            return  new MassageJson<String>(200,"登录成功",token);

        }else{
            //登录失败
            return  new MassageJson<String>(250,"登录失败",null);
        }
    }







}
