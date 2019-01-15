package com.chenkuo.ssoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author WYJ
 * @description SSO配置服务中心
 * @date 2018/12/5 17:08
 */
@SpringBootApplication
@EnableConfigServer
public class SsoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoConfigApplication.class, args);
    }
}
