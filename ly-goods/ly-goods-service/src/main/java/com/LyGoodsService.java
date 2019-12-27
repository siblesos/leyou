package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName LyGoodsService
 * @Description: TODO
 * @Author 丁强
 * @Date 2019/12/25
 * @Version V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class LyGoodsService {
    public static void main(String[] args) {
        SpringApplication.run(LyGoodsService.class, args);
    }
}
