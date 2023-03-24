package lambdademos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamWithMapDemo {

	public static List<String> getBookBasedOnBookName(HashMap<String, String> books)
	{
		List<String>  b = books.entrySet().stream()
				  .filter( e -> e.getKey().startsWith("978-0"))
				  .map(Map.Entry::getValue)
				  .collect(Collectors.toList());
				  return b;
	}
	
	
	public static void main(String[] args) {

HashMap<String, String> books = new HashMap<>(); 
books.put( "978-0201633610", "Design patterns : elements of reusable object-oriented software"); 
books.put( "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
books.put("978-0134685991", "Effective Java");

List<String> listOfBooks=getBookBasedOnBookName(books);
System.out.println(listOfBooks);

	}

}
