package encapsulation;

public class TestEncapsulations {
	private String name;
	private String IdNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return IdNum;
	}

//Following codes are Methods
	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setIdNum(String newId) {
		IdNum = newId;
	}
}
