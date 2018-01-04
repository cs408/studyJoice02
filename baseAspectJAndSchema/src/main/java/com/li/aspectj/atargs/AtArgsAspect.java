/**
 * Project Name:baseAspectJAndSchema
 * File Name:AtArgsAspect.java
 * Package Name:com.li.aspectj.atargs
 * Date:2018年1月4日上午8:59:20
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.li.aspectj.atargs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * ClassName:AtArgsAspect <br/>
 * Function:  使用切点函数@args() 定义切面
 * Date:     2018年1月4日 上午8:59:20 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
@Aspect
public class AtArgsAspect {
    @Before("@args(com.li.aspectj.atargs.Monitor)")
    public void crossCuttingCode() {
        System.out.println("前置增强 横切逻辑织入 some logic is here ");
    }
}
