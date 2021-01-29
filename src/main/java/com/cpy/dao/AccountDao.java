package com.cpy.dao;

import com.cpy.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 93404
 * @version 1.0
 * @description: 账户Dao接口
 * @date 21/01/29 11:32
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有账户信息
     * @return
     */
    @Select("select * from account")
    public List<Account> finAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
