package com.pension.pro.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pension.pro.dao.UserDao;
import com.pension.pro.entity.User;
import com.pension.pro.service.UserService;


import com.pension.pro.utils.JsonMassage;
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


    @RequestMapping(value = "/findUserList",method = RequestMethod.GET)
    @ResponseBody
    public JsonMassage<List<User>> findUserList(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "limit",defaultValue = "10") Integer limit,
            String user_name,
            String user_phone
    ){
        List<User> list = userService.findUserList(page, limit, user_name, user_phone);
        Integer count = userService.findUserListCount(user_name,user_phone);

        JsonMassage<List<User>> jsonMassage = new JsonMassage<List<User>>();
        jsonMassage.setCode(0);
        jsonMassage.setMsg("请求成功");
        jsonMassage.setCount(count);
        jsonMassage.setData(list);
        return jsonMassage;
    }


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




}
