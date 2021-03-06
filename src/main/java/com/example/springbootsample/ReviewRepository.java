package com.example.springbootsample;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ReviewRepository extends CrudRepository<ReviewEntity, ReviewEntityPK> {
    Collection<ReviewEntity> findByProductId(int productId);
}
