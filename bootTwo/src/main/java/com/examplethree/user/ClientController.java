package com.examplethree.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author：Cozer
 * @date：Created in 2021/7/30 15:44
 */
@RestController
public class ClientController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/client")
    public String client() {
        System.out.println("client");
        // 通过ip+端口号调用
//        String url = "http://localhost:8001/hello";
        // 通过注册中心调用
        // 该方法走eureka注册中心调用(去注册中心根据app-item查找服务，这种方式必须先开启负载均衡@LoadBalanced)
        String url = "http://eureka-discovery/discovery";
        return restTemplate.getForObject(url, String.class);
//        return "client";
    }

}
