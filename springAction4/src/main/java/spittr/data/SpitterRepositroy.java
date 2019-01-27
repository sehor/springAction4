package spittr.data;

import spittr.Spitter;

public interface SpitterRepositroy {

	
	Spitter save(Spitter spitter);
	Spitter findByUsername(String username);
}
