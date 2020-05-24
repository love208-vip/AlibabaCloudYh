package com.yh.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.yh.common.security.annotation.EnableCustomConfig;
import com.yh.common.security.annotation.EnableRyFeignClients;
import com.yh.common.security.annotation.EnableRyResourceServer;
import com.yh.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 *
 * @author 洋芋-Sir
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@EnableRyResourceServer
@SpringCloudApplication
public class JobApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
