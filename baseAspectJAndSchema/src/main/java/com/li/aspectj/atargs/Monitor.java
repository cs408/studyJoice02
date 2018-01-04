/**
 * Project Name:baseAspectJAndSchema
 * File Name:Monitor.java
 * Package Name:com.li.aspectj.atargs
 * Date:2018年1月4日上午8:53:35
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.li.aspectj.atargs;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:Monitor <br/>
 * Function: 定义注解，测试@args(M)
 * Date:     2018年1月4日 上午8:53:35 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Monitor {
    public boolean value() default true;
}
