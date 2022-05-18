package Practice;

import java.util.Scanner;

public class Practice_both {
	
//	public void abc (int num) {
//		int r;
//		int cube = 0;
//		int temp;
//		
//		temp=num;
//		while(num>0) {
//			r=num%10;
//			num=num/10;
//			cube=cube+(r*r*r);
//		}
//		if (temp==cube) {
//			System.out.println("Given number is amstrong nukmber");
//			
//		}else {
//			System.out.println("Given number is not amstrong number");
//		}
//	}
	
	
	
public static void main(String[] args) {
	
	String str1="";
	String str2="";
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value ");
	str1=scan.nextLine();
	
	for(int i=str1.length()-1; i>=0 ; i--) {
		str2=str2+str1.charAt(i);
		
	}
	if(str2.toLowerCase().equals(str1.toLowerCase())) {
		System.out.println("This is palindrom");
	}
	else {
		System.out.println("This is not palindrom");
			}
	scan.close();
	

//Practice_both obj= new Practice_both();
//obj.abc(123);
     
}
}