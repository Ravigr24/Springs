package collectionSet1;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("collectionSet1/Class.xml");
		
		Class cl=(Class)c.getBean("college");
		System.out.println(cl);
		
		Set<String> d=cl.getStudents();
		System.out.println(d.getClass());
		
	}

}
