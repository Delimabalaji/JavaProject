package keywords;

public class StaticKeyword {
	public static String name="Ignite";    //global declaration
	public static void main(String[] args) {
		System.out.println("Under main method");
		
		StaticKeyword.myStaticMethod();    //call for static method
		
		StaticKeyword nonstatic =new StaticKeyword();   //call for non static method
		
		nonstatic.myNonStaticMethod();
		
		System.out.println(name+ "Under Main Method");
		
		
		
	}
	public static void myStaticMethod() {    //static method
		System.out.println("Underr Static method");
		System.out.println(name+"Under static Method");
		
	}
	public  void myNonStaticMethod()
	{
		System.out.println("Under Non Static Method");
		System.out.println(name+"Under Non Static Method");
		
	}

}
