package io.baizi.study.annotationscanner;

import io.baizi.study.annotationscanner.annotation.Module;

/**
 * @author juwencheng
 * @date 2020 2020/7/10 10:10 上午
 */
@Module
public class UserModule {
    public void hello() {
        System.out.println("hello");
    }
}
