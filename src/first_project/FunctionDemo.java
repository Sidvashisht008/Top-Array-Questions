package first_project;

public class FunctionDemo {
	
	public static int val=20; //global variable
    
	public static void main(String[] args) {
		int val=30;
		System.out.println("hello");
		System.out.println(val);               //local variable val
		System.out.println(FunctionDemo.val);   //global variable val
		addition(12,13);  //function call
		System.out.println("bye");
		
		//block scope
		if(val==30) {
			int ans = 5;           //ans variable is accessible only in if block 
			System.out.println(ans);
		}
		int d = addition(6,68);
		System.out.println(d);
	}
	//function definition
    public static int addition(int a, int b) {
    	int c=a+b;
    	System.out.println(c);
    	return c;    //return int value 
    }
}
