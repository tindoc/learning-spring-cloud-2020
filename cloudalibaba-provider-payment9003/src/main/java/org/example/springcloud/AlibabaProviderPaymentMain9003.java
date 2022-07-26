package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaProviderPaymentMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaProviderPaymentMain9003.class, args);
    }
}