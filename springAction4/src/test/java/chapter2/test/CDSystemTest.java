package chapter2.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.cdSystem.CDSystemConfig;
import chapter2.cdSystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDSystemConfig.class)
public class CDSystemTest {
	
	@Autowired MediaPlayer player;
	
	@Test
	
   public void test(){
		
		player.play();
	}
}
