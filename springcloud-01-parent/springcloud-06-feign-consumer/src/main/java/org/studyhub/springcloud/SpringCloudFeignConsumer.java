package org.studyhub.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author haoren
 * @create 2020-12-15 13:25
 */

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudFeignConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignConsumer.class, args);
    }
}
