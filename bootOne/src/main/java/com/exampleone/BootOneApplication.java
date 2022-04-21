package com.exampleone;

import org.flowable.engine.RepositoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaServer
public class BootOneApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =  SpringApplication.run(BootOneApplication.class, args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String port = environment.getProperty("server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        contextPath = contextPath == null ? "" : contextPath;
        String url = "http://localhost:" + port + contextPath;
        System.out.println("url:" + url);
    }

}