package com.leo.moreMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ProjectName: moreMysql
 * @Package: com.leo.moreMysql.LeoMoreMysqlApplication
 * @ClassName: LeoMoreMysqlApplication
 * @Description: java类 启动类
 * @Author: liujm
 * @CreateDate: 20190319 10:24:46
 * @UpdateUser: 更新者
 * @UpdateDate: 20190319 10:24:46
 * @UpdateRemark: 无
 * @Version: 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigurationProperties
@EnableScheduling
public class LeoMoreMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeoMoreMysqlApplication.class, args);
	}

}
