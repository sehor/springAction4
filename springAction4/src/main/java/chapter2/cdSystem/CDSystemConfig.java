package chapter2.cdSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import chapter2.cdSystem.aspect.TrackCounter;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class CDSystemConfig {
	
	@Bean
	public CompactCD randomCd(){
		
		/*int choice=(int)Math.floor(Math.random()*3);
		switch (choice){
		case 0:return new JackMachel();
		case 1:return new LoneyHeart();
		case 2:return new HappyDay();
			
		}*/
	
		 return new LoneyHeart();
	}
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}

}
