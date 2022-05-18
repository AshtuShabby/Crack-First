package Practice;

public class Srring_reverse_with_word {

	public static void main(String[] args) {

		String str = "i am deepak";
		// first string which we want to reverse
		String word = "";
		// empty string to save first reverse string by word
		String reverse = "";
		// used for store the reverse string by word in reverse manner by character

		System.out.println(str.length()); // print the length of the string
		String byword[] = str.split(" "); // split each word from where space is given and store in array by word as
											// data type string
		for (int i = byword.length - 1; i >= 0; i--) { // used for loop to reverse the array string by word
			reverse = reverse + (byword[i] + " "); // save it in variable
		//shabaj am i
		}

		String finalstring = reverse.trim(); // trim the word extra space at end has been trim
		System.out.println(finalstring);
		System.out.println(finalstring.length()); // both length are same

		for (int j = finalstring.length() - 1; j >= 0; j--) { // revrse the string which save priously by character
			word = word + finalstring.charAt(j);
		}
		System.out.println(word); // print it

	}

}
