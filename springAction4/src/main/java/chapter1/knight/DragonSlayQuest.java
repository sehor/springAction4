package chapter1.knight;

import java.io.PrintStream;

public class DragonSlayQuest implements Quest{
	
	private PrintStream printStream;
	
	public DragonSlayQuest(PrintStream printStream){
		
		this.printStream=printStream;
	}

	@Override
	public void embark() {
		// TODO Auto-generated method stub
		
		printStream.println("Slay the evil dragon!");
	}

}
