package com.yash.model;

/**
 * @author bhushan.rpatil
 *
 */
public class Faculty {

	private int fid;
	private String fname;
	private Course course;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {

		return "Faculty id: " + fid + " Faculty name: " + fname + " " + course;
	}
}
