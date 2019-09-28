package collection;

import data.Student;

public class Classroom {
	Student tail;
	
	/**
	 * Default constructor
	 */
	public Classroom() {
		
	}
	
	/**
	 * Add student to classroom
	 * @param name
	 * 		name of the student
	 * @param age
	 * 		age of the student
	 * @return updated classroom
	 */
	public Classroom addStudent(String name, int age) {
		Student newStudent = new Student(name, age);
		
		if (this.tail == null) {
			this.tail = newStudent;
		} else {
			newStudent.previous = this.tail;
			this.tail = newStudent;
		}
		return this;
	}
	
	/**
	 * Prints out the list of all the students
	 */
	public void printStudentList() {
		Student endOfList = this.tail;
		while(endOfList.previous != null) {
			System.out.println(endOfList.toString());
			endOfList = endOfList.previous;
		}
		System.out.println(endOfList.toString());
	}
}
