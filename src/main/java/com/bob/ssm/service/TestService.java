package com.bob.ssm.service;

import com.bob.ssm.dao.TestDao;
import com.bob.ssm.event.BlackListEvent;
import com.bob.ssm.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TestService  {
    @Autowired
    private TestDao dao;
    @Autowired
    private ApplicationEventPublisher publisher;
    public UserInfo queryData(int userId) {
        UserInfo user = this.dao.getUserById(1);
        BlackListEvent event = new BlackListEvent(userId);
        publisher.publishEvent(event);
        return user;
    }
    public List<UserInfo> queryAllData() {

        List<UserInfo> user = this.dao.getAllUser();
        return user;
    }
    public List<Map<String,Object>> getUserInfo(){
        List<Map<String,Object>> userInfo = dao.getUserInfo();
        return userInfo;
    }

    public Map<String,Object> getUserInfoOne() {
        Map<String,Object> userInfo = dao.getUserInfoOne();
        return userInfo;
    }



}
