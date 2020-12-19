package org.studyhub.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author haoren
 * @create 2020-12-15 21:04
 */
//启用监控仪表盘功能
@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudDashboard {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDashboard.class, args);
    }
}
