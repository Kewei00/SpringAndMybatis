package spring.kewei.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect  
public class ThingAdvice {
	
//	前置通知  ：在目标方法之前调用
//	后置通知：（若出现异常则不调用） 在目标方法之后调用
//	后置通知：（无论是否出现异常都会调用）
//	环绕通知 ：  在目标方法之前，后 调用
//	异常通知 ： 出现异常才会调用
	
	@Pointcut("execution(* spring.kewei.service..*ServiceImpl..*(..))")
	public void pointcut(){
		
	}
	
	
	@Before("ThingAdvice.pointcut()")
	public void before(){
		
		System.out.println("前置通知。。。。");
	}
	
	@AfterReturning("ThingAdvice.pointcut()")
	public void afterReturning(){
		
		System.out.println("后置通知。。。（出现异常就不调用）。");
	}
	
	@After("ThingAdvice.pointcut()")
	public void after(){
		
		System.out.println("后置通知：（无论是否出现异常都会调用）。。。。");
	}
	
	@AfterThrowing("ThingAdvice.pointcut()")
	public void afterException(){
		
		System.out.println("异常通知 ： 出现异常才会调用。。。。");
	}
	
	@Around("ThingAdvice.pointcut()")
	public Object around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("、。环绕前。。。");
		Object proceed = point.proceed(); // 调用目标方法
		System.out.println("、。。环绕后。。");
		
		return proceed;
	}
}
