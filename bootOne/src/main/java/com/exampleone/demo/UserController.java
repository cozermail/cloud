package com.exampleone.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author：Cozer
 * @date：Created in 2021/7/31 18:09
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("index is called");
        return "hello";
    }
}
