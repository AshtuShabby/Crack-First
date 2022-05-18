package Practice;

public class Reverse_the_string_witch_space_save {
	
		 public static void main(String[] args) 
		 {
		        String inputString = "hi deepak here";
		        String outputString = reverseWordsFromString(inputString);
		        System.out.println("The string with the reversed word is : " + outputString);
		    }
		    public static String reverseWordsFromString(String inputString) 
		    {
		        String[] wordsArray = inputString.trim().split(" ");
		        String stringWithReversedWords = "";

		        for (String word : wordsArray)
		        {
		            stringWithReversedWords =stringWithReversedWords+ reverseWord(word) + " ";
		        }
		        return stringWithReversedWords.trim();
		    }

		    public static String reverseWord(String word) 
		    {
		        String reversedWord = "";

		        for (int i = word.length() - 1; i >= 0; i--) 
		        {
		            reversedWord += word.charAt(i);
		        }
		        return reversedWord;
		    }
	}


