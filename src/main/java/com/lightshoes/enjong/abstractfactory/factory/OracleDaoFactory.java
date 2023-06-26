package com.lightshoes.enjong.abstractfactory.factory;

import com.lightshoes.enjong.abstractfactory.domain.product.dao.ProductDao;
import com.lightshoes.enjong.abstractfactory.domain.product.dao.oracle.ProductOracleDao;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.UserInfoDao;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory extends DaoFactory {

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
