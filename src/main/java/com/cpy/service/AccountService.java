package com.cpy.service;

import com.cpy.domain.Account;

import java.util.List;

/**
 * @author 93404
 * @version 1.0
 * @description: TODO
 * @date 21/01/29 11:35
 */
public interface AccountService {
    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
