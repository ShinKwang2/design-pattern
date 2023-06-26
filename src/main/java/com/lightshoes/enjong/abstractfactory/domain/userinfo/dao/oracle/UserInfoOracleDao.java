package com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.oracle;

import com.lightshoes.enjong.abstractfactory.domain.userinfo.UserInfo;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle DB userId - " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from Oracle DB userId - " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Oracle DB userId - " + userInfo.getUserId());
    }
}
