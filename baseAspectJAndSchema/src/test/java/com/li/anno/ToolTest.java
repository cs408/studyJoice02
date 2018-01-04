package com.li.anno;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 使用注解
 * @author prd-lxw
 * @version $Id: ToolTest.java, v 0.1 2018年1月2日 下午4:26:02 prd-lxw Exp $
 */
public class ToolTest {

    @Test
    public void tool() {
        Class clazz = ForumService.class;//得到ForumService对应的Class对象
        //得到ForumService对应的Method数组
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            //------------获取方法上所标注的注解对象
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if (nt != null) {
                if (nt.value()) {
                    System.out.println(method.getName() + "()需要测试");
                } else {
                    System.out.println(method.getName() + "()不需要测试");
                }
            }
        }
    }
}
