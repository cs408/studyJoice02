package com.li.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 简单注解示例
 * @author prd-lxw
 * @version $Id: NeedTest.java, v 0.1 2018年1月2日 上午11:25:56 prd-lxw Exp $
 */
@Retention(RetentionPolicy.RUNTIME)
//1.声明注解的保留期限
@Target(ElementType.METHOD)
//2.声明可以使用该注解的目标类型
public @interface NeedTest {//3.定义注解
    boolean value() default false;//4.声明注解成员
}
