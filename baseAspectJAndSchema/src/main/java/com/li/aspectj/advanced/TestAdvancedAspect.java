package com.li.aspectj.advanced;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.li.Animal;

@Aspect
public class TestAdvancedAspect {
    //-------------复合运算----------
    //    @Before("!target(com.li.NaiveWaiter) " + "&& execution(* serveTo(..)))")
    //    public void notServeInNaiveWaiter() {
    //        System.out.println("--notServeInNaiveWaiter() executed!--");
    //    }
    //    @After("within(com.li.*) " + " && execution(* greetTo(..)))")
    //    public void greeToFun() {
    //        System.out.println("--greeToFun() executed!--");
    //    }
    //
    //    @AfterReturning("target(com.li.Waiter) || " + " target(com.li.Seller)")
    //    public void waiterOrSeller() {
    //        System.out.println("--waiterOrSeller() executed!--");
    //    }

    //------------引用命名切点----------
    //    @Before("TestNamePointcut.inPkgGreetTo()")
    //    public void pkgGreetTo() {
    //        System.out.println("--pkgGreetTo() executed!--");
    //    }
    //
    //    @Before("!target(com.li.NaiveWaiter) && " + "TestNamePointcut.inPkgGreetTo()")
    //    public void pkgGreetToNotNaiveWaiter() {
    //        System.out.println("--pkgGreetToNotNaiveWaiter() executed!--");
    //    }
    //
    //------------访问连接点对象----------//
    //    @Around("execution(* greetTo(..)) && target(com.li.NaiveWaiter)")
    //    public void joinPointAccess(ProceedingJoinPoint pjp) throws Throwable {
    //        System.out.println("------joinPointAccess-------");//访问连接点信息
    //        System.out.println("args[0]:" + pjp.getArgs()[0]);
    //        System.out.println("signature:" + pjp.getSignature());
    //        System.out.println("class:" + pjp.getTarget().getClass());
    //        pjp.proceed();//通过连接点执行目标对象方法
    //        String[] args = { "ReplaceName" };
    //        pjp.proceed(args);//通过连接点执行目标对象方法并更新入参
    //        System.out.println("-------joinPointAccess-------");
    //    }
    //	
    //------------绑定连接点参数----------//
    //    @Before("target(com.li.NaiveWaiter) && args(name,num,..)")
    //    public void bindJoinPointParams(int num, String name) {
    //        System.out.println("----bindJoinPointParams()----");
    //        System.out.println("name:" + name);
    //        System.out.println("num:" + num);
    //        System.out.println("----bindJoinPointParams()----");
    //    }

    //跟上述方法一样，但使用起来有点鸡肋。
    //    @Before(value = "target(com.li.NaiveWaiter) && args(name,num,..)", argNames = "num,name")
    //    public void beforeGreetingWithArgs(int num, String name) {
    //        System.out.println("----beforeGreetingWithArgs()----");
    //        System.out.println("name:" + name);
    //        System.out.println("num:" + num);
    //        System.out.println("----beforeGreetingWithArgs()----");
    //    }
    //--绑定连接点参数——@annotation(M) 取得注解M中的信息
    @Before("target(com.li.NaiveWaiter) && @annotation(animal)")
    public void bindAtAnnotationParams(Animal animal) {
        System.out.println("---- bindAtAnnotationParams()----");
        System.out.println("name:" + animal.name());
        System.out.println("speed:" + animal.value());
        System.out.println("---- bindAtAnnotationParams()----");
    }

    //------------绑定代理对象----------//
    //    	@Before("execution(* greetTo(..)) && this(waiter)")
    //    @Before("this(waiter)")
    //    public void bindProxyObj(Waiter waiter) {//通过增强入参类型类来完善切点表达式
    //        System.out.println("----bindProxyObj()----");
    //        System.out.println(waiter.getClass().getName());
    //        System.out.println("----bindProxyObj()----");
    //    }

    //------------绑定类注解对象----------//
    //    @Before("@within(m)")
    //    public void bindTypeAnnoObject(Monitorable m) {
    //        System.out.println("----bindTypeAnnoObject()----");
    //        System.out.println(m.getClass().getName());
    //        System.out.println("----bindTypeAnnoObject()----");
    //    }
    //------------绑定返回值----------//
    //    @AfterReturning(value = "target(com.li.SmartSeller)", returning = "retVal")
    //    public void bingReturnValue(int retVal) {
    //        System.out.println("----bingReturnValue()----");
    //        System.out.println("returnValue:" + retVal);
    //        System.out.println("----bingReturnValue()----");
    //    }

    //    //------------绑定抛出的异常----------//
    @AfterThrowing(value = "target(com.li.SmartSeller)", throwing = "iae")
    public void bindException(IllegalArgumentException iae) {
        System.out.println("----bindException()----");
        System.out.println("exception:" + iae.getMessage());
        System.out.println("----bindException()----");
    }
}
