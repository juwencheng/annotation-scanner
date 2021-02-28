package io.baizi.study.annotationscanner.process;

import io.baizi.study.annotationscanner.annotation.Module;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * @author juwencheng
 * @date 2020 2020/7/10 10:06 上午
 */
@Configuration
public class BeanDefinitionRegister implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);

        // bean的名字生成规则
        scanner.setBeanNameGenerator(new AnnotationBeanNameGenerator());
        // 设置需要扫描的注解
        scanner.addIncludeFilter(new AnnotationTypeFilter(Module.class));
        scanner.scan("io.baizi.study");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
