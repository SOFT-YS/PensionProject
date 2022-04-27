package com.pension.pro.controller;

import com.pension.pro.dao.AdminDao;
import com.pension.pro.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/pro/admin")
public class AdminController {

    @Autowired
    private AdminDao adminDao;

    /**
     * 获得管理员集合
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        List<Admin> admins = adminDao.selectList(null);

        admins.forEach(System.out::println);

        System.out.println(admins.size());
        return "访问成功=="+admins.size();
    }




    @RequestMapping("/aa")
    public String aaa(){
        return "进入admin后台";
    }







}
