package com.yh.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.yh.common.security.annotation.EnableCustomConfig;
import com.yh.common.security.annotation.EnableRyFeignClients;
import com.yh.common.security.annotation.EnableRyResourceServer;
import com.yh.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 *
 * @author 洋芋-Sir
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@EnableRyResourceServer
@SpringCloudApplication
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
