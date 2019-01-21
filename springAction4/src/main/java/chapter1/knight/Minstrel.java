package chapter1.knight;

import java.io.PrintStream;

public class Minstrel {

	private PrintStream printStream;
	public Minstrel(PrintStream printStream){
		
		this.printStream=printStream;
	}
	
	public void singBeforQuest(){
		printStream.println("Fa la la, the knight is so brave!");
	}
	
	public void singAfterQuest(){
		printStream.println("Tee Hee hee, the knight did embark on a quest!");
	}
}
