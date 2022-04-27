package com.pension.pro.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pension.pro.dao.UserDao;
import com.pension.pro.entity.User;
import com.pension.pro.service.UserService;


import com.pension.pro.utils.MassageJson;
import com.pension.pro.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YU
 * @since 2022-04-25
 */
@RestController
@Controller
@RequestMapping("/pro/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisUtil redisUtil;





    @RequestMapping("/mohu")
    @ResponseBody
    public List<User> testmohu(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();

        queryWrapper.eq("user_id","1");
        List<User> smbmsUsers = userDao.selectList(queryWrapper);
        return smbmsUsers;

    }

    @RequestMapping("/findUserId/{id}")
    public String findUserId(@PathVariable("id") Integer id, Model model){

        Model user = model.addAttribute("user", userService.findUserId(id));
        return user.toString();
    }

    @PostMapping("/login")
    public MassageJson<String> login(String uname,String upwd){
        return userService.login(uname,upwd);
    }


    @GetMapping("/menu")
    public MassageJson<String> menu(){
        System.out.println("进来了menu");
        return  new MassageJson<String>(200,"请求成功","模拟数据");
    }
    @GetMapping("/info")
    public MassageJson<String> info(){
        System.out.println("进来了info");
        return  new MassageJson<String>(200,"请求成功","模拟数据");
    }
    @GetMapping("/list")
    public MassageJson<String> list(){
        System.out.println("进来了list");
        return  new MassageJson<String>(200,"请求成功","模拟数据");
    }





}
