package com.li.aspectj.advanced;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.li.NaiveWaiter;
import com.li.Waiter;

/**
 *  AspectJ进阶
 * @author prd-lxw
 * @version $Id: AdvancedTest.java, v 0.1 2017年12月31日 下午4:53:32 prd-lxw Exp $
 */
public class AdvancedTest {

    @Test
    public void advance() {
        String configPath = "com/li/aspectj/advanced/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");

        //-------------复合运算----------
        //        naiveWaiter.serveTo("John");
        //        naughtyWaiter.greetTo("Tom");
        //        naughtyWaiter.serveTo("Tom");

        //------------引用命名切点----------
        //        naiveWaiter.serveTo("John");
        //        naiveWaiter.greetTo("John");
        //        naughtyWaiter.greetTo("Tom");
        //        naughtyWaiter.serveTo("Tom");

        //-- 环绕增强访问连接点上下文信息
        //        naiveWaiter.greetTo("John");

        //--绑定连接点参数
        //        ((NaiveWaiter) naiveWaiter).smile("John", 2);
        //--绑定连接点参数——@annotation(M) 取得注解M中的信息
        ((NaiveWaiter) naiveWaiter).smile("John", 2);
        ((NaiveWaiter) naiveWaiter).atAnimal("hot dog");

        //--绑定代理对象
        //        naiveWaiter.greetTo("John");

        //--绑定类注解对象
        //        ((NaiveWaiter) naiveWaiter).greetTo("John");

        //绑定返回值
        //        SmartSeller seller = (SmartSeller) ctx.getBean("seller");
        //        seller.sell("Beer", "John");

        //绑定异常
        //        SmartSeller seller = (SmartSeller) ctx.getBean("seller");
        //        seller.checkBill(2);
        //        seller.checkBill(1);

        //      naiveWaiter.serveTo("John");
        //      naughtyWaiter.greetTo("Tom");
        //      naughtyWaiter.serveTo("Tom");

        //        WaiterManager wManager = new WaiterManager();
        //        wManager.setAge(15);
        //        wManager.setName("xiaoming");
        //        ((NaiveWaiter) naiveWaiter).annotationParameterArgs(wManager);
    }
}
