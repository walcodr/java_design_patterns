package main.java.com.behavioral.iteratorpattern;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		
		// Iterator pattern main demo
		CollectionofNames cmpnyRepository = new CollectionofNames();
		
		
		for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
			
			String name = (String)iter.next();
			
			System.out.println("Name: " + name);
		}
		

	}

}
