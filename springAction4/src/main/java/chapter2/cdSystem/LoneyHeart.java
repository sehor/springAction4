package chapter2.cdSystem;

import java.util.ArrayList;
import java.util.List;

public class LoneyHeart implements CompactCD {
	
	private List<String> track=new ArrayList<>();
	
	 public LoneyHeart() {
		// TODO Auto-generated constructor stub
		 initTrackList();
	}

	@Override
	public void cdPlay() {
		// TODO Auto-generated method stub
		System.out.println("Loney Heart's songs playing! ");
	}

	@Override
	public void playTrack(int trackNum) {
		// TODO Auto-generated method stub
		
	if(track.get(trackNum)!=null){
		System.out.println("playing: "+ track.get(trackNum));
	}
		
	}
	
	
  private void initTrackList(){
	  
	   this.track.add("spring coming");
	   this.track.add("river go away");
	   this.track.add("fllower to you");
	   this.track.add("the night i never forget");
  }

}