package com.cpy.service.impl;

import com.cpy.dao.AccountDao;
import com.cpy.domain.Account;
import com.cpy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 93404
 * @version 1.0
 * @description: TODO
 * @date 21/01/29 11:35
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户信息");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息");
        accountDao.saveAccount(account);
    }
}
