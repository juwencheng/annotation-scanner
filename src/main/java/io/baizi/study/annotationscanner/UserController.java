package io.baizi.study.annotationscanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juwencheng
 * @date 2020 2020/7/10 10:15 上午
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static Integer invokeTime = 0;
    @Autowired
    private UserModule userModule;
    @GetMapping("hello")
    public String hello() {
        userModule.hello();
        System.out.println(userModule);
        invokeTime++;
        return invokeTime + "";
    }
}
