package com.li.aspectj.example;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.li.NaiveWaiter;
import com.li.Waiter;

/**
 * 测试定义的切面
 * @author prd-lxw
 * @version $Id: AspectJProxyTest.java, v 0.1 2018年1月2日 下午5:06:06 prd-lxw Exp $
 */
public class AspectJProxyTest {

    @Test
    public void proxy() {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(target);//设置目标对象
        factory.addAspect(PreGreetingAspect.class);//添加切面类
        Waiter proxy = factory.getProxy();//生成织入切面的代理对象
        proxy.greetTo("John");
        proxy.serveTo("John");
    }
}
