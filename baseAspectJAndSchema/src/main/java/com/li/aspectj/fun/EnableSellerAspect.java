package com.li.aspectj.fun;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.Ordered;

import com.li.Seller;
import com.li.SmartSeller;

/**
 * 为NaiveWaiter添加Seller接口实现的引介切面
 * @author prd-lxw
 * @version $Id: EnableSellerAspect.java, v 0.1 2018年1月2日 下午10:01:57 prd-lxw Exp $
 */
@Aspect
public class EnableSellerAspect implements Ordered {
    //value表示为NaiveWaiter添加接口实现；defaultImpl表示默认的接口实现类
    @DeclareParents(value = "com.li.NaiveWaiter", defaultImpl = SmartSeller.class)
    public static Seller seller; //表示要实现的目标接口

    //织入顺序测试
    //    @Before("@annotation(com.li.anno.NeedTest)")
    //    public void atAnnotaionTest() {
    //        System.out.println("EnableSellerAspect#atAnnotaionTest() order:2");
    //    }

    //设置织入顺序
    public int getOrder() {
        return 2;
    }
}
