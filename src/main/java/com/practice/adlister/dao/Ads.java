package com.practice.adlister.dao;

import com.practice.adlister.models.Ad;

import java.util.List;

public interface Ads {
    List<Ad> all();

    Long insert(Ad ad);

}
