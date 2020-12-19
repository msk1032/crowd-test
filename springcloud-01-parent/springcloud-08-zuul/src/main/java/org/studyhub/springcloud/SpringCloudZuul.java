package org.studyhub.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author haoren
 * @create 2020-12-15 23:11
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZuul {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuul.class, args);
    }
}
