package org.studyhub.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author haoren
 * @create 2020-12-15 10:40
 */

@Configuration
public class StudyhubConfig {

    @Bean
    @LoadBalanced//使用ribbon
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }
}
