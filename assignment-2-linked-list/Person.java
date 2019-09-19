
public class Person {
	public int age;
	public String name;
	public Person previous;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public Person getPrevious() {
		return previous;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person: [name: " + name + ", age: " + age + "]";
	}
}
