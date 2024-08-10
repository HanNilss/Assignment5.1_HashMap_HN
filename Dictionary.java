/**
 * A dictionary class using a hashmap, pairing key and descriptions. Can load pairings from csv file located in same directory.
 * @author hNilsson
 * @version 1.0
 * CS215
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Dictionary{

	/**
	 * Fields for the hashmap and  buffered reader
	 */
	private HashMap<String,String> Dictionary;
	private BufferedReader br = new BufferedReader(new FileReader("DictionaryWordValuePairs(Sheet1).csv"));

	/**
	 * Constructs a Dictionary object, initiating a hash map with strings as both key and value.
	 * First string is word, second string is definition.
	 * @throws FileNotFoundException
	 */
	public Dictionary() throws FileNotFoundException{
		
		this.Dictionary = new HashMap<String,String>();
		
	}//end default constructor
	
	/**
	 * Adds a word and its corresponding definition to the dictionary.
	 * @param word The word.
	 * @param def The definition of the word.
	 */
	public void addWord(String word, String def) {
		
		Dictionary.put(word, def);
		
	}//end addWord
	
	/**
	 * Loads in key/definition pairings from a csv file located in the same directory.
	 * @throws IOException if there is no line to read
	 */
	public void load() throws IOException {
		
		String line = null;
		
		while ((line = br.readLine())!= null) {
			String[] parts = line.split(",",2);
			String word = parts[0].trim();
			String def = parts[1].trim();
			addWord(word,def);
		}//end while
		
		br.close();
	}//end load
	
	/**
	 * Prints out all words and definitions to the console.
	 */
	public void displayDictionary() {
		for(String i : Dictionary.keySet()) {
			System.out.println(i+" - "+Dictionary.get(i));
		}//end for
	}//end displayDictionary
	
	/**
	 * Lets you search for a word in the dictionary and returns its definition and hashCode.
	 * 
	 * @param key Word to get definition of
	 * @return The word, its definition, and its hashCode
	 */
	public String search(String key) {
		return key +" - " +this.Dictionary.get(key)+" - "+key.hashCode();
	}//end search
	
}//end class
