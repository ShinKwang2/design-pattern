package com.lightshoes.enjong.abstractfactory.factory;

import com.lightshoes.enjong.abstractfactory.domain.product.dao.ProductDao;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.UserInfoDao;

public abstract class DaoFactory {

    public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao();
}
