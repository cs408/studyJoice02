package com.li.aspectj.basic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import com.li.Seller;
import com.li.SmartSeller;

/**
 * 定义引介增强切面
 * @author prd-lxw
 * @version $Id: EnableSellerAspect.java, v 0.1 2018年1月3日 上午11:27:16 prd-lxw Exp $
 */
@Aspect
public class EnableSellerAspect {

    //value表示为NaiveWaiter添加接口实现；defaultImpl表示默认的接口实现类
    @DeclareParents(value = "com.li.NaiveWaiter", defaultImpl = SmartSeller.class)
    public Seller seller; //表示要实现的目标接口
}
