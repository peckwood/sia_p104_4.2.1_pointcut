package concert.parameterized_advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//Paramount for writing aspects
public class TrackCounterConfig {
	
	@Bean
	public BlankDisc blankDisc(){
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		return new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", tracks);
	}
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
	
}
