package com.li.aspectj.advanced;

import org.aspectj.lang.annotation.Pointcut;

/**
 * 命名切点
 * @author prd-lxw
 * @version $Id: TestNamePointcut.java, v 0.1 2018年1月4日 下午2:43:52 prd-lxw Exp $
 */
public class TestNamePointcut {
    /**
     * 通过注解方法inPackage()对该切点进行命名
     */
    @Pointcut("within(com.li.*)")
    private void inPackage() {
    }

    @Pointcut("execution(* greetTo(..)))")
    protected void greetTo() {
    }

    /**
     * 引用命名切点定义的切点，本切点也是命名切点
     */
    @Pointcut("inPackage() && greetTo()")
    public void inPkgGreetTo() {
    }
}
