package com.yh.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.yh.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 *
 * @author 洋芋-Sir
 */
@EnableRyFeignClients
@SpringCloudApplication
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
