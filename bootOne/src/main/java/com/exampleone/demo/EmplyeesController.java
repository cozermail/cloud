package com.exampleone.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author：Cozer
 * @date：Created in 2021/7/31 18:10
 */
@RestController
public class EmplyeesController {

//    @Autowired
//    private RestTemplate template;

    @RequestMapping("/consumer")
    public String index() {
        return "hello.html";
//        return template.getForEntity("http://PEER1-1001/hello", String.class).getBody();
    }
}
