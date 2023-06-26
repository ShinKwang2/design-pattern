package com.lightshoes.enjong.abstractfactory.factory;

import com.lightshoes.enjong.abstractfactory.domain.product.dao.ProductDao;
import com.lightshoes.enjong.abstractfactory.domain.product.dao.mysql.ProductMySqlDao;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.UserInfoDao;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.mysql.UserInfoMySqlDao;

public class MySqlDaoFactory extends DaoFactory {

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
