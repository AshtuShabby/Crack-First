package Practice;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
//==================================String is pallindrom===================================================		
//		String Orignal="";
//		String revrs="";
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the String/Number that you want to check as palindrom or not?");
//		Orignal= scan.nextLine();
//		for(int i=Orignal.length()-1;i>=0;i--) {
//			revrs= revrs+Orignal.charAt(i);
//		}
//		if(revrs.toLowerCase().equals(Orignal.toLowerCase())) {
//			System.out.println("Enter value is Palindrom");
//		}
//		else {
//			System.out.println("Enter value is not Palindrom");
//		}	


//==============================================Remove char and print string=====================================================
//	    public  String removeChar(String str, char c) {
//	        if (str == null)
//	            return null;
//	        return str.replaceAll(Character.toString(c), "");
//	      }
//public static void main(String[] args) {
//	Palindrom pl = new Palindrom();
//	System.out.println(pl.removeChar("Shahbaj", 'h'));
	

		
//==============================================spaces betn string count======================================
//		String str= "i am good tester and i love java";
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//		     if(Character.isWhitespace(str.charAt(i))) count++;
//		}
//		System.out.println(count);
//	}

	//========================================remove duplicates form string=========================================
	
		String str="AAABBBCCCCDDDDDAAA";
		
//		String[] str2= new String[str.length()-1];
		
		StringBuffer bff=new StringBuffer();
		System.out.println(bff.capacity());
		
		int count;
		
		for(int i=0; i<str.length();i++) {
		
			count=0;
			
			for(int j=i+1; j<str.length();j++) {
			
				if(str.charAt(i) == str.charAt(i))
			
					count++;}
				
			if(count<=1 && count>0) {
			
				bff.append(str.charAt(i));
				}
			
			}
		System.out.println(bff);
		
	}
	}
	

