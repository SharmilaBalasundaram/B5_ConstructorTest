package a1_ConstructorTest;

public class A2_SampleConstructor {
	
	public static void main(String[] args) {
		
		A1_ConstructorTest a=new A1_ConstructorTest();
		int k=a.i+a.j;
		System.out.println(k);
		System.out.println(a.a);
		
		A1_ConstructorTest b=new A1_ConstructorTest(10,10,"Sunaina");
		int l=b.i+b.j;
		System.out.println(l);
		System.out.println(b.a);
		
	}

}
