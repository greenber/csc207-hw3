package edu.grinnell.csc207.greenber.utils;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*Citations:
 *   Elias 
 *   Hellen
 *   Aaron 
 *   Christine 
 *   Vasilisa
 *   http://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
 *   http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 */
public class StringUtils {
/*
 * splitAt
 * 
 * Splits the string at a certain character
 * Takes: 
 * 	  A string
 *    a character
 * pre: 
 *    None
 * post:
 *    Gives back an array of strings
 */
	
	public static String[] splitAt(String str, char c) {
		int index = str.indexOf(c); 
		ArrayList<String> split = new ArrayList<String>();  
		while (index != -1) {
			split.add(str.substring(0, index));
			str = str.substring(index + 1);
			index = str.indexOf(c);
		}//while
		split.add(str);
		String[] splitstring = split.toArray(new String[split.size()]); 
		return splitstring; 
	}// splitAt
	
	public static String[] splitCSV(String str)
	{
		ArrayList<String> split = new ArrayList<String>();
		int i = 0;
		int quotes = 0; 
		int index = str.indexOf(",");
		int start = 0;
		int stop = str.length();
		while (index != -1)
		{
			String temp = str.substring(0, index); //from the start to the comma
			for (int j = 0; j < temp.length(); j++)
			{
				if (temp.charAt(j) == '\"')
				{
					quotes++; 
				}//if 
			}//for 
			if ((quotes % 2) == 1)
			{
				String temp2 = str.substring(0, index + 1);
				int index2 = temp2.indexOf(",");
				String temp3 = str.substring(1, 1 + index + index2);
				split.add(temp3);//adds the string
				str = str.substring(1 + index + index2); 
				break;
			}//if 
			else
			{
				split.add(temp);  
			}//else
			str = str.substring(index + 1); 
			start = index;
			index = str.indexOf(",");
		}//outer while
		split.add(str);
		String[] splitstring = split.toArray(new String[split.size()]);
		return splitstring; 
	}//splitCSV
	
/*
 * deleet
 * 
 * Generates a string that has been translated out of leet speak
 * Para:
 *   A string
 * Pre: 
 *    None
 * Post:
 *   Replace the letter with a lower case	
 */
	public static String  deLeet(String str)
	{
		str = str.replace("|3", "b");
		str = str.replace('3', 'e');
		str = str.replace('1', 'l');
		str = str.replace('@', 'a');
		str = str.replace("|\\|", "n");
		str = str.replace('0', 'o');
		str = str.replace('+', 't');

		return str;
		
	}//deleet
/*
 * nameGame
 * 
 * Outputs a string that plays the namegame
 * para: 
 *   A string
 * pre: 
 *   The string can't have a vowel at the beginning
 *Post: 
 *   Prints its and returns the string 
 */

	public static String nameGame(String name) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' ,'y' };
		int place = 0;
		int counter = 0;
		while (name.charAt(counter) != vowels[place]) {
			place = 0; 
			counter += 1; 
			while ((name.charAt(counter) != vowels[place]) && (place < vowels.length - 1)) {
				place += 1;
			}//inner while
		}//outer while
		String nameEnd = name.substring(counter, name.length());
		String game = name + "! " + "\n"+ name + " ," + name + " bo B" + nameEnd
				+ " Bonana fanna fo F" + nameEnd + "\n" + "Fee Fy mo M" + nameEnd
				+ ", " + "\n" +name+ "!";
		return game;
	}//nameGame
	
}
