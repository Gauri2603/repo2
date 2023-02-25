package com.tns.usestatic;

public class Student {
	private int rollNo;
	private String name;
	private float percent;
	private static String classTeacher;
	private static int cnt;
	static {
		System.out.println("Static block is executed.........");
		cnt=202000;
		classTeacher="Sonal Borse";
	}
	static void show() {
		System.out.println("Counter is="+cnt);
		
	}
    public Student() {
    	System.out.println("Default Constructor");
    	cnt++;
    	rollNo=cnt;
    }
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percent=" + percent + ", classTeacher=" + classTeacher+"]";
	}
    
}
