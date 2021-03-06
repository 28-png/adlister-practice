package com.practice.adlister.dao;


public class DaoFactory {
    private static Ads adsDao;
    private static Users userDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if(adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if(userDao == null) {
            userDao = new MySQLUsersDao(config);
        }
        return userDao;
    }
}
