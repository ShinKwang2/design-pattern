package com.lightshoes.enjong.abstractfactory.client;

import com.lightshoes.enjong.abstractfactory.domain.product.Product;
import com.lightshoes.enjong.abstractfactory.domain.product.dao.ProductDao;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.UserInfo;
import com.lightshoes.enjong.abstractfactory.domain.userinfo.dao.UserInfoDao;
import com.lightshoes.enjong.abstractfactory.factory.DaoFactory;
import com.lightshoes.enjong.abstractfactory.factory.MySqlDaoFactory;
import com.lightshoes.enjong.abstractfactory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/db.properties");

        Properties prop = new Properties();
        prop.load(fileInputStream);

        String dbType = prop.getProperty("DB_TYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("100");
        userInfo.setUserName("sklee0206");
        userInfo.setPassword("****");

        Product product = new Product();
        product.setProductId("A-001");
        product.setProductName("로보트");

        DaoFactory daoFactory = null;
        UserInfoDao userInfoDao = null;
        ProductDao productDao = null;

        if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        }
        else if (dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        }
        else {
            System.out.println("DB support error");
            return;
        }

        userInfoDao = daoFactory.createUserInfoDao();
        productDao = daoFactory.createProductDao();

        System.out.println("=== USERINFO TRANSACTION ===");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        System.out.println("=== PRODUCT TRANSACTION ===");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);
    }


}
