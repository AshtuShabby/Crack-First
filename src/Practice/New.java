package Practice;


public class New {
	public static void main(String[] args) {
		
		New nana= new New();
		nana.Amstrong_num(153);
		
	}
	public void Amstrong_num(int num) {
    int r;
    int cube = 0;
    int temp;
    
    temp=num;
    while(num>0) {
    	r=num%10;
    	num=num/10;
    	cube=cube+(r*r*r);
    	 }
    if(temp==cube) {
    	System.out.println("Given number is Amstrong Number.");
    	
    }else
    {
    	System.out.println("Number is not Amstrong Number");
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
