package com.li.aspectj.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.li.Waiter;

/**
 * 配置方式使用@AspectJ
 * @author prd-lxw
 * @version $Id: AspectConfigTest.java, v 0.1 2018年1月2日 下午5:42:58 prd-lxw Exp $
 */
public class AspectConfigTest {

    @Test
    public void config() {
        String configPath = "com/li/aspectj/example/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
