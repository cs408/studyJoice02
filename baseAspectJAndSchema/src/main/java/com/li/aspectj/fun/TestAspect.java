package com.li.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

/**
 * 待测试的切点函数
 * @author prd-lxw
 * @version $Id: TestAspect.java, v 0.1 2018年1月3日 下午3:36:58 prd-lxw Exp $
 */
@Aspect
public class TestAspect implements Ordered {

    //    @AfterReturning("@annotation(com.li.anno.NeedTest)")
    //    public void atAnnotaionTest() {
    //        System.out.println("atAnnotaionTest() executed!");
    //    }

    //方法签名定义
    //    @Before("execution(public * *(..))")
    //	public void allPublicFun(){
    //	    System.out.println("allPublicFun() executed!");	
    //	}

    //    通过类定义
    //    @Before("execution(* com.li.Waiter.*(..))")
    //    public void allInterfaceMethods() {
    //        System.out.println("allInterfaceMethods() executed!");
    //    }

    //    @Before("execution(* com.li.Waiter+.*(..))")
    //    public void allSuperAndSubclassMethods() {
    //        System.out.println("allSuperAndSubclassMethods() executed!");
    //    }

    //    @AfterReturning("execution(* *To(..))")
    //    public void allToFun(){
    //    	System.out.println("allToFun() executed!");
    //    }
    //    @Before("execution(* com.li.Waiter.*(..))")
    //    public void allWaiterFun(){
    //    	System.out.println("allWaiterFun() executed!");
    //    }
    //    @Before("execution(* com.li.Waiter+.*(..))")
    //    public void allChildClassFun(){
    //    	System.out.println("allChildClassFun() executed!");
    //    }
    //	@Before("execution(* joke(Object,int)))")
    //	@Before("args(Object,*)")
    //    public void jokeFun(){
    //    	System.out.println("jokeFun() executed!");
    //    }

    //args
    //    @AfterReturning("args(String)")
    //    public void argsTest() {
    //        System.out.println("argsTest() executed!");
    //    }
    //-----@args test------//
    @AfterReturning("@args(com.li.Monitorable)")
    public void atArgsTest() {
        System.out.println("atArgsTest() executed!");
    }

    //    -----------within测试
    //    @Before("within(com.li.Waiter)")
    //    @Before("within(com.li.NaiveWaiter)")
    //    public void withinTest() {
    //        System.out.println("withinTest() executed!");
    //    }

    //  -----------@within @target测试
    @Before("@within(com.li.Monitorable)")
    public void atWithinTest() {
        System.out.println("atWithinTest() executed!");
    }

    //    @Before("@target(com.li.Monitorable)")
    //    public void atTargetTest() {
    //        System.out.println("atTargetTest() executed!");
    //    }

    // ----------target this 一致效果
    //    @Before("target(com.li.Waiter)")
    //    @Before("this(com.li.Waiter)")
    //    public void targetTest() {
    //        System.out.println("targetTest() executed!");
    //    }

    //--------在引入Seller接口增强时，使用this()或者target --------//
    //    @AfterReturning("this(com.li.Seller)")
    //    //    @AfterReturning("target(com.li.Seller)")
    //    public void thisAndTargetIntroducetTest() {
    //        System.out.println("thisAndTargetIntroducetTest() executed!");
    //    }

    //织入顺序测试
    //    @Before("@annotation(com.li.anno.NeedTest)")
    //    public void atAnnotaionTest() {
    //        System.out.println("TestAspectJ#atAnnotaionTest() order:1");
    //    }

    //##################end
    //    @AfterReturning("this(com.li.Seller)")
    //    public void thisTest() {
    //        System.out.println("thisTest() executed!");
    //    }

    //    设置织入顺序
    public int getOrder() {
        return 1;
    }
}
