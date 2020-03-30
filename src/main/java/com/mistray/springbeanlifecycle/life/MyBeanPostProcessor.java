package com.mistray.springbeanlifecycle.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ZJY(MistRay)
 * @Project spring-bean-lifecycle
 * @Package com.mistray.springbeanlifecycle.life
 * @create 2020年03月30日 14:55
 * @Desc
 */
public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization 执行了...");
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization 执行了...");
        return bean;
    }
}
