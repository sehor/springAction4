package chapter2.cdSystem;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{

	private CompactCD cd;
	
	public  CDPlayer(CompactCD cd) {
		this.cd=cd;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play() {
		cd.cdPlay();
		
	}

}
