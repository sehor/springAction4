package chapter2.cdSystem.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {
	
	private Map<Integer, Integer> trackCount=new HashMap<>();
	
	@Pointcut("execution(* chapter2.cdSystem.CompactCD.playTrack(int))&&args(trackNum)")
	public void trackPlay(int trackNum){}
	
	@Before("trackPlay(trackNum)")
	public void countTrack(int trackNum){
		int currentNum=getPlayCount(trackNum);				 
				 trackCount.put(trackNum, currentNum+1);
	}
	
	public int getPlayCount(int trackNum ){
		
		return trackCount.containsKey(trackNum)?
				trackCount.get(trackNum):0;
	}

}
