package com.store.productstore.services;

import com.store.productstore.entity.AmazonData;
import com.store.productstore.repo.AmazonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmazonDataService implements AmazonDataSL {

    AmazonRepo amazonrepo;
    @Autowired
    public AmazonDataService (AmazonRepo amazonrepo) {
        this.amazonrepo=amazonrepo;
    }

    @Override
    public List<AmazonData> getAllData() {
        return amazonrepo.findAll();
    }

    @Override
    public Optional<AmazonData> findById(int id) {
        return amazonrepo.findById(id);
    }

    /*@Override
    public List<AmazonData> findByProductTitle(String productTitle) {
        return amazonrepo.findByProductTitle(productTitle);
    }*/

    @Override
    public AmazonData save (AmazonData amazondata) {
        return amazonrepo.save(amazondata);
    }

    @Override
    public void deleteById(int id) {
        amazonrepo.deleteById(id);
    }
}
