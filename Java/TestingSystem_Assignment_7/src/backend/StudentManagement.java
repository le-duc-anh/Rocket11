/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import utils.IOStream;
import utils.ScannerUtils;


 public class StudentManagement {

	private List<Student> students;
	private String pathFile;

	public StudentManagement() {
		students = new ArrayList<>();
		pathFile = "StudentInformation.ser";
	}

	public void inputListStudents() {
		System.out.println("Input number student: ");
		int n = ScannerUtils.inputInt();

		// input list student
		for (int i = 0; i < n; i++) {
			students.add(new Student());
		}
	}

	public void printListStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void writeStudents() throws Exception {
		IOStream.writeObject(students, pathFile);
	}

	@SuppressWarnings("unchecked")
	public void readStudents() throws Exception {
		students = (List<Student>) IOStream.readObject(pathFile);
	}
}
