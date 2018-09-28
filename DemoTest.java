/**
 * The main code for the HashMap and HashSet demo lab. 
 * 
 * Methods will split a string and test the length of each word, allow the user to call and define a list of words, 
 * and list the unique words in a set.
 * 
 * @author Moore
 *Github Edit1
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DemoTest {
	
	public static void main(String[] args)	{
		splitDemo();
		//hashMapDemo();
		//hashSetDemo();		
	}
	
	/**
	 * Code for the splitDemo method. 
	 * 
	 * Splits a sentence into individual words and displays every word with a length of 4 or more letters. 
	 * 
	 * @author moorep3
	 *
	 */
	public static void splitDemo()	{
		String testString = "When in the course of human events it becomes necessary for one nation to dissolve the bonds";
		String [] myWords = testString.split(" ");			//split method will split the string whenever it finds a space
		for(String split : myWords)	{
			if(split.length() >= 4)	{
				System.out.println(split);
			}
		}
	}
	
	/**
	 * Code for the hashMapDemo method
	 * 
	 * Assigns definitions to words and allows the user to call those words and display it's definition.
	 * 
	 * @author moorep3
	 *
	 */
	public static void hashMapDemo()	{
		HashMap<String, String> myDict = new HashMap<String, String>();
		
		myDict.put("evacuate",  "remove someone from a place of danger to a safe place");
		
		myDict.put("descend", "move or fall downwards");
		
		myDict.put("hypochondriac", "a person who is abnormally anxious about their health");
		
		myDict.put("injunction", "an authoritative warning or order");
		
		myDict.put("creek", "a stream, brook, or a minor tributary of a river");
		
		myDict.put("googol", "10e100");
		
		String defString = "The definition of ";
		System.out.println(defString + "descend: " + (String)myDict.get("descend"));
		System.out.println(defString + "injunction: " + (String)myDict.get("injunction"));
		System.out.println(defString + "googol: " + (String)myDict.get("googol"));			//user can call any of the words put in the HashMap
				
	}
	
	/**
	 * Code for the hashSetDemo
	 * 
	 * Creates a list of words and lists only the unique words in the set as well as counting how many unique words are present. 
	 * 
	 * @author moorep3
	 *
	 */
	public static void hashSetDemo()	{
		HashSet<String> uniqueSet = new HashSet<String>();
		
		String myWords [] = {"that", "that", "is", "is", "that", "that", "is", "not", "is", "not", "is", "that", "it", "it", "is"};	
		
		for(String word : myWords)	{
			System.out.println(word);
			uniqueSet.add(word);
			}
		
		System.out.println();	
		System.out.println(uniqueSet.size() + " Unique Words: ");
		
		Iterator<String> it = uniqueSet.iterator();		//iterator automatically ignores duplicates and only lists unique words
		while(it.hasNext())	{
			System.out.println(it.next());
		}		
	}
}

