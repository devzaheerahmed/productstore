package com.store.productstore.repo;

import com.store.productstore.entity.AmazonData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AmazonRepo extends JpaRepository <AmazonData, Integer> {
    List <AmazonData> findByProductName(String productName);
}
