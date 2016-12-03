package kr.ac.subject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.subject.dao.SubjectDAO;
import kr.ac.subject.model.Subject;

@Service
public class SubjectService {

	private SubjectDAO subjectDao;
	
	@Autowired
	public void setSubjectDao(SubjectDAO subjectDao) {
		this.subjectDao = subjectDao;
	}
	
	public void insert(Subject subject) {
		subjectDao.insert(subject);
	}
	
	public List<Subject> getCurrent(int year, int semester){
		return subjectDao.getSubjects(year, semester);
	}
	
	public List<Subject> getCurrentAll(){
		return subjectDao.getSubjectsAll();
	}
	
	public List<Subject> getCurrent2017(){
		return subjectDao.getSubjects2017();
	}


}
