package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import spittr.Spittle;

@Repository
public class JdbcSpittleRepository implements SpittleRepository{

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		// TODO Auto-generated method stub
		
		List<Spittle> spittles=new ArrayList<>();
		for(int i=0;i<count;i++){
			Spittle spittle=new Spittle("message"+i, new Date());
			spittles.add(spittle);
		}
		return spittles;
	}
	

	@Override
	public Spittle findOne(long spittleId) {
		// TODO Auto-generated method stub
		return new Spittle(spittleId, "Hi,I am a spittle!", new Date(), null, null);
	}
	
	

}
