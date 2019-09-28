package data;

public abstract class Person {
	private int age;
	private String name;
	
	/**
	 * Default constructor.
	 */
	public Person() {
		
	}
	
	/**
	 * Person profile
	 * @param name
	 * 		the name of the person
	 * @param age
	 * 		the age of the person
	 */
	public Person(String name, int age) {
		setAge(age);
		setName(name);
	}
	
	/**
	 * @param name
	 * 		the name to set.
	 */
	public void setName(String name) {
		if (name != null && !name.trim().isEmpty()) {
			this.name = formatName(name);
		}
	}

	/**
	 * 
	 * @param age
	 * 		age of the person to set
	 */
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	
	private String formatName(String name) {
		if (name != null && !name.trim().isEmpty()) {
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return name;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "name: " + name + ", age: " + age;
	}

	public abstract int calculateMonthlySpendings();
}
