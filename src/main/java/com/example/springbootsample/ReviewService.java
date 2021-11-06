package com.example.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

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

    @Bean
    public Supplier<String> myPublisher() {
        return () -> new Date().toString();
    }

    @Bean
    public Consumer<String> mySubscriber() {
        return s -> System.out.println("ML RECEIVED: " + s);
    }
}
