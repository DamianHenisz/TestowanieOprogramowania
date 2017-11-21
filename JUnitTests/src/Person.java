
public class Person {
	private int age;
	private String name;
	
	public Person() {
		
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public boolean isAdult() {
		if(age < 18) {
			return false;
		}		
		return true;
	}
	
	public String smile() {
		return ":)";
	}
}
