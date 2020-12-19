package org.studyhub.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author haoren
 * @create 2020-12-15 10:23
 */

@EnableCircuitBreaker//启用断路器功能
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudProvider {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider.class, args);
    }
}
