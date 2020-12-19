package org.studyhub.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author haoren
 * @create 2020-12-15 10:26
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer.class, args);
    }
}
