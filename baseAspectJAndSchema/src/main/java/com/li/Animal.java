/**
 * Project Name:chapter8
 * File Name:Animal.java
 * Package Name:com.smart
 * Date:2018年1月1日下午9:22:38
 * Copyright (c) 2018, 深圳金融电子结算中心 All Rights Reserved.
 *
*/

package com.li;

/**
 * ClassName:Animal <br/>
 * Function: TODO  <br/>
 * Date:     2018年1月1日 下午9:22:38 <br/>
 * @author   prd-lxw
 * @version   1.0
 * @since    JDK 1.7
 * @see 	 
 */
public class Animal {

    public void eat(String ss, int number) {
        System.out.print("Animal:eat()" + ss + ":" + number);
    }

    public void run(int speed, String name) {
        System.out.println("Animal:run()" + speed + ":" + name);
    }
}
