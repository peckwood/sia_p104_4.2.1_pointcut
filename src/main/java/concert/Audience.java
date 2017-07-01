package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	//good performance
	@Before("execution (** concert.Performance.perform(..))")
	public void silienceCellphone(){
		System.out.println("Silencing cell phones");
	}
	
	//good performance
	@Before("execution (** concert.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	//you can define a pointcut and reuse it
	@Pointcut("execution (** concert.Performance.perform(..))")
	public void performance(){
		
	}
	
	//after performance
	@AfterReturning("performance()")
	public void applause() {
	System.out.println("CLAP CLAP CLAP!!!");
	}
	
	//after bad performance
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding refund");
	}
}
