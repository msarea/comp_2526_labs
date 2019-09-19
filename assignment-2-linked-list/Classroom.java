
public class Classroom {
	Person tail;
	
	public Classroom() {
		
	}
	
	public Classroom addPerson(String name, int age) {
		Person newPerson = new Person(name, age);
		
		if(this.tail == null) {
			this.tail = newPerson;
		} else {
			newPerson.previous = this.tail;
			this.tail = newPerson;
		}
		
		return this;
	}
	
	public void printList() {
		Person endOfList = this.tail;
		while(endOfList.previous != null) {
			System.out.println(endOfList.toString());
			endOfList = endOfList.previous;
		}
		if(endOfList.previous == null) {
			System.out.println(endOfList.toString());
		}
	}
}
