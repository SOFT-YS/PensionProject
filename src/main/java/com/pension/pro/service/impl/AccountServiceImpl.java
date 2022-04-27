package com.pension.pro.service.impl;

import com.pension.pro.entity.Account;
import com.pension.pro.dao.AccountDao;
import com.pension.pro.service.AccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {

}
