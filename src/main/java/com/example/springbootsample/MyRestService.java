package com.example.springbootsample;

import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestService {
    @GetMapping(value = "/my-resource", produces = "application/json")
    List<Resource> listResources() {
        return new ArrayList<>(1);
    }
}
