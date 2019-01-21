package chapter2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chapter2.cdSystem.CDSystemConfig;
import chapter2.cdSystem.CompactCD;
import chapter2.cdSystem.aspect.TrackCounter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDSystemConfig.class)

public class ChapterTest {

	@Autowired
	private CompactCD cd;

	@Autowired
	private TrackCounter trackCounter;

	@Test
	public void cdSystemTest() throws Exception {

		cd.playTrack(0);
		cd.playTrack(0);
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(2);
		cd.playTrack(2);

		assertEquals(2, trackCounter.getPlayCount(0));
		assertEquals(1, trackCounter.getPlayCount(1));
		assertEquals(3, trackCounter.getPlayCount(2));
		assertEquals(0, trackCounter.getPlayCount(3));

	}

}
