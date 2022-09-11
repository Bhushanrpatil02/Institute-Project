package com.yash.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.yash.model.Course;
import com.yash.serviceIMPL.Hinjewadi;

/**
 * @author bhushan.rpatil
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		Hinjewadi c = new Hinjewadi();
		boolean flag = true;
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		while (flag) {
			System.out.println("*********Welcome To YASH Institute***********");
			System.out.println("1.AddCourse");
			System.out.println("2.ViewCourse");
			System.out.println("3.AddFaculty");
			System.out.println("4.ViewFaculty");
			System.out.println("5.AddBatch");
			System.out.println("6.ViewBatch");
			System.out.println("7.AddStudent");
			System.out.println("8.ViewStudent");
			System.out.println("9.Exite");
			System.out.println("********************");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Course c1 = c.addCourse();
				int cid = c1.getCid();
				String cname = c1.getCname();
				String sql = "select * from course;";// insert into Faculty.

				break;
			case 2:
				c.viewCourse();
				break;
			case 3:
				c.addFaculty();
				break;
			case 4:
				c.viewFaculty();
				break;
			case 5:
				c.addBatch();
				break;
			case 6:
				c.viewBatch();
				break;
			case 7:
				c.addStudent();
				break;
			case 8:
				c.viewStudent();
				break;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("Incorrect Choice");
				break;

			}
		}

	}
}
