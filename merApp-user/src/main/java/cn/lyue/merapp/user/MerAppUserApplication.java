package cn.lyue.merapp.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Liu Yue
 * @Version: 1.0
 * @Date: 2021/1/16 14:23
 * @Description: 入口启动
 **/
@Slf4j
@SpringBootApplication
public class MerAppUserApplication {
    /**
     * 注册中心启动项
     * @param args
     */
    public static void main(String[] args) {
        log.info("=======》启动用户中心 merApp-user 服务项目ing......");
        SpringApplication.run(MerAppUserApplication.class, args);
        log.info("=======》启动用户中心 merApp-user 服务项目成功......");
    }
}
