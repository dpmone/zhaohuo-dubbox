package com.zhaohuo_dubbox.zhaohuo_server.starter;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerMain {
	  public static void main(String[] args) throws IOException {  
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
	                new String[] { "spring-registry.xml","spring-mybatis.xml" });  
	        context.start();  
	  
	        System.in.read(); // 按任意键退出  
	    }  
}
