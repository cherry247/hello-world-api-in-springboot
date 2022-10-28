package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @RequestMapping("/books")
    public List<Books> retrieveAllData()
    {
        return Arrays.asList(
            new Books(1,"cosmos","carl sagan")
        );
    }
}
