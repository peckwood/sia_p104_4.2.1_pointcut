package concert.aroundadvice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages={"concert"})
@EnableAspectJAutoProxy//Necessary for aspect configuration
public class ConcertConfig {
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
