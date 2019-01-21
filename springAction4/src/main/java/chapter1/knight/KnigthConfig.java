package chapter1.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnigthConfig {

	@Bean
	public BraveKnight braveKnight(){
		
		return new DragonSlayKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		
		return new DragonSlayQuest(System.out);
	}
	
}
