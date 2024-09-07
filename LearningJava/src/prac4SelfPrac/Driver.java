package prac4SelfPrac;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0;
		boolean flag = true;
		char yesNo;
		Course[] course = new Course[100];

		do {
			System.out.print("Course Title :");
			String courseTitle = scan.nextLine();
			System.out.print("Course Fee :");
			int fee = scan.nextInt();
			course[i] = new Course(courseTitle, fee);
			scan.nextLine();
			do {
				System.out.print("\nEnter student Name:");
				String name = scan.nextLine();
				course[i].addStudent(name);
				do {
					System.out.print("Add student again? (Y = Yes N = No):");
					yesNo = scan.next().charAt(0);
					if (Character.toUpperCase(yesNo) == 'Y') {
						flag = true;
					} else if (Character.toUpperCase(yesNo) == 'N') {
						flag = false;
					} else {
						System.err.println("\nWrong Input... Pls enter Y = Yes N = No");
					}
					scan.nextLine();
				} while (Character.toUpperCase(yesNo) != 'N' && Character.toUpperCase(yesNo) != 'Y');
			} while (flag == true);
			System.out.println("\nNo.    Name List          Course Title     Fee");
//			System.out.println("\nCourse Title :" + course[i].getCourseTitle());
//			System.out.println("Fee :" + course[i].getFeesPerStudent());
			String[] array = course[i].getStudentName();
//			System.out.println("Name List:");
			for (int a = 0; a < course[i].getNoOfStudent(); a++) {
				System.out.printf("%d %15s %20s %10.2f\n", a + 1, array[a],  course[i].getCourseTitle(), course[i].getFeesPerStudent());
			}
			System.out.println("Total fee: " + course[i].calcFeesCollected());
			System.out.println("Number of students enrolled:" + course[i].getNoOfStudent());
			System.out.print("\nEnter course again? (Y = Yes N = No):");
			yesNo = scan.next().charAt(0);
			i++;
			scan.nextLine();
		} while (Character.toUpperCase(yesNo) == 'Y' && i < 5);
		if (i == 5) {
			System.err.println("\nMaximum is 5 Courses");
		}
		System.err.println("\nBye bye");
	}
}
