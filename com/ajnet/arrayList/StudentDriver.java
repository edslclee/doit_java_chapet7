package com.ajnet.arrayList;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(202001, "이철");
		Student std2 = new Student(202002, "이은실");
		
		std1.addSubject("국어", 90);
		std1.addSubject("영어", 90);
		
		std2.addSubject("국어", 80);
		std2.addSubject("영어", 80);
		std2.addSubject("수학", 90);
		
		std1.showStudentInfo();
		
		System.out.println("---------------------------------");
		
		std2.showStudentInfo();
		
	}

}
