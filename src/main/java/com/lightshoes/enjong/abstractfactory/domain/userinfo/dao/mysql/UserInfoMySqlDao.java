package com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.mysql;

import com.lightshoes.enjong.abstractfactory.domain.userinfo.UserInfo;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MySQL DB userId - " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MySQL DB userId - " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MySQL DB userId - " + userInfo.getUserId());
    }
}
