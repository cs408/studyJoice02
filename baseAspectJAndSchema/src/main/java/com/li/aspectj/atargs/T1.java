/**
 * Project Name:baseAspectJAndSchema
 * File Name:T1.java
 * Package Name:com.li.aspectj.atargs
 * Date:2018年1月4日上午8:57:18
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.li.aspectj.atargs;

/**
 * ClassName:T1 <br/>
 * Function: TODO  <br/>
 * Date:     2018年1月4日 上午8:57:18 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class T1 extends T0 {

    /**
     * 目标类方法,旨在这个方法中织入增强逻辑. 当注解标注在T2,方法的入参为T2或者T2的子孙类时,会织入增强
     * 
     * @param t
     */
    public void fun(T2 t) {
        System.out.println(t.getClass().getName() + " fun executed");
    }
}
