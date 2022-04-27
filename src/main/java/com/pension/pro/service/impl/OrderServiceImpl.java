package com.pension.pro.service.impl;

import com.pension.pro.entity.Order;
import com.pension.pro.dao.OrderDao;
import com.pension.pro.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YU
 * @since 2022-04-25
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

}
