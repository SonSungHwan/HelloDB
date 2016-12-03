package kr.ac.subject.model;

import javax.validation.constraints.NotNull;

public class Subject {

	private int year;
	private int semester;
	private String code;
	private String name;
	private String subjectcode;
	private int credit;
	
	public Subject() {
		
	}
	
	public Subject(int year, int semester, String code, String name, String subjectcode, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.subjectcode = subjectcode;
		this.credit = credit;
	}
	

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjectCode() {
		return subjectcode;
	}
	public void setSubjectCode(String subjectcode) {
		this.subjectcode = subjectcode;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String toString() {
		return  year + "|" + semester + "|" + code + "|" + name + "|" + subjectcode + "|" + credit;
	}
	
}
