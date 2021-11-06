package com.example.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;

public class ReviewService {
    private final ReviewRepository repository;

    @Autowired
    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }

    public void someMethod() {
        //repository.save(entity);
        //repository.delete(entity);
        //repository.findByProductId(productId);
    }
}
