package kr.ac.subject.dao;

//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.subject.model.Subject;

@Repository
public class SubjectDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from ssh";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	
	public boolean insert(Subject subject) {

		int year = subject.getYear();
		int semester = subject.getSemester();
		String code = subject.getCode();
		String name = subject.getName();
		String subjectcode = subject.getSubjectCode();
		int credit = subject.getCredit();

		String sqlStatement = "insert into ssh (year, semester, code, name, subjectcode, credit) values (?, ?, ?, ?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, code, name, subjectcode, credit }) == 1);

	}
	
	public Subject getSubject(String code) {
		String sqlStatement = "select * from offers where code=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { code }, new NewSubject());
	}

	public List<Subject> getSubjects(int year, int semester) {

		String sqlStatement = "select * from ssh where year = ? && semester = ?";

		return jdbcTemplateObject.query(sqlStatement, new Object[]{year, semester}, new NewSubject());

	}
	
	public List<Subject> getSubjectsAll() {

		String sqlStatement = "select * from ssh";
		return jdbcTemplateObject.query(sqlStatement, new NewSubject());

	}
	
	public List<Subject> getSubjects2017() {

		String sqlStatement = "select * from ssh where year = 2017 && semester = 1";
		return jdbcTemplateObject.query(sqlStatement, new NewSubject());

	}



}
