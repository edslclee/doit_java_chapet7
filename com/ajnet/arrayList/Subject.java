package com.ajnet.arrayList;

public class Subject {
	
	private String subjectName;
	private int subjectScore;
	/**
	 * @param subjectName
	 * @param subjectScore
	 */
	public Subject() {};
	
	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectScore() {
		return subjectScore;
	}
	public void setSubjectScore(int subjectScore) {
		this.subjectScore = subjectScore;
	}
	
	public void showSubjectInfo() {
		System.out.println(subjectName + " , " + subjectScore);
	}
		
}
