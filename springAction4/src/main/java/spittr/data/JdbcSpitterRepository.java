package spittr.data;

import org.springframework.stereotype.Repository;

import spittr.Spitter;
import util.Tools;

@Repository
public class JdbcSpitterRepository implements SpitterRepositroy {

	@Override
	public Spitter save(Spitter spitter) {
		Tools.print("saved!");
		return spitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		// TODO Auto-generated method stub
		return new Spitter(username, "123456", "firstName", "lastName", "email");
	}

	
}
