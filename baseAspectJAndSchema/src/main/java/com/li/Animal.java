/**
 * Project Name:chapter8
 * File Name:Animal.java
 * Package Name:com.smart
 * Date:2018年1月1日下午9:22:38
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.li;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:Animal <br/>
 * Function: 作为参数注解
 * Date:     2018年1月1日 下午9:22:38 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Animal {
    int value() default 0;

    String name() default "";
}
