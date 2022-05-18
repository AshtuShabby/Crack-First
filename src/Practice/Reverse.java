package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
	
//	public static void revrse(String str) {
//		
//		String orignal=str;
//		String rev = "";
//		
//		for(int i=orignal.length()-1; i>=0; i-- ) {
//			
//			rev=rev+orignal.charAt(i);
//			//System.out.println(rev);
//		}
//		System.out.println(rev);
//	}
//public static void main(String[] args) {
//	revrse("abcd");
//}

    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine();
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);
        System.out.println("Result:" + reverse); 
    } 
}

