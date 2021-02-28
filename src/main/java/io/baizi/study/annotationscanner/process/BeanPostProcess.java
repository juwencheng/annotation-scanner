package io.baizi.study.annotationscanner.process;

import io.baizi.study.annotationscanner.annotation.Module;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author juwencheng
 * @date 2020 2020/7/10 10:27 上午
 */
@Component
public class BeanPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        boolean annotationPresent = aClass.isAnnotationPresent(Module.class);
        aClass.getAnnotation(Module.class);
        return bean;
    }
}
