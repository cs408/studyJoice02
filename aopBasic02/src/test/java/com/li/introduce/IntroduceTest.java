package com.li.introduce;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class IntroduceTest {

    @Test
	public void introduce(){
		String configPath = "com/li/introduce/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService)ctx.getBean("forumService");
        forumService.removeForum(10);
        forumService.removeTopic(1022);
        Monitorable moniterable = (Monitorable)forumService;
        moniterable.setMonitorActive(true);//开关控制
        forumService.removeForum(10);
        forumService.removeTopic(1022); 
	}
}
