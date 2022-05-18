package Practice;


public class Reverse_string_using_buffer {
	
	public void stringseprat(String str) {
		StringBuffer alpha= new StringBuffer();
		StringBuffer num = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}else {
				alpha.append(str.charAt(i));
			}
		}
		System.out.println(num);
		System.out.println(alpha);
		
	}
	
	public static void main(String[] args) {
		
		Reverse_string_using_buffer obj = new Reverse_string_using_buffer();
	String str="AB123O4Y5F";
	obj.stringseprat(str);
		
		
		StringBuffer bff= new StringBuffer("i am coder");
		System.out.println(bff.reverse());
		
		StringBuffer sf = new StringBuffer("i am coder");
		System.out.println(sf.reverse());

		
		
		
		
	}

}
