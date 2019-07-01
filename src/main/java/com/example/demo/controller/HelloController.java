package com.example.demo.controller;

import com.example.demo.dao.AccountMapper;
import com.example.demo.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lsjie on 2019/6/25.
 */
//@RestController/* @Controller + @ResponseBody*/
@Controller
public class HelloController {
    @Autowired
    private AccountMapper accountMapper;

    /*@RequestMapping(value="/hello",method = RequestMethod.GET)
    public String say(){
        return "hello springboot";
    }*/

    //要用RestController注解才能查到
    @RequestMapping(value="/selectAccount",method = RequestMethod.GET)
    public List<Account> selectAccount(){
        return accountMapper.selectAll();
    }

    @RequestMapping("/")
    public String login123(HttpServletRequest req){
        req.setAttribute("name","123");
        return "/index";
    }

}
