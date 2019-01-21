package chapter1.test;

import org.junit.Test;

import chapter1.knight.BraveKnight;
import chapter1.knight.DragonSlayKnight;
import chapter1.knight.DragonSlayQuest;
import chapter1.knight.Quest;

import static org.mockito.Mockito.*;


public class KnightTest {
	
	@Test
	public void knightShouldSlayDragon(){
		
		Quest mockQuest=mock(DragonSlayQuest.class);
		BraveKnight braveKnight=new DragonSlayKnight(mockQuest);
		braveKnight.embakOnQuest();
		
	}

}
