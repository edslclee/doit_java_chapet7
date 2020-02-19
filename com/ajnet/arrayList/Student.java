package com.ajnet.arrayList;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	/**
	 * @param studentID
	 * @param studentName
	 * @param subjectList
	 */
	public Student() {
		
	}
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	//과목과 과목 점수를 생성하고 ArrayList인 subjectList에 추가
	
	public void addSubject(String subjectName, int subjectScore) {
		
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		System.out.println("Student ID : " + studentID);
		System.out.println("Student Name : " + studentName);
		/*
		for(int i = 0; i < subjectList.size(); i++) {
			
			System.out.println("과목 : " + subjectList.get(i).getSubjectName());
			System.out.println("과목 : " + subjectList.get(i).getSubjectcore());
		}
		*/
		int total = 0;
		int average = 0;
		for(Subject subject: subjectList) {
			System.out.println("과목  명 : " + subject.getSubjectName());
			System.out.println("과목점수 : " + subject.getSubjectScore());
			total += subject.getSubjectScore() ;
		}
		System.out.println("총 점수 : " + total);
		System.out.println("평균점수:" + total/subjectList.size());
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

		
}
