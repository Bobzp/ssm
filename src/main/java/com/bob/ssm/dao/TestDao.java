package com.bob.ssm.dao;

import com.bob.ssm.vo.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public interface  TestDao {
    UserInfo getUserById(int userId);
    List<UserInfo> getAllUser();
    List<Map<String,Object>> getUserInfo();

    Map<String,Object> getUserInfoOne();
}
