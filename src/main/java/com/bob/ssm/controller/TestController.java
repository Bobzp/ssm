package com.bob.ssm.controller;


import com.bob.ssm.service.TestService;
import com.bob.ssm.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/test.do")
public class TestController {
    @Autowired
    TestService service;
    @RequestMapping(params = "method=queryData")
    @ResponseBody
    public UserInfo queryData(int userId){
        return service.queryData(userId);
    }
    @RequestMapping(value = "/queryAllData")
    @ResponseBody
    public List<UserInfo> queryAllData(){
        return service.queryAllData();
    }
    @RequestMapping(value = "/getUserInfo")
    @ResponseBody
    public List<Map<String,Object>> getUserInfo(){
        return service.getUserInfo();
    }
    @RequestMapping(value = "/getUserInfoOne")
    @ResponseBody
    public Map<String,Object> getUserInfoOne(){
        return service.getUserInfoOne();
    }

}
