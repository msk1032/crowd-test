package org.studyhub.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author haoren
 * @create 2020-12-15 11:23
 */

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEureka {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka.class, args);
    }
}
