package a1_ConstructorTest;

public class A3_BlockTest {
	
	//Normal Block
	{
		System.out.println("Normal Block...2");
	}
	
	//Normal Block
		{
			System.out.println("Normal Block...");
		}
		
	static
	{
		System.out.println("Static Block2...");
	}
	//static block
	static
	{
		System.out.println("Static Block...");
	}
	
	
	//Function Block
	public static void add(){
		System.out.println("Function Block...");
	}
	
	A3_BlockTest(){
		System.out.println("Constructor Block...");
	}
	
	public static void main(String[] args) {
//		
//		A3_BlockTest x=new A3_BlockTest();
//		add();
//		System.out.println("Main method..."); //Static block calls first, then the remaining called from the order we placed.
		// but constructor block called after normal block
		
		System.out.println("Main method..");
		A3_BlockTest x=new A3_BlockTest();
		add();
	}

}
