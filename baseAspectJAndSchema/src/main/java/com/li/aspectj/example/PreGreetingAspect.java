package com.li.aspectj.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 使用@AspectJ定义一个切面
 * @author prd-lxw
 * @version $Id: PreGreetingAspect.java, v 0.1 2018年1月2日 下午5:05:40 prd-lxw Exp $
 */
@Aspect
//1.通过该注解将PreGreetingAspect表示为一个切面
public class PreGreetingAspect {
    //2.@Before表示强强类型，后面的参数表示目标切点表达式
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {//3.该方法表示增强所用的横切逻辑
        System.out.println("How are you");
    }
}
