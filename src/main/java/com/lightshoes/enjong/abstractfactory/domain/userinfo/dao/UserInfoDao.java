package com.lightshoes.enjong.abstractfactory.domain.userinfo.dao;

import com.lightshoes.enjong.abstractfactory.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
}
