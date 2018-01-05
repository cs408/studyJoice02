/**
 * Project Name:baseAspectJAndSchema
 * File Name:AtArgsAspectTest.java
 * Package Name:com.li.aspectj.atargs
 * Date:2018年1月4日上午9:05:01
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.li.aspectj.atargs;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:AtArgsAspectTest <br/>
 * Function: TODO  <br/>
 * Date:     2018年1月4日 上午9:05:01 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class AtArgsAspectTest {

    @Test
    public void test() {

        String configPath = "com/li/aspectj/atargs/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

        T0 t0 = ctx.getBean("t0", T0.class);
        T1 t1 = ctx.getBean("t1", T1.class);
        T2 t2 = ctx.getBean("t2", T2.class);
        T3 t3 = ctx.getBean("t3", T3.class);

        // 因t1中的fun入参为t2,且注解标注在了T2类上，t3又是t2的子类，所以 下面两个调用都会织入增强
        //        若注解点标注在T0处，则不会匹配任何目标类
        t1.fun(t2);
        t1.fun(t3);

    }

}
