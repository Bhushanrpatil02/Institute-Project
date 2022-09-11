package com.yash.serviceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.model.Batch;
import com.yash.model.Course;
import com.yash.model.Faculty;
import com.yash.model.Student;
import com.yash.service.Yash;

/**
 * @author bhushan.rpatil
 *
 */
public class Hinjewadi implements Yash {

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public Course addCourse() {
		Course c = new Course();
		System.out.println("Enter Course Id");
		c.setCid(sc.nextInt());

		System.out.println("Enter Course Name");
		c.setCname(sc.next());

		clist.add(c);
		System.out.println(clist);
		return c;
	}

	@Override
	public void viewCourse() {
		for (Course course : clist) {
			System.out.println(course);
		}
	}

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		if (clist.isEmpty()) {
			System.out.println("Add Course first");
		} else {
			System.out.println("Enter Faculty Id");
			f.setFid(sc.nextInt());
			System.out.println("Enter faculty Name");
			f.setFname(sc.next());
			System.out.println("Enter course id to set faculty");
			int cid = sc.nextInt();
			for (Course course : clist) {
				if (course.getCid() == cid) {
					f.setCourse(course);
				} else {
					System.out.println("Course id not exist");
				}
			}

		}
		flist.add(f);
	}

	@Override
	public void viewFaculty() {
		for (Faculty fa : flist) {
			System.out.println(fa);
		}
	}

	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.println("Enter Batch Id");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch Name");
		b.setBname(sc.next());
		System.out.println("Enter faculty id to assigne  batch");
		int fid = sc.nextInt();
		for (Faculty f : flist) {
			if (f.getFid() == fid) {
				b.setFaculty(f);
			} else {
				System.out.println("Faculty id not exist");
			}

		}
		blist.add(b);
	}

	@Override
	public void viewBatch() {
		for (Batch batch : blist) {
			System.out.println(batch);
		}

	}

	@Override
	public void addStudent() {

		Student s = new Student();

		System.out.println("Enter Student id");
		s.setSid(sc.nextInt());
		System.out.println("Enter Student Name");
		s.setSname(sc.next());

		System.out.println("Enter batch id to add student in bid");
		int bid = sc.nextInt();
		for (Batch batch : blist) {
			if (batch.getBid() == bid) {
				s.setBatch(batch);
			} else {
				System.out.println("batch id not exist");
			}

		}
		slist.add(s);
	}

	@Override
	public void viewStudent() {

		for (Student st : slist) {
			System.out.println(st);
		}

	}

}
