package com.yash.model;

/**
 * @author bhushan.rpatil
 *
 */
public class Course {

	private int cid;
	private String cname;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {

		return "Course id: " + cid + " Course name: " + cname;
	}

}
