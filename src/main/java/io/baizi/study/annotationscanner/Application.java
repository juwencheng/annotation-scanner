package io.baizi.study.annotationscanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author juwencheng
 * @date 2020 2020/7/10 10:10 上午
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        UserModule userModule = applicationContext.getBean("userModule", UserModule.class);
        System.out.println(userModule);
        userModule.hello();
    }

}
