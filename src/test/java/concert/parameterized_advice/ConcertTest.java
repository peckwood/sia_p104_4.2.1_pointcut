package concert.parameterized_advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class ConcertTest {
	//If a BlanDisc Type is specified, it will throw "No qualifying Bean found exception since Spring created a proxy
	//wrapped around BlaDisc and it is of type com.sun.proxy.$Proxy18, instead of BlankDisc
	
	//However it seems that proxy still implements CompactDisc, BlankDisc's interface
	@Autowired
	CompactDisc cd;
	
	@Test
	public void testParameterizedAdvice(){
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(1);
	}
}
