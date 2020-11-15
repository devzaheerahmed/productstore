package com.store.productstore.repo;

import com.store.productstore.entity.AmazonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AmazonRepo extends JpaRepository <AmazonData, Integer> {
    //List<AmazonData> findByProductTitle(String productTitle);
}
