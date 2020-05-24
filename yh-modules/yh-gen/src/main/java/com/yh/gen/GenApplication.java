package com.yh.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.yh.common.security.annotation.EnableCustomConfig;
import com.yh.common.security.annotation.EnableRyFeignClients;
import com.yh.common.security.annotation.EnableRyResourceServer;
import com.yh.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 *
 * @author 洋芋-Sir
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@EnableRyResourceServer
@SpringCloudApplication
public class GenApplication {
    public static void main(String[] args) {
        SpringApplication.run(GenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
