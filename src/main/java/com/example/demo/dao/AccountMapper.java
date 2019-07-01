package com.example.demo.dao;

import com.example.demo.pojo.Account;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component //加了这个注解就不会报错
public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    List<Account> selectAll();

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}