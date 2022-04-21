package com.examplethree;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class BootTwoApplication {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =  SpringApplication.run(BootTwoApplication.class, args);
//        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(BootTwoApplication.class).headless(false).run(args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String port = environment.getProperty("server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        contextPath = contextPath == null ? "" : contextPath;
        String url = "http://localhost:" + port + contextPath;
        System.out.println("url:" + url);
//        createAndStartGUI();

    }

//    private static void createAndStartGUI() {
//        PlayGUI gui = new PlayGUI();
//        gui.addActionListener(gui.getButton1());
//        JFrame frame = new JFrame("PlayGUI");
//        frame.setContentPane(gui.getPanel());
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }

}
