package com.mistray.springbeanlifecycle.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZJY(MistRay)
 * @Project spring-bean-lifecycle
 * @Package com.mistray.springbeanlifecycle.life
 * @create 2020年03月30日 14:15
 * @Desc
 */
public class TestLifeCycleMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        LifeCycleBean lifeCycleBean = (LifeCycleBean) ctx.getBean("lifeCycle");
        lifeCycleBean.display();
        System.out.println("方法调用完成，容器开始关闭....");
        // 关闭容器
        ctx.close();
    }
}
