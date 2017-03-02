
package p1;

import java.util.Scanner;

public class StudentView {
	
	public void printStudentDetails(String name, String idNumber) {
		System.out.println("Student:");
		System.out.println("Name: " + name);
		System.out.println("ID: " + idNumber);
	}
	
	public String[] getStudentDetails() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name and ID separated by comma: "); {
			return (kb.nextLine().split(","));
		}
	}
}
