package Practice;

public class reverse_byWord {
	public static void main(String[] args) {

		String str = "i am deepak";
		// first string which we want to reverse
		String word = "";
		// empty string to save first reverse string by word

		System.out.println(str.length()); // print the length of the string

		String byword[] = str.split(" ");

		for (int i = byword.length - 1; i >= 0; i--) {
			word = word + (byword[i] + " ");
		}
		// reverse=word.trim();
		System.out.println(word);

		StringBuffer bff = new StringBuffer(word.trim());
		System.out.println(bff.reverse());

	}
}