package com.li.aspectj.basic;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.li.Seller;
import com.li.Waiter;

/**
 * 引介增强用法测试
 * @author prd-lxw
 * @version $Id: DeclaredParentsTest.java, v 0.1 2018年1月3日 上午11:29:21 prd-lxw Exp $
 */
public class DeclaredParentsTest {

    @Test
    public void parent() {
        String configPath = "com/li/aspectj/basic/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.greetTo("John");
        Seller seller = (Seller) waiter;//通过引介，可以进行强制类型转换
        seller.sell("Beer", "John");
    }
}
