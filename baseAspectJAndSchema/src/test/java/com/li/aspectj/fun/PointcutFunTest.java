package com.li.aspectj.fun;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.li.Waiter;

/**
 * 测试切点函数
 * @author prd-lxw
 * @version $Id: PointcutFunTest.java, v 0.1 2017年12月31日 上午11:16:23 prd-lxw Exp $
 */
public class PointcutFunTest {

    @Test
    public void pointcut() {
        String configPath = "com/li/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        //        @annotation()
        //        naiveWaiter.greetTo("John");
        //        naughtyWaiter.greetTo("John");
        //        naughtyWaiter.serveTo("Tom");

        //@execution() 类定义测试
        //        naughtyWaiter.greetTo("John");
        //        naughtyWaiter.serveTo("Tom");
        //        ((NaughtyWaiter) naughtyWaiter).greetTo("John");
        //        ((NaughtyWaiter) naughtyWaiter).serveTo("Tom");
        //        ((NaughtyWaiter) naughtyWaiter).joke("Tom", 1);

        //        args
        //        naughtyWaiter.serveTo("Tom");
        //        ((NaughtyWaiter) naughtyWaiter).greetTo("John");

        //-----@args test  入参类型点和标注@M都为NaiveWaiter------//
        //        WaiterManager wm = (WaiterManager) ctx.getBean("waiterManager");
        //        NaiveWaiter waiter3 = new NaiveWaiter();
        //        NaiveWaiter waiter4 = (NaiveWaiter) ctx.getBean("naiveWaiter");
        //        NaiveWaiter waiter5 = new CuteNaiveWaiter();
        //        wm.addNaiveWaiter(waiter3);
        //        wm.addWaiter(waiter4);//Waiter——NaiveWaiter——CuteNaiveWaiter 对象是标注类的父类，不匹配；@M标注在Waiter接口时，匹配
        //        wm.addNaiveWaiter(waiter5);

        //  within测试
        //        naiveWaiter.serveTo("John");
        //        naughtyWaiter.greetTo("Tom");
        //        naughtyWaiter.serveTo("Tom");
        //        ((NaughtyWaiter) naughtyWaiter).joke("Tom", 1);

        //---------@within()和@target() 对类进行注解------------//
        //        naughtyWaiter.greetTo("Tom");
        //        ((NaughtyWaiter) naughtyWaiter).joke("Tom", 1);//非目标类NaiveWaiter
        //        naiveWaiter.greetTo("John"); //目标类为NaiveWaiter
        //        ((NaiveWaiter) naiveWaiter).smile("John", 2);//目标类为NaiveWaiter
        //        CuteNaiveWaiter cuteNaiveWaiter = new CuteNaiveWaiter(); //目标类为NaiveWaiter的子类
        //        cuteNaiveWaiter.greetTo("cuteJohn");

        // target this一致效果
        //        naiveWaiter.serveTo("John");
        //        naughtyWaiter.greetTo("Tom");
        //        naughtyWaiter.serveTo("Tom");
        //        ((NaughtyWaiter) naughtyWaiter).joke("Tom", 1);

        //--------在引入接口增强时，使用this()或者target --------//
        //        naiveWaiter.greetTo("John");
        //        naiveWaiter.serveTo("John");
        //        ((Seller) naiveWaiter).sell("Beer", "John");

        //        织入顺序测试
        //        naughtyWaiter.greetTo("John");
        //        naughtyWaiter.serveTo("Tom");
    }
}
