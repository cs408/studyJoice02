package com.li.anno;

/**
 * 使用注解
 * @author prd-lxw
 * @version $Id: ForumService.java, v 0.1 2018年1月2日 下午4:11:06 prd-lxw Exp $
 */
public class ForumService {
    @NeedTest(value = true)
    public void deleteForum(int forumId) {
        System.out.println("删除论坛模块：" + forumId);
    }

    /**
     * 
     * @param topicId
     */
    @NeedTest(value = false)
    public void deleteTopic(int topicId) {
        System.out.println("删除论坛主题：" + topicId);
    }
}
