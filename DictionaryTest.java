import java.io.FileNotFoundException;
import java.io.IOException;

public class DictionaryTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		Dictionary d = new Dictionary();
		
		System.out.println("Loading dictionary from file");
		try {
			d.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Printing whole dictionary");
		d.displayDictionary();
		
		System.out.println("\nSearching for Meat");
		System.out.println(d.search("meat"));
		System.out.println("\nSearching for Coz");
		System.out.println(d.search("coz"));
		System.out.println("\nSearching for Glebe");
		System.out.println(d.search("glebe"));
		System.out.println("\nSearching for Speed");
		System.out.println(d.search("speed"));
		System.out.println("\nSearching for Moil");
		System.out.println(d.search("moil"));
		
		
	}//end main

}//end class
