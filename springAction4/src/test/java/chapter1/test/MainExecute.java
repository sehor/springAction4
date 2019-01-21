package chapter1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter1.knight.BraveKnight;

public class MainExecute {
	
	
	public static void main (String[] args)throws Exception{
		
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("META-INF/spring/knights.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(chapter1.knight.KnigthConfig.class);
		BraveKnight braveKnight=context.getBean(BraveKnight.class);
		braveKnight.embakOnQuest();
		context.close();
	}

}
