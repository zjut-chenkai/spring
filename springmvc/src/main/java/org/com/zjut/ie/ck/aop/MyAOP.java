package org.com.zjut.ie.ck.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAOP {

	@Pointcut("execution(* org.com.zjut.ie.ck.controller.MyController.index(..))")
	public void myPointcut() {
		
	}
	
	@Around(value="myPointcut()")
	public boolean myLog() {
		System.out.println("我进入了切片");
		return true;
	}
}
