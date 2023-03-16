package encapsulation;

public class RunEncapsulation {
	public static void main(String[] args) { // Engine
											 // ClassName referencevariable = new ClassName
		TestEncapsulations encap = new TestEncapsulations();
		
		encap.setName("Delima");
		
		encap.setAge(20);
		
		encap.setIdNum("XER234");

		System.out.println(" Name is :" + encap.getName() + " Age is:" + encap.getAge());
				

	}

}
