package concert.aroundadvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("[around advice]Silencing cell phones");
			System.out.println("[around advice]Taking seats");
			jp.proceed();
			System.out.println("[around advice]CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("[around advice]Demanding a refund");
		}
	}

	// you can define a pointcut and reuse it
	@Pointcut("execution (** concert.Performance.perform(..))")
	public void performance() {
	}

}
