package a1_ConstructorTest;

public class A1_ConstructorTest {
	
	public static int i;
	public static int j;
	
	public static String a;
	
	A1_ConstructorTest(){
		i=3;
		j=5;
		a="Sharmila";
	}
	
	A1_ConstructorTest(int i,int j, String a){
		this.i=i;
		this.j=j;
		this.a=a;
	}
	
	
	public static void main(String[] args) {
		
		int k= i+j;
		System.out.println(k);
		System.out.println(a);
		
		A1_ConstructorTest x=new A1_ConstructorTest();
		int m=i+j;
		System.out.println(m);
		System.out.println(a);
		
		A1_ConstructorTest y=new A1_ConstructorTest(15,10,"Sunaina");
		int p=i+j;
		System.out.println(p);
		System.out.println(a);
		
		
		
	}
	
}
