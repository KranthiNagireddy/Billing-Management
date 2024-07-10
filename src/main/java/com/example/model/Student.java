package com.example.model;

public class Student {
	private int Sid;
	private String Sname;
	private double Sfee;
	@Override
	public String toString() {
		return "Sid=" + Sid + ", Sname=" + Sname + ", Sfee=" + Sfee;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public double getSfee() {
		return Sfee;
	}
	public void setSfee(double sfee) {
		Sfee = sfee;
	}
	public Student(int sid, String sname, double sfee) {
		super();
		Sid = sid;
		Sname = sname;
		Sfee = sfee;
	}
	public Student() {
		Sid = 100;
		Sname = "kranthi";
		Sfee = 10000.0;
	}
}
