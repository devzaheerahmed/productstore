package com.store.productstore.services;

import com.store.productstore.entity.AmazonData;
import java.util.List;
import java.util.Optional;

public interface AmazonDataSL {

    List<AmazonData> getAllData();
    Optional<AmazonData> findById(int id);
    //List<AmazonData> findByProductTitle(String productTitle);
    AmazonData save(AmazonData amazondata);
    void deleteById(int id);
}
